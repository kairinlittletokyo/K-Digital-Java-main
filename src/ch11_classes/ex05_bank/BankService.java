package ch11_classes.ex05_bank;

import java.util.List;
import java.util.Scanner;

public class BankService {
    private Scanner scanner = new Scanner(System.in);
    private BankRepository bankRepository = new BankRepository();


    public void save() {
        System.out.print("가입자 이름: ");
        String clientName = scanner.next();

        // 중복 체크 확인 변수
        boolean isDuplicate;
        String accountNumber;

        do {
            System.out.print("희망하는 계좌번호: ");
            accountNumber = scanner.next();

            // 계좌번호 중복 체크
            isDuplicate = bankRepository.NumberDuplicate(accountNumber);

            if (isDuplicate) {
                System.out.println("이미 사용 중인 계좌번호입니다. 다시 입력해주세요.");
            }

        } while (isDuplicate);

        System.out.print("계좌 비밀번호: ");
        String clientPass = scanner.next();

        // 가입일자 자동 저장
        String clientCreatedAt = BankUtil.getCurrentDate();

        // ClientDTO 객체 생성
        ClientDTO clientDTO = new ClientDTO(clientName, accountNumber, clientPass, clientCreatedAt);

        // 저장
        boolean result = bankRepository.save(clientDTO);

        if (result) {
            System.out.println("계좌가 성공적으로 등록되었습니다.");
        } else {
            System.out.println("계좌 등록에 실패하였습니다.");
        }
    }

    public void checkBalance() {
        System.out.print("계좌번호 입력: ");
        String accountNumber = scanner.next();
        ClientDTO clientDTO = bankRepository.searchAccountNumber(accountNumber);

        if (clientDTO != null) {
            System.out.println("잔액: " + clientDTO.getBalance());
        } else {
            System.out.println("없는 계좌번호입니다.");
        }
    }

    public void deposit() {
        System.out.print("계좌번호 입력: ");
        String accountNumber = scanner.next();
        ClientDTO clientDTO = bankRepository.searchAccountNumber(accountNumber);

        if (clientDTO != null) {
            System.out.print("입금액 입력: ");
            long depositAmount = scanner.nextLong();

            if (depositAmount > 0) {
                clientDTO.setBalance(clientDTO.getBalance() + depositAmount);
                System.out.println(depositAmount + "원이 입금되었습니다.");

                // 입금 내역 기록
                AccountDTO depositDTO = new AccountDTO(accountNumber, depositAmount, 0, BankUtil.getCurrentDate());
                bankRepository.bankHistory(depositDTO);

            } else {
                System.out.println("입금액은 0원보다 커야 합니다.");
            }
        } else {
            System.out.println("없는 계좌번호입니다.");
        }
    }

    public void withdraw() {
        System.out.print("계좌번호 입력: ");
        String accountNumber = scanner.next();
        System.out.print("비밀번호 입력: ");
        String clientPass = scanner.next();
        System.out.print("출금액 입력: ");
        long withdrawAmount = scanner.nextLong();

        ClientDTO clientDTO = bankRepository.searchAccountNumber(accountNumber);

        if (clientDTO == null) {
            System.out.println("계좌번호가 틀렸습니다.");
            return;
        }

        if (!clientDTO.getClientPass().equals(clientPass)) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }

        if (withdrawAmount > clientDTO.getBalance()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        boolean result = bankRepository.withdraw(accountNumber, clientPass, withdrawAmount);

        if (result) {
            System.out.println(withdrawAmount + "원이 출금되었습니다.");
        } else {
            System.out.println("출금 실패. 계좌번호, 비밀번호, 출금액을 확인하세요.");
        }
    }


    public void BankingHistory() {
        System.out.print("계좌번호 입력: ");
        String accountNumber = scanner.next();
        ClientDTO clientDTO = bankRepository.searchAccountNumber(accountNumber);

        if (clientDTO == null) {
            System.out.println("계좌번호가 틀렸습니다.");
            return;
        }

    }

    public void showHistory() {

            System.out.print("계좌번호 입력: ");
            String accountNumber = scanner.next();
            ClientDTO clientDTO = bankRepository.searchAccountNumber(accountNumber);

            if (clientDTO == null) {
                System.out.println("계좌번호가 틀렸습니다.");
                return;
            }

            while (true) {
                System.out.println("1.전체내역 | 2.입금내역 | 3.출금내역 | 4.종료");
                System.out.print("메뉴 선택: ");
                int menuChoice = scanner.nextInt();

                if (menuChoice == 1) {
                    showAllHistory(accountNumber);
                } else if (menuChoice == 2) {
                    showDepositHistory(accountNumber);
                } else if (menuChoice == 3) {
                    showWithdrawHistory(accountNumber);
                } else if (menuChoice == 4) {
                    break;
                } else {
                    System.out.println("잘못된 메뉴 선택입니다. 다시 입력해주세요.");
                }
            }
        }

        private void showAllHistory(String accountNumber) {
            List<AccountDTO> allHistory = bankRepository.getAllHistory(accountNumber);
            printHistory(allHistory);
        }

        private void showDepositHistory(String accountNumber) {
            List<AccountDTO> depositHistory = bankRepository.getDepositHistory(accountNumber);
            printHistory(depositHistory);
        }

        private void showWithdrawHistory(String accountNumber) {
            List<AccountDTO> withdrawHistory = bankRepository.getWithdrawHistory(accountNumber);
            printHistory(withdrawHistory);
        }

        private void printHistory(List<AccountDTO> historyList) {
            if (historyList.isEmpty()) {
                System.out.println("내역이 없습니다.");
            } else {
                for (AccountDTO history : historyList) {
                    System.out.println(history);
                }
            }
        }
    }

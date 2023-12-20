package ch11_classes.ex05_bank;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankRepository {
    private List<ClientDTO> clientList = new ArrayList<>();
    private List<AccountDTO> bankingList = new ArrayList<>();

    public boolean save(ClientDTO clientDTO) {
        return clientList.add(clientDTO);
    }

    // 계좌번호 중복 체크
    public boolean NumberDuplicate(String accountNumber) {
        for (ClientDTO client : clientList) {
            if (accountNumber.equals(client.getAccountNumber())) {
                return true; // 중복된 계좌번호가 있으면 true 반환
            }
        }
        return false; // 중복된 계좌번호가 없으면 false 반환
    }

    public ClientDTO searchAccountNumber(String accountNumber) {
        for (ClientDTO clientDTO : clientList) {
            if (accountNumber.equals(clientDTO.getAccountNumber())) {
                return clientDTO;
            }
        }
        return null;
    }

    public void bankHistory(AccountDTO accountDTO) {
        bankingList.add(accountDTO);

    }

    public boolean withdraw(String accountNumber, String clientPass, long withdrawAmount) {
        ClientDTO clientDTO = searchAccountNumber(accountNumber);

        if (clientDTO != null && clientDTO.getClientPass().equals(clientPass) && clientDTO.getBalance() >= withdrawAmount) {
            clientDTO.setBalance(clientDTO.getBalance() - withdrawAmount);
            // 출금 내역 기록
            AccountDTO withdrawDTO = new AccountDTO(accountNumber, 0, withdrawAmount, BankUtil.getCurrentDate());
            bankingList.add(withdrawDTO);
            return true;
        }
        return false;

    }
    public List<AccountDTO> getAllHistory(String accountNumber) {
        List<AccountDTO> result = new ArrayList<>();
        for (AccountDTO history : bankingList) {
            if (history.getAccountNumber().equals(accountNumber)) {
                result.add(history);
            }
        }
        return result;
    }

    public List<AccountDTO> getDepositHistory(String accountNumber) {
        List<AccountDTO> result = new ArrayList<>();
        for (AccountDTO history : bankingList) {
            if (history.getAccountNumber().equals(accountNumber) && history.getDeposit() > 0) {
                result.add(history);
            }
        }
        return result;
    }

    public List<AccountDTO> getWithdrawHistory(String accountNumber) {
        List<AccountDTO> result = new ArrayList<>();
        for (AccountDTO history : bankingList) {
            if (history.getAccountNumber().equals(accountNumber) && history.getWithdraw() > 0) {
                result.add(history);
            }
        }
        return result;
    }

}








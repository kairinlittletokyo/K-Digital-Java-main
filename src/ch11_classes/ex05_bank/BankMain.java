package ch11_classes.ex05_bank;


import java.util.Scanner;

public class BankMain {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        int selectNo = 0;
        BankService bankService = new BankService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.신규 계좌 등록 | 2.잔액 조회 | 3.입금 | 4.출금 | 5.입출금 내역 조회 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();

            if (selectNo == 1) {
                bankService.save();
            } else if (selectNo == 2) {
                bankService.checkBalance();
            } else if (selectNo == 3) {
                bankService.deposit();
            } else if (selectNo == 4) {
                bankService.withdraw();
            } else if (selectNo == 5) {
                bankService.showHistory();
            } else if (selectNo == 0) {
                System.out.println("종료합니다.");
                run = false;
            } else {
                System.out.println("올바른 메뉴를 선택하세요.");
            }
        }
    }
}
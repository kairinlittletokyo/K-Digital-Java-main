package ch08_string;

import java.util.Scanner;

public class Ex01_test {
    public static void main(String[] args) {

        boolean run = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("메시지를 입력하세요: ");
        String text = "";
        String over = "종료";

        while (run) {
            text = scanner.nextLine();
            System.out.println(text);

            if(text.equals(over)){
                break;
            }
        }
    }
}


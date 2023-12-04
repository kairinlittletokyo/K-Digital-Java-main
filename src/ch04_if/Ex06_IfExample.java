package ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {
	
	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력받아서
		 * 3의 배수인지, 5의 배수인지 또는 3과 5의 공배수인지, 아무것도 아닌지를 출력
		 */
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if (num % 3 == 0 || num % 5 == 0) {
			if (num % 3 != 0) { // 5의 배수 
				System.out.println("5의 배수입니다");
			} else if (num % 5 != 0) { // 3의 배수 
				System.out.println("3의 배수입니다");
			} else { // 3와 5의 공배수 
				System.out.println("3과 5의 공배수입니다");
			}
		} else { // 아무것도 아님 
			System.out.println("아무것도 아닙니다ㅏ");
		}
	}

}

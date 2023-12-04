package ch02_operator;

public class Ex01_ArithmeticOperator {

	public static void main(String[] args) {
		// 산술연산자
		/**
		 * num1, num2 두개의 정수형 변수를 선언하고 값은 마음대로
		 * 두 변수의 +, -, *, /, % 연산 결과를 print() 를 활용하여 출력해봅시다.
		 * 출력 방법
		 * System.out.println(num1 + num2)
		 */
		int num1 = 10, num2 = 5;
		System.out.println("num1 + num2 = " + num1 + num2); // 문자열로 인식
		System.out.println("num1 + num2 = " + (num1 + num2)); // 정수 먼저 계산
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		// 계산 결과 변수 선언
		System.out.println("---계산 결과 변수 선언---");
		int result = num1 + num2;
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);
		result = num1 * num2;
		System.out.println(result);
		result = num1 / num2;
		System.out.println(result);
		result = num1 % num2;
		System.out.println(result);
		
		// 계산 결과 변수를 따로 선언
		System.out.println("---계산 결과 변수를 따로 선언---");
		int sumResult = num1 + num2;
		System.out.println(sumResult);
		int subResult = num1 - num2;
		System.out.println(subResult);
		int mulResult = num1 * num2;
		System.out.println(mulResult);
		int divResult = num1 / num2;
		System.out.println(divResult);
		int remainResult = num1 % num2;
		System.out.println(remainResult);
	}
	
}

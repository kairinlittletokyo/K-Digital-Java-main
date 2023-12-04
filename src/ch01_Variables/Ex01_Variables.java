package ch01_variables;

public class Ex01_Variables {
	
	public static void main(String[] args) {
		// 본인의 이름(name), 나이(age), 키(height), 주소(address), 전화번호(mobile)
		// 입력할 수 있는 변수를 각각 선언해봅시다.
		String name = "김재희";
		int age = 27;
		double height = 161.0;
		String address = "인천";
		String mobile = "010-1234-5678";
		
		System.out.println("name"); // 변수가 아닌 문자열이 출력됨
		// 변수값 출력
		System.out.println("저의 이름은 " + name + " 입니다.");
		System.out.println("저의 나이는 " + age + " 입니다.");
		System.out.println("저의 키는 " + height + " 입니다.");
		System.out.println("저의 주소는 " + address + " 입니다.");
		System.out.println("저의 전화번호는 " + mobile + " 입니다.");
	}

}

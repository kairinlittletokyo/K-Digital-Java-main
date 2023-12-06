package ch07_while;

public class Ex03_Random {
    public static void main(String[] args) {
        // Random 메서드: 지정한 범위 내에서 숫자를 무작위로 발생시킴
        // 1~10 사이 정수
        // (int) (Math.random() * 10) + 1

        // Math 클래스의 random() 메서드
        // 메서드 : 어떤 타입의 값을 주는 지 출력(리턴타입) => (0.0~1.0)
        System.out.println(Math.random());
        // 결과 값에 10을 곱해서 정수 부분을 만듦 (0~10)
        System.out.println(Math.random() * 10);
        // 결과 값에 45을 곱해서 정수 부분을 만듦 (0~45)
        System.out.println(Math.random() * 45);
        // 실수(double) => 정수(int) : 형변환 (type conversion)
        System.out.println((int)(Math.random() * 10)); // 0 이상 ~ 9 이하 정수
        System.out.println(Math.random() * 10 + 1);
        System.out.println(Math.random() * 45 + 1);
        // 형변환
        int int1 = 10;
        double double1 = 1.2345678;

        // 정수형 변수를 실수형 변수에 대입
        double double2 = int1;
        System.out.println("double2 = " + double2);

        // 실수형 변수를 정수형 변수에 대입 (강제형변환)
        // 소숫점 이하의 값은 사라지게 된다.
        int int2 = (int) double1; // 형변환 에러
        System.out.println("int2 = " + int2);

    }
}

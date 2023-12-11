package ch10_class.ex2;

public class StudentMain {

    public static void main(String[] args) {
        //student 클래스 객체 선언
        Student student1 = new Student();
        //student1 이라는 상자를 만든것이고, name major mobile 칸을 3개 만들어서
        // 값을 3개 담은 것 .

        // Student 클래스의 필드에 값 저장하기
        student1.studentName = "학생1";
        student1.studentMajor = "컴퓨터공학";
        student1.studentMobile = "010-1234-5678";
        System.out.println("student1.studentName = " + student1.studentName);
        System.out.println("student1.studentMajor = " + student1.studentMajor);
        System.out.println("student1.studentMobile = " + student1.studentMobile);
        //학생 하나 더 만들기(새로운 student 객체 선언) ★
        Student student2 = new Student();
        student2.studentName = "학생2";
        student2.studentMajor = "경영학";
        student2.studentMobile = "010-6666-7777";
    }
}

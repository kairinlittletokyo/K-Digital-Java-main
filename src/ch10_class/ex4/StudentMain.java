package ch10_class.ex4;

public class StudentMain {
    public static void main(String[] args) {
        //기본 생성자로 student1 객체 생성
        Student student1 = new Student();
        student1.studentName = "학생1";
        student1.studentMobile = "11111";
        student1.studentMajor = "통계학";
        System.out.println("student1.studentName = " + student1.studentName);
        //얘는 지금 필드와 객체 둘 다 쓰고있음.
        //그러나 student2는 아직 필드를 활용하지 않음
        // 매개변수 있는 생성자로 student2 객체 생성
        Student student2 = new Student("학생2", "컴공과", "010 5555 5555" );
        System.out.println("student2.studentName = " + student2.studentName);



    }



}

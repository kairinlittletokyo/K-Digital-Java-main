package ch10_class.ex4;

public class Student {


    String studentMobile;
    String studentMajor;
    String studentName;
    public Student() {

}

    public Student(String studentName, String studentMajor, String studentMobile) {
//        System.out.println("studentName = " + studentName + ", studentMajor = " + studentMajor + ", studentMobile = " + studentMobile);
//        전달 받은 매개변수 값을 필드에 담기
        this.studentName = studentName;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
        //this => 필드를 가르킴
        }
    }

package ch10_class.ex9;

public class Student {
    /*
    필드
    이름 (studentName)
    학번 (studentNumber)
    학과 (studentMajor)
    전화번호 (studentMobile)
     각 필드의 getter/setter 메서드
       */
    private String studentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;

    //기본 생성자
    public Student() {
    }

    // 모든 필드를 매개변수로 하는 생성자 ------
    public Student(String studentName, String studentMajor, String studentMobile, String studentNumber) {
        this.studentName = studentName;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
        this.studentNumber = studentNumber;
    }
    //각 필드에 getter / setter 메서드

    // studentName setter ------
    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }
    // studentName getter ------
    public String getstudentName() {
        return studentName;
    }
    // studentNumber setter ------
    public void setstudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    // studentNumber getter ------
    public String getstudentNumber() {
        return studentNumber;
    }

    // studentMajor setter ------
    public void setstudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    // studentMajor getter ------
    public String getstudentMajor() {
        return studentMajor;
    }

    // studentMobile setter ------
    public void setstudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    // studentMobile getter ------
    public String getstudentMobile() {
        return studentMobile;
    }
    //필드에 저장된 값을 출력하는 print() 문 ------
    public void print(){
        System.out.println("이름 : " + studentName);
        System.out.println("학과 : " + studentMajor);
        System.out.println("번호 : " + studentMobile);
        System.out.println("학번 : " + studentNumber);
    }

}

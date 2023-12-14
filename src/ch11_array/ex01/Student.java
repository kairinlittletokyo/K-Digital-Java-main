package ch11_array.ex01;

public class Student {
    /**
     *필드
     * 관리번호 (id)
     * 이름 (studentName)
     * 학번 (studentNumber)
     * 학과 (studentMajor)
     * 전화번호 (studentMoblie)
     *
     * getter / setter
     *
     * 생성자 2가지
     *
     * toString
     */

    private String studentName;
    private Long id;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;

    /////////생성자/////////
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", id=" + id +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }

    public Student(String studentName, String studentNumber, String studentMobile, String studentMajor, long id){
    this.studentMajor = studentMajor;
    this.studentName = studentName;
    this.studentNumber = studentNumber;
    this.studentMobile = studentMobile;
    this.id = id;

    }

///////////////// get set ////////////////////
    public Long getId() {
        return id;}
    public String getStudentName() {
        return studentName;}
    public String getStudentNumber() {
        return studentNumber;}
    public String getStudentMajor() {
        return studentMajor;}
    public String getStudentMobile() {
        return studentMobile;}
    public void setStudentName(String studentName) {
        this.studentName = studentName;}
    public void setId(Long id) {
        this.id = id;}
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;}
    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;}
    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;}


}

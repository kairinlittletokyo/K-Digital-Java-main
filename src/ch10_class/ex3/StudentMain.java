package ch10_class.ex3;

public class StudentMain {
    public static void main(String[] args) {


        Student student1 = new Student();

        //매개변수가 있는 생성자로 객체 선언
        Student student2 = new Student("이름1");
        //매개변수가 2개 있는 생성자로 객체 선언
        Student student3 = new Student("이름2", "학과2");
        //매개변수가 3개 있는 생성자로 객체 선언
        Student student4 = new Student("이름3", "학과3", "010 - 3333- 3333");

    }
}

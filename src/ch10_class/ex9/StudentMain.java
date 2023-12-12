package ch10_class.ex9;

import ch10_class.ex5.Book;

public class StudentMain {
    public static void main(String[] args) {


        Student student = new Student();

        Student student1 = new Student();
        student1.setstudentMajor("감귤포장학과");
        student1.setstudentMobile("010 5555 5555");
        student1.setstudentName("김제주도");
        student1.setstudentNumber("19학번");
        student1.print();

        Student student2 = new Student("김서귀포", "감귤포장학과", "010 5555 5555", "21학번");
        student2.print();

    }
}

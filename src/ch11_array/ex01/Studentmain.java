package ch11_array.ex01;

import java.util.ArrayList;
import java.util.List;

public class Studentmain {
    public static void main(String[] args) {

        //Student 클래스 객체를 담기 위한 List
        // studentList

        List<Student> studentList = new ArrayList<>();
      //  studentList.add(12); 작동 X
        String studentName = "학생1";
       // Student 객체 추가
        Student student1 = new Student("학생1", "20231111", "010555" ,"현대무용", 1L);
        Student student2 = new Student("학생2", "19103032", "0105555", "police", 2L);
        // studentList 추가
        studentList.add(student1);
        studentList.add(student2);

        System.out.println("studentList = " + studentList.get(0));
        System.out.println("studentList = " + studentList.get(1));

        Student a = studentList.get(0);
        System.out.println("a = " + a);
        System.out.println(a.getStudentName());

        //1번 인덱스에 담긴 객체의 학과만 출력
        System.out.println(studentList.get(1).getStudentMajor());

        //반복문
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("studentList = " + studentList.get(i));
            //학생의 이름만 따로 출력
            System.out.println("studentList = " + studentList.get(i).getStudentName());
            //for each
            for(Student stu: studentList) {
                System.out.println("stu = " + stu);
                System.out.println("stu = " + stu.getStudentName());

            }
        }
    }
}

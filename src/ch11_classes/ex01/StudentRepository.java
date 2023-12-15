package ch11_classes.ex01;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    //모든 학생 정보를 관리하는 저장소 역할의 리스트
    //저장, 수정, 삭제 등의 처리는 Repository 에서만 이루어지도록 하기


    private static List<StudentDTO> studentDTOList = new ArrayList<>();

    public void method1() {
        System.out.println("StudentRepository.method1");
    }

    /**
     * method name: method2
     * parameter: String
     * return: x
     * 실행내용: 전달받은 매개변수 값 출력
     */
    public void method2(String str1) {
        System.out.println("str1 = " + str1);
    }


    /**
     * method name : method3
     * parameter : StudentDTO
     * return : boolean
     * 실행내용 : 전달받은 DTO 객체를 List에 저장하고
     * 결과를 리턴
     */


    public boolean method3(StudentDTO studentDTO) {
        System.out.println("studentDTO = " + studentDTO);
        boolean result = studentDTOList.add(studentDTO);
        return studentDTOList.add(studentDTO);


    }
}




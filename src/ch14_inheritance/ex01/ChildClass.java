package ch14_inheritance.ex01;

public class ChildClass extends ParentClass {

    public ChildClass(){
        System.out.println("자식 기본 생성자");
    }

    @Override
    public void hello(){
        System.out.println("chil");
    }
}

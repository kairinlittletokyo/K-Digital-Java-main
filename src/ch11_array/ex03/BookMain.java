package ch11_array.ex03;

import ch11_array.ex01.Student;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

    // Book 객체를 담기위한 bookList 객체 선언

    // 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가

    // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가

    // for를 이용하여 bookList의 전체 데이터 출력

    // for each를 이용하여 bookList의 전체 데이터 출력

    // list의 0번 인덱스에 담긴 책의 가격을 50000으로 변경

    // list의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경

    // for를 이용하여 bookList의 전체 데이터 출력

    // for each를 이용하여 bookList의 전체 데이터 출력

    public static void main(String[] args) {


// Book 객체를 담기위한 bookList 객체 선언
        List<Book> bookList = new ArrayList<>();
        Book book = new Book();

// 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가
        Book book1 = new Book();
        book1.setId(1L);
        book1.setBookTitle("절명시");
        book1.setBookAuthor("오다 노부나가");
        book1.setBookPrice(59000);
        book1.setBookPublisher("일본 에도시대");
        bookList.add(book1);

// 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가
        Book book2 = new Book(1L, "절명시", "오다 노부나가", 59000, "일본");
        bookList.add(book2);


// for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList = " + bookList.get(i));
        }

// for each를 이용하여 bookList의 전체 데이터 출력
        for (Book buk : bookList) {
            System.out.println("buk = " + buk);

// list의 0번 인덱스에 담긴 책의 가격을 50000으로 변경
            bookList.get(0).setBookPrice(50000);


            //list의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경
            bookList.get(1).setBookPublisher("안녕하세요");


            for (int i = 0; i < bookList.size(); i++) {
                System.out.println("bookList = " + bookList.get(i));

                for (Book buk2 : bookList) {
                    System.out.println("buk = " + buk2);
                }
            }
        }
    }
}

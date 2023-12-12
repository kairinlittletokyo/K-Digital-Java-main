package ch10_class.ex5;

public class BookMain {
    public static void main(String[] args) {
        //기본생성자로 객체 만들고
        //필드값 채우기
Book book = new Book();
        book.bookTitle = "이명박 자서전";
        book.bookAuthor = "이명박";
        book.bookPrice = "23,000원";
        book.bookPublisher = "새누리당";
        book.isbn = "1123132";
        //매개변수 2개있는 생성자로 객체 만들기
Book book1 = new Book("이명박 자서전", "이명박");
        //모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
Book book2 = new Book("이명박 자서전", "이명박", "좋은책방", "미상", "23,000원" );
        


    }

}

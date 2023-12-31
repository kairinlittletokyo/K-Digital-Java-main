package ch10_class.ex5;

public class Book {

    /*
     제목(bookTitle)
     저자(bookAuthor)
     출판사(bookPublisher)
     isbn(isbn)
     가격(bookPrice)
     */
    String bookTitle;

    String bookAuthor;

    String bookPublisher;

    String isbn;

    String bookPrice;


    //기본 생성자
    public Book(){
        System.out.println("기본 생성자");
    }
    //제목, 저자를 매개변수로 하는 생성자
    // (매개변수 값을 필드에 담아야 함)
    public Book(String bookTitle, String bookAuthor) {
        System.out.println("bookTitle = " + bookTitle + " bookAuthor = " + bookAuthor);
    }
    //모든 필드값을 매개변수로 하는 생성자
    public Book(String bookTitle, String bookAuthor, String bookPublisher, String isbn, String bookPrice){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
        this.isbn = isbn;
        System.out.println("bookTitle = " + bookTitle + " bookAuthor = " + bookAuthor + " bookPublisher = " + "착한 책" + " bookPrice =" + bookPrice + " isbn =" + isbn );
    }

}


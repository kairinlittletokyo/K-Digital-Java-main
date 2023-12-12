package ch10_class.ex8;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book();
        //book.booktitle = "이명박 자서전";
        book.setBooktitle("제1");
        String title = book.getBooktitle();
        System.out.println("title = " + title);

        book.setBookAuthor("저자1");
        System.out.println(book.getBookAuthor());

    }
}


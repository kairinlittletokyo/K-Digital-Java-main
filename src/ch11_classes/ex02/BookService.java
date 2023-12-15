package ch11_classes.ex02;

import ch11_classes.ex01.StudentDTO;

import java.util.List;
import java.util.Scanner;

public class BookService {
    /**
     * 도서등록 메서드
     * name: save
     * parameter: x
     * return: x
     * 실행내용
     *      스캐너로 도서명, 저자, 가격, 출판사정보를 입력받고
     *      BookDTO 객체에 담아서 Repository로 전달하여 저장이 되도록 함
     *      등록 여부를 출력한다.(등록성공 or 등록실패)
     */


    /**
     * 도서조회 메서드
     * name: findById
     * parameter: x
     * return: x
     * 실행내용
     * id를 입력받고 Repository로 부터 id에 해당 하는 도서 정보를 출력
     * 없으면 없다고 출력
     */


    public void save() {

        BookRepository bookRepository = new BookRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.print("도서명을 입력해주세요.");
        String bookTitle = scanner.next();
        System.out.print("저자를 입력해주세요.");
        String bookAuthor = scanner.next();
        System.out.print("가격을 입력해주세요.");
        int bookPrice = scanner.nextInt();
        System.out.print("출판사를 입력해주세요.");
        String bookPublisher = scanner.next();


        BookDTO bookDTO = new BookDTO(bookTitle, bookAuthor, bookPrice, bookPublisher);
        boolean result = bookRepository.save(bookDTO);
        if (result) {
            System.out.println("성공적으로 등록하였습니다.");
        } else {
            System.out.println("도서 등록에 실패하였습니다.");
        }


        /**
         * 도서조회 메서드
         * name: findById
         * parameter: x
         * return: x
         * 실행내용
         *      id를 입력받고 Repository로 부터 id에 해당 하는 도서 정보를 출력
         *      없으면 없다고 출력
         */
        public void findById () {
            System.out.println("도서 조회를 시작합니다.");
            System.out.print("조회할 도서의 ID를 입력하세요");
            Long id = scanner.nextLong();
            BookDTO bookDTO = bookRepository.findById(id);

            if (bookDTO != null) {
                System.out.println(bookDTO);
            } else {
                System.out.println("해당 ID의 도서는 없습니다.");


                }
            }
        }
    }

    public void findAll() {
        System.out.println("등록된 책들의 목록입니다");
        List<BookDTO> bookList = bookRepository.findAll();

        if (bookList.isEmpty()) {
            System.out.println("등록된 도서가 없습니다");

        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }
    }
}




        /**
         * 도서목록 메서드
         * name: findAll
         * parameter: x
         * return: x
         * 실행내용
         *      Repository로 부터 목록을 리턴 받아서 목록에 있는 모든 정보를 출력
         */






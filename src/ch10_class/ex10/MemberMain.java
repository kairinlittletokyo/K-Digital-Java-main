package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         *      회원가입 정보는 스캐너로 받음.
         * 2. 로그인
         * 3. 종료
         */
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        Member member = null;

        while (run) {
            System.out.println("■-------------------------------■");
            System.out.println("  1.회원가입 | 2.로그인 | 3.종료");
            System.out.println("■-------------------------------■");
            System.out.print("원하시는 메뉴를 입력해주세요 : ");
            int selectmenu = scanner.nextInt();

            if (selectmenu == 1) {
                member = new Member();
                System.out.print("이메일을 입력해주세요 : ");
                String Email = scanner.next();
                member.setMemberEmail(Email);

                System.out.print("비밀번호를 입력해주세요 : ");
                String Pass = scanner.next();
                member.setMemberPassword(Pass);

                System.out.print("성함을 입력해주세요 : ");
                String Name = scanner.next();
                member.setMemberName(Name);

                System.out.print("전화번호를 입력해주세요 : ");
                String Number = scanner.next();
                member.setMemberMobile(Number);


                System.out.println("회원가입이 완료되었습니다.");



            }else if(selectmenu == 2) {
                System.out.println("이메일 : ");
                String loginE = scanner.next();

                System.out.println("비밀번호 : ");
                String loginP = scanner.next();

                boolean loginResult = member.memberLogin(loginE, loginP);


                }
            }
        }
    }

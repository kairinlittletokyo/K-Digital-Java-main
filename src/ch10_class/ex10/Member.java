package ch10_class.ex10;

/**
 * 회원 정보 클래스
 * 회원 정보
 *    - 이메일(memberEmail)
 *    - 비밀번호(memberPassword)
 *    - 이름(memberName)
 *    - 전화번호(memberMobile)
 *
 *
 *  getter/setter
 *  생성자 2가지
 *  로그인 처리 메서드
 *    name: memberLogin
 *    parameter: memberEmail, memberPassword
 *    return type: boolean
 *    실행내용: 이메일, 비밀번호가 일치하면 true,
 *
 *일치하지 않으면 false 리턴
 */


public class Member {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

    //-------------getter / setter ---------------
    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    //-------------getter / setter ---------------


    // 생성자 2가지

    //기본 생성자
    public Member() {

    }

    //매개변수가 있는 생성자
    public Member(String Email, String Number, String Name, String Pass) {
        this.memberEmail = Email;
        this.memberMobile = Number;
        this.memberName = Name;
        this.memberPassword = Pass;
    }

    public boolean memberLogin(String Email, String Pass) {
        if (this.memberEmail.equals(Email) && this.memberPassword.equals(Pass)) {
            System.out.println("로그인 성공");
            return true;

        } else {
            System.out.println("로그인 실패");
            return false;

        }
    }
}


package ch11_classes.ex06_memberboard.service;

import ch11_classes.ex06_memberboard.common.CommonVariables;
import ch11_classes.ex06_memberboard.dto.MemberDTO;
import ch11_classes.ex06_memberboard.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberService {

    private MemberRepository memberRepository = new MemberRepository();
    private Scanner scanner = new Scanner(System.in);

    public void signUp() {
        System.out.print("이메일: ");
        String email = scanner.next();
        if (memberRepository.idCheck(email)) {
            System.out.print("비밀번호: ");
            String password = scanner.next();
            System.out.print("이름: ");
            String name = scanner.next();
            System.out.print("휴대폰번호: ");
            String mobile = scanner.next();
            MemberDTO memberDTO = new MemberDTO(email, password, name, mobile);
            boolean result = memberRepository.save(memberDTO);
            if (result) {
                System.out.println("회원가입이 완료되었습니다.");
            } else {
                System.out.println("회원가입에 실패했습니다.");
            }
        } else {
            System.out.println("이미 존재하는 이메일입니다. 다른 이메일을 사용해주세요.");
        }
    }

    public void login() {
        System.out.print("이메일: ");
        String email = scanner.next();
        System.out.print("비밀번호: ");
        String password = scanner.next();
        CommonVariables.loginEmail = email;
        MemberDTO memberDTO = memberRepository.login(email, password);
        if (memberDTO != null) {
            System.out.println(memberDTO.getMemberName() + "님, 환영합니다!");
        } else {
            System.out.println("로그인 실패. 이메일 또는 비밀번호를 확인해주세요.");
            CommonVariables.loginEmail = null;
        }
    }

    public void displayMembers() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println(memberDTO);
        }
    }

    public void updateMember() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("새로운 휴대폰번호: ");
            String newMobile = scanner.next();
            boolean result = memberRepository.update(CommonVariables.loginEmail, newMobile);
            if (result) {
                System.out.println("휴대폰번호가 업데이트되었습니다.");
            } else {
                System.out.println("업데이트에 실패했습니다.");
            }
        } else {
            System.out.println("로그인이 필요한 서비스입니다.");
        }
    }

    public void deleteMember() {
        if (CommonVariables.loginEmail != null) {
            boolean result = memberRepository.delete(CommonVariables.loginEmail);
            if (result) {
                System.out.println("회원탈퇴가 완료되었습니다.");
                CommonVariables.loginEmail = null;
            } else {
                System.out.println("회원탈퇴에 실패했습니다.");
            }
        } else {
            System.out.println("로그인이 필요한 서비스입니다.");
        }
    }

    public void logout() {
        if (CommonVariables.loginEmail != null) {
            CommonVariables.loginEmail = null;
            System.out.println("로그아웃되었습니다.");
        } else {
            System.out.println("로그인 상태가 아닙니다.");
        }
    }

}
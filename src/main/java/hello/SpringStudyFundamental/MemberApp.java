package hello.SpringStudyFundamental;

import hello.SpringStudyFundamental.member.Grade;
import hello.SpringStudyFundamental.member.Member;
import hello.SpringStudyFundamental.member.MemberService;
import hello.SpringStudyFundamental.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}

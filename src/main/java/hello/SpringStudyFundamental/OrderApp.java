package hello.SpringStudyFundamental;

import hello.SpringStudyFundamental.member.Grade;
import hello.SpringStudyFundamental.member.Member;
import hello.SpringStudyFundamental.member.MemberService;
import hello.SpringStudyFundamental.member.MemberServiceImpl;
import hello.SpringStudyFundamental.order.Order;
import hello.SpringStudyFundamental.order.OrderService;
import hello.SpringStudyFundamental.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}

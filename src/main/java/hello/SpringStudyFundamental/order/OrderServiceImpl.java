package hello.SpringStudyFundamental.order;

import hello.SpringStudyFundamental.discount.DiscountPolicy;
import hello.SpringStudyFundamental.discount.FixDiscountPolicy;
import hello.SpringStudyFundamental.member.Member;
import hello.SpringStudyFundamental.member.MemberRepository;
import hello.SpringStudyFundamental.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}

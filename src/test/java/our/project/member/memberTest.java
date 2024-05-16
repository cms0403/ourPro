package our.project.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import our.project.Config;

public class memberTest {

    @Test
    public void 멤버가입조회테스트() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        MemberService memberService = ac.getBean(MemberService.class);
        Member member1 = new Member(1, "심원준", "G", "031227");
        Member member2 = new Member(2, "임현빈", "G", "031227");
        memberService.memberJoin(member1);

        Member findMember = memberService.findMember(1);
        System.out.println("findMember = " + findMember.getMem_nm());
        Assertions.assertThat(member1).isEqualTo(findMember);
        //Assertions.assertThat(member2).isEqualTo(findMember);
    }

}

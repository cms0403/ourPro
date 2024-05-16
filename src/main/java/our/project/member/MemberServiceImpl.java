package our.project.member;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService{

    @Autowired
    private final MemberRepository memberRepository;

    @Override
    public void memberJoin(Member member) {
        System.out.println("Service-memberJoin");
        memberRepository.memberRegist(member);
    }

    @Override
    public Member findMember(Integer mem_cd) {
        System.out.println("Service-findMember");
        return memberRepository.memFindByCd(mem_cd);
    }
}

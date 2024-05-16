package our.project.member;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberRepositoryImpl implements MemberRepository{

    private static Map<Integer, Member> myRepository = new HashMap<>();

    @Override
    public void memberRegist(Member member) {
        myRepository.put(member.getMem_cd(), member);
    }

    @Override
    public Member memFindByCd(Integer mem_cd) {
        return myRepository.get(mem_cd);
    }
}

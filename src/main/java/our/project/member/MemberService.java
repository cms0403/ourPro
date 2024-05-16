package our.project.member;

public interface MemberService {
    void memberJoin(Member member);
    Member findMember(Integer mem_cd);
}

package our.project.member;

public interface MemberRepository {
    void memberRegist(Member member);
    Member memFindByCd(Integer mem_cd);
}

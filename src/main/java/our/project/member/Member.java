package our.project.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor //롬복 생성자 어노테이션
@Getter //롬복 게터 어노테이션
public class Member {
    private Integer mem_cd;
    private String mem_nm;
    private String mem_gender;
    private String mem_birth;
}

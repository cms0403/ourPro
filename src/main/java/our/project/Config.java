package our.project;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //config파일이라는것 선언 어노테이션
@ComponentScan //의존성 관련 어노테이션 (@Component 어노테이션이 달려있는것을 찾아서 의존성 부여)
public class Config {
}

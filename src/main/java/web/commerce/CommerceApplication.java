package web.commerce;

import web.commerce.domain.Member;
import web.commerce.domain.Survey;
import web.commerce.domain.repository.MemberRepository;
import web.commerce.domain.repository.SurveyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootApplication
public class CommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommerceApplication.class, args);
    }


    @Bean
    public CommandLineRunner runner(MemberRepository memberRepository, SurveyRepository surveyRepository) throws Exception{
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        passwordEncoder.encode("guest");
        return (args) -> {
            Member member = memberRepository.save(Member.builder()
                    .name("admin")
                    .password(passwordEncoder.encode("guest"))
                    .email("admin@admin.com")
                    .build());

            for(int i = 1; i <= 2; i++) {
                for(int j = 1; j <= 2; j++) {
                    for(int k = 1; k <= 2; k++) {
                        for(int l = 1; l <= 2; l++) {
                            surveyRepository.save(Survey.builder()
                                    .P1(i + "") // 1, 2
                                    .P2("1")
                                    .P3(j + "") // 1, 2
                                    .P4(k + "") // 1, 2
                                    .P5(l + "") // 1, 2
                                    .P6("2")
                                    .P7("3")
                                    .P8("1")
                                    .Result("HSJ") //협심증
                                    .Disease("HSJ")
                                    .build());
                        }
                    }
                }
            }
            for(int i = 1; i <= 4; i++){
                if(i != 2 && i != 3){
                    for(int j = 1; j <= 2; j++){
                        surveyRepository.save(Survey.builder()
                                .P1(i+"") //1, 4
                                .P2("1")
                                .P3("4")
                                .P4(j+"") //1, 2
                                .P5("3")
                                .P6("1")
                                .P7("3")
                                .P8("3")
                                .Result("SGGS") //심근경색
                                .Disease("SGGS")
                                .build());
                    }
                }
            }

        };
    }
}

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

            Member member2 = memberRepository.save(Member.builder()
                    .name("asd")
                    .password(passwordEncoder.encode("guest"))
                    .email("asd@asd.com")
                    .build());

            //협심증
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
                                    .member(member)
                                    .Result("Angina") //협심증
                                    .Disease("Angina")
                                    .build());
                        }
                    }
                }
            }

            //심근경색
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
                                .member(member)
                                .Result("Myocardial Infarction") //심근경색
                                .Disease("Myocardial Infarction")
                                .build());
                    }
                }
            }

            //심막염
            for(int i = 1; i <= 4; i++){
                if(i != 2 && i != 3) {
                    for (int j = 1; j <= 3; j++) {
                        if(j != 2) {
                            for (int k = 2; k <= 3; k++) {
                                surveyRepository.save(Survey.builder()
                                        .P1(i + "") //1, 4
                                        .P2(j + "") //1, 3
                                        .P3(k + "") //2, 3
                                        .P4("4")
                                        .P5("2")
                                        .P6("2")
                                        .P7("1")
                                        .P8("3")
                                        .member(member)
                                        .Result("Pericarditis") //심막염
                                        .Disease("Pericarditis")
                                        .build());
                            }
                        }
                    }
                }
            }

            //역류성 식도염
            for(int i = 2; i <= 4; i++){
                if(i != 3) {
                    for (int j = 2; j <= 3; j++) {
                        for (int k = 2; k <= 4; k++) {
                            if(k != 3) {
                                for (int l = 1; l <= 3; l++) {
                                    if(l != 2) {
                                        surveyRepository.save(Survey.builder()
                                                .P1(i + "") //2, 4
                                                .P2(j + "") //2, 3
                                                .P3("1")
                                                .P4(k + "") //2, 4
                                                .P5("1")
                                                .P6("2")
                                                .P7("2")
                                                .P8(l + "") //1, 3
                                                .member(member)
                                                .Result("Reflux Esophagitis") //역류성 식도염
                                                .Disease("Reflux Esophagitis")
                                                .build());
                                    }
                                }
                            }
                        }
                    }
                }
            }

            //늑골염
            for(int i = 2; i <= 3; i++){
                for(int j = 2; j <= 3; j++){
                    for(int k = 3; k <= 4; k++){
                        surveyRepository.save(Survey.builder()
                                .P1("0") //ALL
                                .P2(i + "") //2, 3
                                .P3(j + "") //2, 3
                                .P4(k + "") //3, 4
                                .P5("2")
                                .P6("2")
                                .P7("3")
                                .P8("3")
                                .member(member)
                                .Result("Pleurisy") //늑골염
                                .Disease("Pleurisy")
                                .build());
                    }
                }
            }

            //심리적 원인
            for(int i = 2; i <= 4; i++){
                if(i != 3){
                    for(int j = 1; j <= 2; j++){
                        surveyRepository.save(Survey.builder()
                                .P1("0") //ALL
                                .P2(i + "") //2, 4
                                .P3(j + "") //1, 2
                                .P4("4")
                                .P5("1")
                                .P6("2")
                                .P7("3")
                                .P8("1")
                                .member(member)
                                .Result("Mentality") //심리적 원인
                                .Disease("Mentality")
                                .build());
                    }
                }
            }

        };
    }
}

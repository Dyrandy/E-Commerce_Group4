package web.commerce.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.commerce.domain.Member;
import web.commerce.domain.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long>{
//    Survey findByUser(Member member);
}

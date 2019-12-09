package web.commerce.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.commerce.domain.Member;
import web.commerce.domain.Survey;

import java.util.List;
import java.util.Optional;

public interface SurveyRepository extends JpaRepository<Survey, Long>{
    Survey findByMember(Member member);
    Survey findByIdx(Long idx);
}

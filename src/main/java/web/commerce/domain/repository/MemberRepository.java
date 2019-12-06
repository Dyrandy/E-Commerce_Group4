package web.commerce.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.commerce.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}

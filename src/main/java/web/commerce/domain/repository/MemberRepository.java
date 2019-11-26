package web.commerce.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.commerce.domain.entity.MemberEntity;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    Optional<MemberEntity> findByEmail(String email);
}

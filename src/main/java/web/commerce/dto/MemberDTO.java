package web.commerce.dto;

import web.commerce.domain.entity.MemberEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDTO {
    private Long idx;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .idx(idx)
                .name(name)
                .email(email)
                .password(password)
                .build();
    }

    @Builder
    public MemberDTO(Long idx, String name, String email, String password) {
        this.idx = idx;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
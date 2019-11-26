package web.commerce.domain.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class MemberEntity implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String name;

    @Column//(length = 20, nullable = false)
    private String email;

    @Column//(length = 100, nullable = false)
    private String password;



    @Builder
    public MemberEntity(Long idx, String name, String email, String password) {
        this.idx = idx;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
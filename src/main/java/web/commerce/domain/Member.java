package web.commerce.domain;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name="User")
public class Member implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;



    @Builder
    public Member(Long idx, String name, String email, String password) {
        this.idx = idx;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
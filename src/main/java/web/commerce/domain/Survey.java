package web.commerce.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name="Survey")
public class Survey implements Serializable{
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String P1;

    @Column
    private String P2;

    @Column
    private String P3;

    @Column
    private String P4;

    @Column
    private String P5;

    @Column
    private String P6;

    @Column
    private String P7;

    @Column
    private String P8;

    @Column
    private String Result;

    @Column(name="User")
    private Member Member;

    @Column
    private String Disease;


    @Builder
    public Survey(String P1, String P2, String P3, String P4, String P5, String P6, String P7, String P8, String Result, Member Member, String Disease){
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
        this.P4 = P4;
        this.P5 = P5;
        this.P6 = P6;
        this.P7 = P7;
        this.P8 = P8;
        this.Result = Result;
        this.Member = Member;
        this.Disease = Disease;
    }
}

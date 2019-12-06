package web.commerce.dto;


import web.commerce.domain.Member;
import web.commerce.domain.Survey;
import lombok.*;

public class SurveyDTO {
    private Long idx;
    private String P1;
    private String P2;
    private String P3;
    private String P4;
    private String P5;
    private String P6;
    private String P7;
    private String P8;
    private String Result;
    private Member Member;
    private String Disease;

    public Survey toEntity(){
        return Survey.builder()
                .P1(P1)
                .P2(P2)
                .P3(P3)
                .P4(P4)
                .P5(P5)
                .P6(P6)
                .P7(P7)
                .P8(P8)
                .Result(Result)
                .Member(Member)
                .Disease(Disease)
                .build();
    }

    @Builder
    public SurveyDTO(String P1, String P2, String P3, String P4, String P5, String P6, String P7, String P8, String Result, Member Member, String Disease){
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

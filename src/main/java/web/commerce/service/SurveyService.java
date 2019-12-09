package web.commerce.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import web.commerce.domain.Member;
import web.commerce.domain.Survey;
import web.commerce.dto.SurveyDTO;
import web.commerce.domain.repository.SurveyRepository;

import javax.transaction.Transactional;
import java.util.*;

@Service
@AllArgsConstructor
public class SurveyService {
    private SurveyRepository surveyRepository;

    @Transactional
    public long saveSurvey(SurveyDTO surveyDTO){
//        System.out.println(printSurvey());
        List<Survey> list = new ArrayList<>();
        printSurvey().forEach(list::add);
//        System.out.println(list.get(0).getP1());
        int[] disease_count = new int[6];
        Arrays.fill(disease_count, 0);

        //각 문항별로 질병과 일치하는 문항 개수
        int[] p1 = new int[6];
        int[] p2 = new int[6];
        int[] p3 = new int[6];
        int[] p4 = new int[6];
        int[] p5 = new int[6];
        int[] p6 = new int[6];
        int[] p7 = new int[6];
        int[] p8 = new int[6];

        Arrays.fill(p1, 0);
        Arrays.fill(p2, 0);
        Arrays.fill(p3, 0);
        Arrays.fill(p4, 0);
        Arrays.fill(p5, 0);
        Arrays.fill(p6, 0);
        Arrays.fill(p7, 0);
        Arrays.fill(p8, 0);

        double disease1 = 0.0; //협십증
        double disease2 = 0.0; //심근경색
        double disease3 = 0.0; //심장막염
        double disease4 = 0.0; //역류성 식도염
        double disease5 = 0.0; //늑골염
        double disease6 = 0.0; //심리적

        double[] disease = new double[6];
        Arrays.fill(disease, 0.0);


        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getDisease().equals("Angina")){
                disease_count[0] += 1;
                if(list.get(i).getP1().equals(surveyDTO.toEntity().getP1())){
                    p1[0] += 1;
                }if(list.get(i).getP2().equals(surveyDTO.toEntity().getP2())){
                    p2[0] += 1;
                }if(list.get(i).getP3().equals(surveyDTO.toEntity().getP3())){
                    p3[0] += 1;
                }if(list.get(i).getP4().equals(surveyDTO.toEntity().getP4())){
                    p4[0] += 1;
                }if(list.get(i).getP5().equals(surveyDTO.toEntity().getP5())){
                    p5[0] += 1;
                }if(list.get(i).getP6().equals(surveyDTO.toEntity().getP6())){
                    p6[0] += 1;
                }if(list.get(i).getP7().equals(surveyDTO.toEntity().getP7())){
                    p7[0] += 1;
                }if(list.get(i).getP8().equals(surveyDTO.toEntity().getP8())){
                    p8[0] += 1;
                }
            }
            else if(list.get(i).getDisease().equals("Myocardial Infarction")){
                disease_count[1] += 1;
                if(list.get(i).getP1().equals(surveyDTO.toEntity().getP1())){
                    p1[1] += 1;
                }if(list.get(i).getP2().equals(surveyDTO.toEntity().getP2())){
                    p2[1] += 1;
                }if(list.get(i).getP3().equals(surveyDTO.toEntity().getP3())){
                    p3[1] += 1;
                }if(list.get(i).getP4().equals(surveyDTO.toEntity().getP4())){
                    p4[1] += 1;
                }if(list.get(i).getP5().equals(surveyDTO.toEntity().getP5())){
                    p5[1] += 1;
                }if(list.get(i).getP6().equals(surveyDTO.toEntity().getP6())){
                    p6[1] += 1;
                }if(list.get(i).getP7().equals(surveyDTO.toEntity().getP7())){
                    p7[1] += 1;
                }if(list.get(i).getP8().equals(surveyDTO.toEntity().getP8())){
                    p8[1] += 1;
                }
            }
            else if(list.get(i).getDisease().equals("Pericarditis")){
                disease_count[2] += 1;
                if(list.get(i).getP1().equals(surveyDTO.toEntity().getP1())){
                    p1[2] += 1;
                }if(list.get(i).getP2().equals(surveyDTO.toEntity().getP2())){
                    p2[2] += 1;
                }if(list.get(i).getP3().equals(surveyDTO.toEntity().getP3())){
                    p3[2] += 1;
                }if(list.get(i).getP4().equals(surveyDTO.toEntity().getP4())){
                    p4[2] += 1;
                }if(list.get(i).getP5().equals(surveyDTO.toEntity().getP5())){
                    p5[2] += 1;
                }if(list.get(i).getP6().equals(surveyDTO.toEntity().getP6())){
                    p6[2] += 1;
                }if(list.get(i).getP7().equals(surveyDTO.toEntity().getP7())){
                    p7[2] += 1;
                }if(list.get(i).getP8().equals(surveyDTO.toEntity().getP8())){
                    p8[2] += 1;
                }
            }
            else if(list.get(i).getDisease().equals("Reflux Esophagitis")){
                disease_count[3] += 1;
                if(list.get(i).getP1().equals(surveyDTO.toEntity().getP1())){
                    p1[3] += 1;
                }if(list.get(i).getP2().equals(surveyDTO.toEntity().getP2())){
                    p2[3] += 1;
                }if(list.get(i).getP3().equals(surveyDTO.toEntity().getP3())){
                    p3[3] += 1;
                }if(list.get(i).getP4().equals(surveyDTO.toEntity().getP4())){
                    p4[3] += 1;
                }if(list.get(i).getP5().equals(surveyDTO.toEntity().getP5())){
                    p5[3] += 1;
                }if(list.get(i).getP6().equals(surveyDTO.toEntity().getP6())){
                    p6[3] += 1;
                }if(list.get(i).getP7().equals(surveyDTO.toEntity().getP7())){
                    p7[3] += 1;
                }if(list.get(i).getP8().equals(surveyDTO.toEntity().getP8())){
                    p8[3] += 1;
                }
            }
            else if(list.get(i).getDisease().equals("Pleurisy")){
                disease_count[4] += 1;
                if(list.get(i).getP1().equals(surveyDTO.toEntity().getP1())){
                    p1[4] += 1;
                }if(list.get(i).getP2().equals(surveyDTO.toEntity().getP2())){
                    p2[4] += 1;
                }if(list.get(i).getP3().equals(surveyDTO.toEntity().getP3())){
                    p3[4] += 1;
                }if(list.get(i).getP4().equals(surveyDTO.toEntity().getP4())){
                    p4[4] += 1;
                }if(list.get(i).getP5().equals(surveyDTO.toEntity().getP5())){
                    p5[4] += 1;
                }if(list.get(i).getP6().equals(surveyDTO.toEntity().getP6())){
                    p6[4] += 1;
                }if(list.get(i).getP7().equals(surveyDTO.toEntity().getP7())){
                    p7[4] += 1;
                }if(list.get(i).getP8().equals(surveyDTO.toEntity().getP8())){
                    p8[4] += 1;
                }
            }
            else if(list.get(i).getDisease().equals("Mentality")){
                disease_count[5] += 1;
                if(list.get(i).getP1().equals(surveyDTO.toEntity().getP1())){
                    p1[5] += 1;
                }if(list.get(i).getP2().equals(surveyDTO.toEntity().getP2())){
                    p2[5] += 1;
                }if(list.get(i).getP3().equals(surveyDTO.toEntity().getP3())){
                    p3[5] += 1;
                }if(list.get(i).getP4().equals(surveyDTO.toEntity().getP4())){
                    p4[5] += 1;
                }if(list.get(i).getP5().equals(surveyDTO.toEntity().getP5())){
                    p5[5] += 1;
                }if(list.get(i).getP6().equals(surveyDTO.toEntity().getP6())){
                    p6[5] += 1;
                }if(list.get(i).getP7().equals(surveyDTO.toEntity().getP7())){
                    p7[5] += 1;
                }if(list.get(i).getP8().equals(surveyDTO.toEntity().getP8())){
                    p8[5] += 1;
                }
            }
        }

//        System.out.println(disease_count[0]);
//        System.out.println(disease_count[1]);
//        System.out.println(disease_count[2]);
//        System.out.println(disease_count[3]);
//        System.out.println(disease_count[4]);
//        System.out.println(disease_count[5]);
//        for(int i = 0; i < 6; i++){
//            System.out.println(p1[i] + " " + p2[i] + " " + p3[i] + " " + p4[i] + " " + p5[i] + " " + p6[i] + " " + p7[i] + " " + p8[i]);
//        }

        disease[0] = (0.2 * p1[0] / disease_count[0]) +
                (0.2 * p2[0] / disease_count[0]) +
                (0.2 * p3[0] / disease_count[0]) +
                (0.1 * p4[0] / disease_count[0]) +
                (0.1 * p5[0] / disease_count[0]) +
                (0.1 * p6[0] / disease_count[0]) +
                (0.05 * p7[0] / disease_count[0]) +
                (0.05 * p8[0] / disease_count[0]);

        disease[1] = (0.2 * p1[1] / disease_count[1]) +
                (0.2 * p2[1] / disease_count[1]) +
                (0.15 * p3[1] / disease_count[1]) +
                (0.1 * p4[1] / disease_count[1]) +
                (0.15 * p5[1] / disease_count[1]) +
                (0.1 * p6[1] / disease_count[1]) +
                (0.05 * p7[1] / disease_count[1]) +
                (0.05 * p8[1] / disease_count[1]);

        disease[2] = (0.2 * p1[2] / disease_count[2]) +
                (0.1 * p2[2] / disease_count[2]) +
                (0.1 * p3[2] / disease_count[2]) +
                (0.1 * p4[2] / disease_count[2]) +
                (0.1 * p5[2] / disease_count[2]) +
                (0.15 * p6[2] / disease_count[2]) +
                (0.15 * p7[2] / disease_count[2]) +
                (0.1 * p8[2] / disease_count[2]);

        disease[3] = (0.15 * p1[3] / disease_count[3]) +
                (0.15 * p2[3] / disease_count[3]) +
                (0.15 * p3[3] / disease_count[3]) +
                (0.15 * p4[3] / disease_count[3]) +
                (0.15 * p5[3] / disease_count[3]) +
                (0.15 * p6[3] / disease_count[3]) +
                (0.05 * p7[3] / disease_count[3]) +
                (0.05 * p8[3] / disease_count[3]);

        disease[4] = (0.0 * p1[4] / disease_count[4]) +
                (0.2 * p2[4] / disease_count[4]) +
                (0.1 * p3[4] / disease_count[4]) +
                (0.2 * p4[4] / disease_count[4]) +
                (0.1 * p5[4] / disease_count[4]) +
                (0.2 * p6[4] / disease_count[4]) +
                (0.1 * p7[4] / disease_count[4]) +
                (0.1 * p8[4] / disease_count[4]);

        disease[5] = (0.0 * p1[5] / disease_count[5]) +
                (0.05 * p2[5] / disease_count[5]) +
                (0.2 * p3[5] / disease_count[5]) +
                (0.2 * p4[5] / disease_count[5]) +
                (0.2 * p5[5] / disease_count[5]) +
                (0.15 * p6[5] / disease_count[5]) +
                (0.1 * p7[5] / disease_count[5]) +
                (0.1 * p8[5] / disease_count[5]);


        double Max = 0.0;
        int index = 0;
        for(int i = 0; i < 6; i++) {
            if(Max <= disease[i]) {
                Max = disease[i];
                index = i;
            }

            System.out.println(disease[i]);
        }

        String expect = "";
        switch(index){
            case 0:
                expect = "Angina";
                break;
            case 1:
                expect = "Myocardial Infarction";
                break;
            case 2:
                expect = "Pericarditis";
                break;
            case 3:
                expect = "Reflux Esophagitis";
                break;
            case 4:
                expect = "Pleurisy";
                break;
            case 5:
                expect = "Mentality";
                break;
        }

        surveyDTO.setDisease(expect);
        surveyDTO.setResult(Math.round(Max * 100.0) + "");
//        System.out.println(Math.round(Max * 100.0)  + "");
        //surveyRepository.findByMember(member);


        return surveyRepository.save(surveyDTO.toEntity()).getIdx();
    }

    public Iterable<Survey> printSurvey(){
        return surveyRepository.findAll();
    }

    public Survey findSurveyByIdx(Long idx){
        return surveyRepository.findByIdx(idx);
    }

}

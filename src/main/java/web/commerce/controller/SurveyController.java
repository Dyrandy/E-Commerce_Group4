/*
 * 설문 조사 관련 컨트롤러
 * 이지훈
 * 2019-11-14
 * */
package web.commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import web.commerce.domain.Member;
import web.commerce.dto.MemberDTO;
import web.commerce.dto.SurveyDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.commerce.service.SurveyService;

@Controller
@RequestMapping("/survey")
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    private Long num;

    @GetMapping({"", "index", "index.html"})
    public String getIndex(){
        return "survey/index";
    }

    @GetMapping("/check")
    public String getCheck(){
        return "survey/check";
    }

    @PostMapping("/save")
    public String postSave(MemberDTO memberDTO, SurveyDTO surveyDTO, Model model){
        num = surveyService.saveSurvey(surveyDTO);
        return "survey/save";
    }

    @PostMapping("result")
    public String getResult(Model model){
        model.addAttribute("surveyResult", surveyService.findSurveyByIdx(num));
        return "survey/result";
    }
}

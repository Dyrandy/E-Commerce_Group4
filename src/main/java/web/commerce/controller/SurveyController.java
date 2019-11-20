/*
 * 설문 조사 관련 컨트롤러
 * 이지훈
 * 2019-11-14
 * */
package web.commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/survey")
public class SurveyController {

    @GetMapping({"", "/check"})
    public String getCheck(Model model){
        return "survey/check";
    }

    @PostMapping({"", "/check"})
    public String postCheck(Model model){
        return "survey/check";
    }
}

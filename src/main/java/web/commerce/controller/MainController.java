/*
 * 메인 페이지 관련 컨트롤러
 * 이지훈
 * 2019-11-14
 * */
package web.commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping({"/", ""})
public class MainController {


    @GetMapping({"", "/", "/index"})
    public String Index(Model model){
        return "index";
    }
}

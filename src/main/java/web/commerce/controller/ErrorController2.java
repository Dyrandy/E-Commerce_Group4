/*
* 오류 관련 컨트롤러
* 이지훈
* 2019-11-14
* */
package web.commerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.web.servlet.error.ErrorController;

@Controller
public class ErrorController2 implements ErrorController {

    @RequestMapping("/error")
    public String handleError(){
        return "error";
    }

    @Override
    public String getErrorPath(){
        return "/error";
    }

}
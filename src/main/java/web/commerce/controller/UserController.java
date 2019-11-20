/*
 * 유저 관련 컨트롤러
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
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String getLogin(){
        return "user/login";
    }

    @PostMapping("/login")
    public String postLogin(){
        return "user/login";
    }
}

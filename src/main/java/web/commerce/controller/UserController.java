/*
 * 유저 관련 컨트롤러
 * 이지훈
 * 2019-11-14
 * */

package web.commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.commerce.dto.MemberDTO;
import web.commerce.service.MemberService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/login")
    public String getLogin(){
        return "user/login";
    }

    @PostMapping("/login")
    public String postLogin(){
        return "user/login";
    }

    @GetMapping("/register")
    public String getRegister(){
        return "user/register";
    }

    @PostMapping("/register")
    public String postRegister(MemberDTO memberDTO){
        memberService.joinUser(memberDTO);
        return "user/login";
    }
}

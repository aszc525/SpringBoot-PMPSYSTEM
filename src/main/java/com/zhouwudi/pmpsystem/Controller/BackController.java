package com.zhouwudi.pmpsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BackController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
    @GetMapping("/p1")
    public String p1(){
        return "p1";
    }
    @GetMapping("/p2")
    public String p2(){
        return "p2";
    }
    @GetMapping("/p3")
    public String p3(){
        return "p3";
    }
    @GetMapping("/p5Test")
    public String p5Test(){
        return "p5Test";
    }
}

package com.example.teammatcha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    //http://localhost:8080/hello
    @GetMapping("/hello")
    public String testHello(){
        System.out.println("/hello");
        return "welcome";
    }
    @GetMapping("/commands")
    public String showCommands(){
        System.out.println("/commands");
        return "commands";
    }
    @GetMapping("/pruducts")
    public String showPruducts(){
        System.out.println("/pruducts");
        return "pruducts";
    }
}

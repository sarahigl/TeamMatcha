package com.example.teammatcha;

import com.example.teammatcha.services.CommandService;
import com.example.teammatcha.services.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    //http://localhost:8080/hello
    @Autowired
    private ProductCommandService commandService;
    @GetMapping("/hello")
    public String testHello(){
        System.out.println("/hello");
        return "welcome";
    }
    @GetMapping("/commands")
    public String showCommands(Model model){
        System.out.println("/commands");
        System.out.println(commandService.getAllCommand());
        model.addAttribute("commands", commandService.getAllCommand());
        return "commands";
    }
    @GetMapping("/pruducts")
    public String showPruducts(){
        System.out.println("/pruducts");
        return "pruducts";
    }
}

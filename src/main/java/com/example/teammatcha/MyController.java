package com.example.teammatcha;

import com.example.teammatcha.beans.CommandBean;
import com.example.teammatcha.services.CommandService;
import com.example.teammatcha.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {
    //http://localhost:8080/hello
    @Autowired
    private CommandService commandService;
    @GetMapping("/hello")
    public String testHello(){
        System.out.println("/hello");
        return "welcome";
    }
    @GetMapping("/commands")
    public String showCommands(Model model){
        System.out.println("/commands");
        System.out.println(commandService.getAll());
        model.addAttribute("commands", commandService.getAll());
        return "commands";
    }
    @GetMapping("/pruducts")
    public String showPruducts(){
        System.out.println("/pruducts");
        return "pruducts";
    }
}

package com.example.teammatcha;

import com.example.teammatcha.Beans.ProductBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class MyRestcontroller {
    //http://localhost:8080/hello
    @GetMapping("/hello")
    public String testHello(){
        System.out.println("/hello");
        return "welcome";
    }
}

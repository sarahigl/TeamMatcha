package com.example.teammatcha;


import com.example.teammatcha.beans.CommandBean;
import com.example.teammatcha.beans.ProductBean;
import com.example.teammatcha.beans.ProductCommandBean;
import com.example.teammatcha.services.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestcontroller {
    @Autowired
    private ProductCommandService commandService;
    @GetMapping("/produits")
    //http://localhost:8080/api/produits
    public List<ProductBean> getProduct() {
        return commandService.getAllProduct();
    }
    @PostMapping("/addCommand")
    public void addCommand(@RequestBody CommandBean command) {
        //http://localhost:8080/addCommand
        commandService.addCommand(command);

    }
}

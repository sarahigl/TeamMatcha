package com.example.teammatcha;


import com.example.teammatcha.beans.*;
import com.example.teammatcha.services.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public void addCommand(@RequestBody commandProductsListBean commandProduct) {
        //http://localhost:8080/addCommand
        commandService.addCommand2(commandProduct);
    }

}

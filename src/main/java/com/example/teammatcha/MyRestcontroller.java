package com.example.teammatcha;


import com.example.teammatcha.beans.ProductBean;
import com.example.teammatcha.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestcontroller {
    @Autowired
    private ProductService productService;
    @GetMapping("/produits")
    //http://localhost:8080/api/produits
    public List<ProductBean> getProduct() {
        return productService.getAll();
    }
}

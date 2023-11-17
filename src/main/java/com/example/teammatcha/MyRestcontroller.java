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
    @GetMapping("/test")
    //http://localhost:8080/api/test
    public commandProductsListBean test() {
        commandProductsListBean com = new commandProductsListBean();
        com.setCommand(new CommandBean("aa", "bb", "cc"));
        ArrayList<ProductQuantityBean> list = new ArrayList<>();
        list.add(new ProductQuantityBean(new  ProductBean(1, 22, "cc", "dd"), 5));
        list.add(new ProductQuantityBean(new  ProductBean(2, 11, "aa", "ccc"), 2));

        com.setProductList(list);
        return com;
    }
}

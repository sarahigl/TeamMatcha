package com.example.teammatcha;

import com.example.teammatcha.beans.ProductBean;
import com.example.teammatcha.services.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @Autowired
    private ProductCommandService commandService;
    @GetMapping("/commands")
    public String showCommands(Model model){
        //http://localhost:8080/commands
        model.addAttribute("commands", commandService.getAllCommand());
        return "commands";
    }
    @GetMapping("/products")
    public String showProducts(Model model) {
        //http://localhost:8080/products
        model.addAttribute("product", new ProductBean());
        model.addAttribute("products", commandService.getAllProduct());
        return "products";
    }
    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute  ProductBean product) {
        //http://localhost:8080/addProduct
        try {
            commandService.addProduct(product);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "redirect:/products";
    }
    @GetMapping("/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable int productId) {
        commandService.deleteProductById(productId);
        return "redirect:/products";
    }
}

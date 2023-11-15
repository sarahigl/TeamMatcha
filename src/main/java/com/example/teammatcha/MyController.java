package com.example.teammatcha;

import com.example.teammatcha.beans.ProductBean;
import com.example.teammatcha.services.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    public String addProduct(@ModelAttribute  ProductBean product, Model model) {
        //http://localhost:8080/addProduct
//        if (commandService.isProductExists(product.getNom_produit())) {
//            model.addAttribute("productExistsError", "Un produit avec ce nom existe déjà.");
//            return "redirect:/products";
//        }
        commandService.addProduct(product);
        return "redirect:/products";
    }
}

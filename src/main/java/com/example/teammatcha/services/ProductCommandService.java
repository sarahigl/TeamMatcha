package com.example.teammatcha.services;

import com.example.teammatcha.beans.*;
import com.example.teammatcha.repository.CommandRepository;
import com.example.teammatcha.repository.ProductCommandRepository;
import com.example.teammatcha.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;

@Service
public class ProductCommandService {
    @Autowired
    private ProductRepository productRep;
    @Autowired
    private CommandRepository commandRep;
    @Autowired
    private ProductCommandRepository productCommandRep;
    public List<CommandBean> getAllCommand() {
        return commandRep.findAll();
    }
    public List<ProductBean> getAllProduct() {
        return productRep.findAll();
    }
    public List<ProductCommandBean> getAllProductCommand() {
        return productCommandRep.findAll();
    }

    public ProductBean addProduct(ProductBean product) throws Exception {
        if (productRep.existsByNomProduit(product.getNomProduit())) {
            throw new Exception("Le produit existe déjà");
        }
        return productRep.save(product);
    }
    public void deleteProductById(int productId) {
        productRep.deleteById(productId);
    }
    public List<MergedCommandBean> getAllMergedData() {
        return productCommandRep.getAllMergedData();
    }
    public void addCommand(CommandBean command) {
        Instant now = Instant.now();
        long timestamp = now.toEpochMilli();
        command.setDate_commande(timestamp);
        commandRep.save(command);
    }


}

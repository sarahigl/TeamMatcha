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

    public void addCommand(CommandBean command) {
        Instant now = Instant.now();
        long timestamp = now.toEpochMilli();
        command.setDate_commande(timestamp);
        CommandBean savedCommand = commandRep.save(command);
//        for (int i = 0; i < productCommand.size(); i++) {
//            productCommand.get(i).getCommande().setId_commande(savedCommand.getId_commande());
//            productCommandRep.save(productCommand.get(i));
//        }
    }
    public ProductBean getProductById(int productId) {
        return productRep.findById(productId);
    }
    public List<commandProductsListBean> getAllMergedData() {
        List<commandProductsListBean> mergedData = new ArrayList<>();
        List<CommandBean> allCommands = getAllCommand();
        for (CommandBean command : allCommands) {
            List<ProductBean> productsList = new ArrayList<>();
            for (ProductCommandBean productCommand : getAllProductCommand()) {
                if (productCommand.getCommande().getId_commande() == command.getId_commande()) {
                    ProductBean product = getProductById(productCommand.getProduit().getId_produit());
                    productsList.add(product);
                }
            }
            mergedData.add(new commandProductsListBean(command, productsList));
        }
        return mergedData;
    }





}

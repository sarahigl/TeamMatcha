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
    }
    public void addCommand2(commandProductsListBean commandProduct) {
        Instant now = Instant.now();
        long timestamp = now.toEpochMilli();
        CommandBean command = commandProduct.getCommand();
        command.setDate_commande(timestamp);
        CommandBean savedCommand = commandRep.save(command);
        int idCommand = command.getId_commande();
        for (int i = 0; i < commandProduct.getProductList().size(); i++) {
            ProductQuantityBean product = commandProduct.getProductList().get(i);
            ProductCommandBean productCommand = new ProductCommandBean();
            productCommand.setIdCommande(idCommand);
            productCommand.setIdProduit(product.getProduct().getId_produit());
            productCommand.setQuantite(product.getQuantity());
            productCommandRep.save(productCommand);
        }
    }
    public ProductBean getProductById(int productId) {
        return productRep.findById(productId);
    }
    public List<commandProductsListBean> getAllMergedData() {
        List<commandProductsListBean> mergedData = new ArrayList<>();
        List<CommandBean> allCommands = getAllCommand();

        for (CommandBean command : allCommands) {
            List<ProductQuantityBean> productsList = new ArrayList<>();

            for (ProductCommandBean productCommand : getAllProductCommand()) {
                if (productCommand.getIdCommande() == command.getId_commande()) {
                    ProductBean product = getProductById(productCommand.getIdProduit());
                    productsList.add(new ProductQuantityBean(product, productCommand.getQuantite()));
                }
            }

            mergedData.add(new commandProductsListBean(command, productsList));
        }

        return mergedData;
    }
}

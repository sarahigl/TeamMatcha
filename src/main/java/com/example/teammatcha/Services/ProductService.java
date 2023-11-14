package com.example.teammatcha.Services;

import com.example.teammatcha.repository.ProductsRepository;

public class ProductService {
    private ProductsRepository productRect;

    public ProductsRepository getProductRect() {
        return productRect;
    }

    public void setProductRect(ProductsRepository productRect) {
        this.productRect = productRect;
    }

    public ProductService() {
    }

    public ProductService(ProductsRepository productRect) {
        this.productRect = productRect;
    }

    //MÉTHODE GET ALL()

    /*public static ProductsRepository getAll(){
        return
    }*/

    //MÉTHODE ADDPRODUCT()

    /*public static ProductsRepository addProduct(ProductsRepository produit){
        return
    }*/
}

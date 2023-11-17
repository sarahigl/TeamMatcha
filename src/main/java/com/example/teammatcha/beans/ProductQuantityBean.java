package com.example.teammatcha.beans;

public class ProductQuantityBean {
    private ProductBean product;
    private int quantity;

    public ProductQuantityBean(ProductBean product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ProductQuantityBean() {
    }

    public ProductBean getProduct() {
        return product;
    }

    public void setProduct(ProductBean product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

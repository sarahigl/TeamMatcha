package com.example.teammatcha.beans;

public class MergedCommandBean {
    private CommandBean command;
    private ProductBean product;
    private ProductCommandBean productCommand;

    public MergedCommandBean(CommandBean command, ProductBean product, ProductCommandBean productCommand) {
        this.command = command;
        this.product = product;
        this.productCommand = productCommand;
    }

    public MergedCommandBean() {
    }

    public CommandBean getCommand() {
        return command;
    }

    public void setCommand(CommandBean command) {
        this.command = command;
    }

    public ProductBean getProduct() {
        return product;
    }

    public void setProduct(ProductBean product) {
        this.product = product;
    }

    public ProductCommandBean getProductCommand() {
        return productCommand;
    }

    public void setProductCommand(ProductCommandBean productCommand) {
        this.productCommand = productCommand;
    }
}

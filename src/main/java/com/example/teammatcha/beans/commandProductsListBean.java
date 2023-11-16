package com.example.teammatcha.beans;

import java.util.List;

public class commandProductsListBean {
    private CommandBean command;
    private List<ProductBean> productList;

    public commandProductsListBean(CommandBean command, List<ProductBean> productList) {
        this.command = command;
        this.productList = productList;
    }

    public commandProductsListBean() {
    }

    public CommandBean getCommand() {
        return command;
    }

    public void setCommand(CommandBean command) {
        this.command = command;
    }

    public List<ProductBean> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductBean> productList) {
        this.productList = productList;
    }
}

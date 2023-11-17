package com.example.teammatcha.beans;

import java.util.List;

public class commandProductsListBean {
    private CommandBean command;
    private List<ProductQuantityBean> productList;

    public commandProductsListBean(CommandBean command, List<ProductQuantityBean> productList) {
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

    public List<ProductQuantityBean> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductQuantityBean> productList) {
        this.productList = productList;
    }
}

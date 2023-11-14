package com.example.teammatcha;

import com.example.teammatcha.Beans.ProductBean;

import java.util.ArrayList;
import java.util.List;

public class Controller {
 private List<ProductBean> list = new ArrayList<>();

    public List<ProductBean> getList() {
        return list;
    }

    public void setList(List<ProductBean> list) {
        this.list = list;
    }

    public Controller(List<ProductBean> list) {
        this.list = list;
    }

    public Controller() {

    }
    //MÉTHODE POSTADDPRODUCT
    /*public static ProductBean postAddProduct(ProductBean productBean){
      return
    }*/

    //METHODE GETCOMMANDE()
    public static void getCommand(){

    }

}

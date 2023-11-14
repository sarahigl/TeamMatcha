package com.example.teammatcha.Beans;

public class ProductBean {
    private int id_product;
    private int prix_product;
    private String nom_product;
    private String image_product;

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getPrix_product() {
        return prix_product;
    }

    public void setPrix_product(int prix_product) {
        this.prix_product = prix_product;
    }

    public String getNom_product() {
        return nom_product;
    }

    public void setNom_product(String nom_product) {
        this.nom_product = nom_product;
    }

    public String getImage_product() {
        return image_product;
    }

    public void setImage_product(String image_product) {
        this.image_product = image_product;
    }

    public ProductBean( int prix_product, String nom_product, String image_product) {
        this.prix_product = prix_product;
        this.nom_product = nom_product;
        this.image_product = image_product;
    }

    public ProductBean() {
    }

}

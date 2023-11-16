package com.example.teammatcha.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "produits")
public class ProductBean {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_produit;
   private double prix_produit;
   private String nomProduit;
   private String image_produit;

    public ProductBean(int id_produit, double prix_produit, String nomProduit, String image_produit) {
        this.id_produit = id_produit;
        this.prix_produit = prix_produit;
        this.nomProduit = nomProduit;
        this.image_produit = image_produit;
    }

    public ProductBean() {
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public double getPrix_produit() {
        return prix_produit;
    }

    public void setPrix_produit(double prix_produit) {
        this.prix_produit = prix_produit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getImage_produit() {
        return image_produit;
    }

    public void setImage_produit(String image_produit) {
        this.image_produit = image_produit;
    }
}

package com.example.teammatcha.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "produits")
public class ProductBean {
   @Id
   private int id_produit;
   private double prix_produit;
   private String nom_produit;
   private String image_produit;

    public ProductBean(double prix_produit, String nom_produit, String image_produit) {
        this.prix_produit = prix_produit;
        this.nom_produit = nom_produit;
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

    public String getNom_produit() {
        return nom_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public String getImage_produit() {
        return image_produit;
    }

    public void setImage_produit(String image_produit) {
        this.image_produit = image_produit;
    }
}

package com.example.teammatcha.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "produits_commandes")
public class ProductCommandBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produits_commandes;
    private int id_produit;
    private int id_commande;
    private int quantite;

    public ProductCommandBean(int id_produit_command, int id_produit, int id_commande, int quantite) {
        this.id_produits_commandes = id_produit_command;
        this.id_produit = id_produit;
        this.id_commande = id_commande;
        this.quantite = quantite;
    }

    public ProductCommandBean() {
    }

    public int getId_produits_commandes() {
        return id_produits_commandes;
    }

    public void setId_produits_commandes(int id_produit_command) {
        this.id_produits_commandes = id_produit_command;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
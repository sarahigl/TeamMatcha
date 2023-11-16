package com.example.teammatcha.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "produits_commandes")
public class ProductCommandBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produits_commandes;
    @ManyToOne
    @JoinColumn(name = "id_produit", nullable = false)
    private ProductBean produit;

    @ManyToOne
    @JoinColumn(name = "id_commande", nullable = false)
    private CommandBean commande;
    private int quantite;

    public ProductCommandBean(int id_produits_commandes, ProductBean produit, CommandBean commande, int quantite) {
        this.id_produits_commandes = id_produits_commandes;
        this.produit = produit;
        this.commande = commande;
        this.quantite = quantite;
    }

    public ProductCommandBean() {
    }

    public int getId_produits_commandes() {
        return id_produits_commandes;
    }

    public void setId_produits_commandes(int id_produits_commandes) {
        this.id_produits_commandes = id_produits_commandes;
    }

    public ProductBean getProduit() {
        return produit;
    }

    public void setProduit(ProductBean produit) {
        this.produit = produit;
    }

    public CommandBean getCommande() {
        return commande;
    }

    public void setCommande(CommandBean commande) {
        this.commande = commande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
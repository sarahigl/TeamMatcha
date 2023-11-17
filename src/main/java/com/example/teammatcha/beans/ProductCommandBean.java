package com.example.teammatcha.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "produits_commandes")
public class ProductCommandBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produits_commandes;
    private int idProduit;
    private int idCommande;
//    @ManyToOne
//    @JoinColumn(name = "id_produit", nullable = false)
//    private ProductBean produit;
//
//    @ManyToOne
//    @JoinColumn(name = "id_commande", nullable = false)
//    private CommandBean commande;
    private int quantite;

    public ProductCommandBean(int id_produits_commandes, int idProduit, int idCommande, int quantite) {
        this.id_produits_commandes = id_produits_commandes;
        this.idProduit = idProduit;
        this.idCommande = idCommande;
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

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
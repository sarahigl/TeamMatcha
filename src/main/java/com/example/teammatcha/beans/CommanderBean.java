package com.example.teammatcha.beans;

public class CommanderBean {
    private int id_produit;
    private int id_commande;
    private int quantite;

    public CommanderBean(int id_commande, int quantite) {
        this.id_commande = id_commande;
        this.quantite = quantite;
    }

    public CommanderBean() {
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
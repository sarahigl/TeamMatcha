package com.example.teammatcha.Beans;

public class CommanderBean {
    private int id_commande;
    private int id_produit;
    private int id_quantite;

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public int getId_quantite() {
        return id_quantite;
    }

    public void setId_quantite(int id_quantite) {
        this.id_quantite = id_quantite;
    }

    public CommanderBean() {
    }

    public CommanderBean(int id_commande, int id_produit, int id_quantite) {
        this.id_commande = id_commande;
        this.id_produit = id_produit;
        this.id_quantite = id_quantite;
    }
}

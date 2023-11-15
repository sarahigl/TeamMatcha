package com.example.teammatcha.beans;

import jakarta.persistence.*;

@Entity
@Table(name = "commandes")
public class CommandBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_commande;
    private String telephone_commande;
    private String nom_commande;
    private String prenom_commande;
    private double prix_total_commande;
    private long date_commande;

    public CommandBean(int id_commande, String telephone_commande, String nom_commande, String prenom_commande, double prix_total_commande, long date_commande) {
        this.id_commande = id_commande;
        this.telephone_commande = telephone_commande;
        this.nom_commande = nom_commande;
        this.prenom_commande = prenom_commande;
        this.prix_total_commande = prix_total_commande;
        this.date_commande = date_commande;
    }

    public CommandBean() {
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public String getTelephone_commande() {
        return telephone_commande;
    }

    public void setTelephone_commande(String telephone_commande) {
        this.telephone_commande = telephone_commande;
    }

    public String getNom_commande() {
        return nom_commande;
    }

    public void setNom_commande(String nom_commande) {
        this.nom_commande = nom_commande;
    }

    public String getPrenom_commande() {
        return prenom_commande;
    }

    public void setPrenom_commande(String prenom_commande) {
        this.prenom_commande = prenom_commande;
    }

    public double getPrix_total_commande() {
        return prix_total_commande;
    }

    public void setPrix_total_commande(double prix_total_commande) {
        this.prix_total_commande = prix_total_commande;
    }

    public long getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(long date_commande) {
        this.date_commande = date_commande;
    }
}

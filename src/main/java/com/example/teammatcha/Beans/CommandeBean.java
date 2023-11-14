package com.example.teammatcha.Beans;

public class CommandeBean {
    private int id_commande;
    private String telephone_commande;
    private String nom_commande;
    private String prenom_commande;
    private Double prix_totale_commande;
    private Long date;

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

    public Double getPrix_totale_commande() {
        return prix_totale_commande;
    }

    public void setPrix_totale_commande(Double prix_totale_commande) {
        this.prix_totale_commande = prix_totale_commande;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public CommandeBean(String telephone_commande, String nom_commande, String prenom_commande, Double prix_totale_commande, Long date) {
        this.telephone_commande = telephone_commande;
        this.nom_commande = nom_commande;
        this.prenom_commande = prenom_commande;
        this.prix_totale_commande = prix_totale_commande;
        this.date = date;
    }

    public CommandeBean() {
    }
}

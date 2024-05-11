package com.melocode.projetjava;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
    private final StringProperty numeroClient;
    private final StringProperty numeroCommande;
    private final StringProperty nom;
    private final StringProperty prenom;
    private final StringProperty adresse;
    private final StringProperty telephone;

    public Client(String numeroClient, String numeroCommande, String nom, String prenom, String adresse, String telephone) {
        this.numeroClient = new SimpleStringProperty(numeroClient);
        this.numeroCommande = new SimpleStringProperty(numeroCommande);
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.adresse = new SimpleStringProperty(adresse);
        this.telephone = new SimpleStringProperty(telephone);
    }

    public String getNumeroClient() {
        return numeroClient.get();
    }

    public StringProperty numeroClientProperty() {
        return numeroClient;
    }

    public String getNumeroCommande() {
        return numeroCommande.get();
    }

    public StringProperty numeroCommandeProperty() {
        return numeroCommande;
    }

    public String getNom() {
        return nom.get();
    }

    public StringProperty nomProperty() {
        return nom;
    }

    public String getPrenom() {
        return prenom.get();
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public String getAdresse() {
        return adresse.get();
    }

    public StringProperty adresseProperty() {
        return adresse;
    }

    public String getTelephone() {
        return telephone.get();
    }

    public StringProperty telephoneProperty() {
        return telephone;
    }
}

package com.esprit.elife;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aissa
 */
public class Client {
    
    public String nom;
    private String adresse;
    protected int cin;
    float poid;
    
    public Client() {}
    
    public Client(String nom, String adresse, int cin, float poid) {
        this.nom = nom;
        this.adresse = adresse;
        this.cin = cin;
        this.poid = poid;
    }
    
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    float payer(float uht) {
        return poid * uht;
    }
    
    void afficher() {
        System.out.println("M./Mme " + nom + " habite à " + adresse);
    }
    
    int numCin() {
        return cin;
    }
    
    public String toString() {
        return "nom=" + nom + ", adresse=" + adresse
                + ", cin=" + cin + ", poid=" + poid;
    }
    
}

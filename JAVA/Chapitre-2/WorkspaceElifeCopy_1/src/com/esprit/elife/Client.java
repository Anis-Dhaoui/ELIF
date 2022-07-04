package com.esprit.elife;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Client {
    public static String nom;
    private static String adresse;
    protected int cin;
    float poid;
    
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    float payer(float uht){
        return poid * uht;
    }
    
    static void afficher(){
        System.out.println("M./Mme " + nom + " habite a " + adresse);
    }
    
    int numCin(){
        return cin;
    }
    
    public Client(){}
    
    public Client(String nom, String adresse, int cin, float poid){
        this.nom = nom;
        this.adresse = adresse;
        this.cin = cin;
        this.poid = poid;
    }
    
    public String toString(){
        return "nom: " + nom + ", addresse: " + adresse + ", cin: " + cin + ", poid: " + poid;
    }
    
    
}

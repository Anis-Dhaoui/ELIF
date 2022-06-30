/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Client {
    String nom;
    String adresse;
    int cin;
    float poid;
    
    float payer(float uht){
        return poid * uht;
    }
    
    void afficher(){
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

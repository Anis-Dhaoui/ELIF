package com.elife.prosit1;

import java.time.LocalDate;
import java.util.Date;

public class ProduitAlimentaire {
    
    private int identifiant;
    private float prix;
    String libelle, marque;
    LocalDate dateExpiration ;
    
    public ProduitAlimentaire(int identifiant, String libelle, String marque){
        this.identifiant = identifiant;
        this.marque= marque;
        this.libelle = libelle;
        dateExpiration = LocalDate.of(2023, 12, 31);
    }
       
    public ProduitAlimentaire(int identifiant, String libelle, String marque, float prix){
        this.identifiant = identifiant;
        this.marque= marque;
        this.libelle = libelle;
        this.prix = prix;
        dateExpiration = LocalDate.of(2023, 12, 31);
    }
    
    public ProduitAlimentaire(){
        dateExpiration = LocalDate.of(2023, 12, 31);
    }
    
    public void afficher(){
        System.out.println("identifiant= "+this.identifiant + "\n");
        System.out.println("libelle= "+this.libelle + "\n");
        System.out.println("marque= "+this.marque + "\n");
        System.out.println("prix= "+this.prix + "\n");
    }
    
    public void attribuerPrix(float prix){
        this.prix = prix;
    }
    
    
    
    public int getIdentifiant(){
        return identifiant;
    }
    
    public void setIdentifiant(int identifiant){
        this.identifiant = identifiant;
    }
    
    public float getPrix(){
        return prix;
    }
    
    public void setPrix(float prix){
        if (prix>0) {
            this.prix=prix;
        }else{
            System.out.println("Erreur ! Le prix doit etre positif !");
        }
    }
    
    public String toString() {
        return "id: "+identifiant + " - libelle: "+libelle+" - marque: "+marque+" - prix; "+prix + " - date: "+dateExpiration;
    }
}

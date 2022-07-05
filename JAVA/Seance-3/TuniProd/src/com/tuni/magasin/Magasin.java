package com.tuni.magasin;
import java.util.Scanner;


public class Magasin {
    private int identifiant;
    private String adresse;
    private int capaciteMagasin;
    private Produit produits[];
    final int CAPACITE_MAX = 50;

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        produits = new Produit[CAPACITE_MAX];
    }
    
    
    

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapaciteMagasin() {
        return capaciteMagasin;
    }

    public void setCapaciteMagasin(int capaciteMagasin) {
        this.capaciteMagasin = capaciteMagasin;
    }

    public void ajouterProduit(Produit p){
        if(capaciteMagasin<CAPACITE_MAX){
           produits[capaciteMagasin] = p;
           if(capaciteMagasin<CAPACITE_MAX-1)
           capaciteMagasin++;
        }
      
        
        
    }
    @Override
    public String toString() {
        String str = "";
        for(int i=0;i<capaciteMagasin;i++){
          str += produits[i]+ "\n" ; 
        }
        return "identifiant magasin : "+identifiant+
               " adresse magasin : "+ adresse+
               " capacite du magasin : "+capaciteMagasin+  "\n"+
                str;
    }
     
  
    
}

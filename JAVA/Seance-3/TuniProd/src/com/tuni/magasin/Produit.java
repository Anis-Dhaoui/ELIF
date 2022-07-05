package com.tuni.magasin;


public class Produit {
  private int identifient;
  private String libelle;
  private String marque;
  private float prix;

    public int getIdentifient() {
        return identifient;
    }

    public void setIdentifient(int identifient) {
        this.identifient = identifient;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if(prix<=0){
            System.err.println("le prix est negatif !");
        }else  this.prix = prix;
    }
   
   public Produit(){}
   
   public Produit(int identifient,String libelle,String marque){
   this.identifient = identifient;
   this.libelle = libelle;
   this.marque = marque;
   }
   
   public Produit(int identifient,String libelle,String marque,float prix){
   this.identifient = identifient;
   this.libelle = libelle;
   this.marque = marque;
   this.prix = prix;
   }
   
  public void affichier(){
   System.out.println("identifient : " +identifient+
           ", libelle :" +libelle+
           " ,marque :"+marque+" ,Prix : "+prix);
   }
   public String toString(){
    return "identifient : " + identifient+ 
            ", libelle :" + libelle+ 
            " ,marque :"+marque+" ,Prix : "+prix;
   }
   
     
   public boolean comparer(Produit p2){
       if(this.libelle == p2.libelle && this.identifient == p2.identifient && this.prix == p2.prix){
           return true;
       }
       return false;
   }
}

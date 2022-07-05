package com.tuni.produit;
import com.tuni.magasin.Produit;
import com.tuni.magasin.Magasin;


public class MainTest {
     public static void main(String args[]){
    
    Produit produit1 = new Produit();
    Produit produit2 = new Produit (50,"Lait","Vitalait");
    Produit produit3 = new Produit(5,"Lait","Vitalait");
    Produit produit4 = new Produit (3250,"Tomate","Sicam",1.200f);
   
//    produit1.affichier();
//    produit2.affichier();
//    produit3.affichier();
//    produit4.affichier();
    produit2.setPrix(0.700f);
    produit3.setPrix(0.900f);
    
//    produit2.affichier();
//    produit3.affichier();
   
    
//    System.out.println(produit1.toString());
//    System.out.println(produit2.toString());
//    System.out.println(produit3.toString());
//    System.out.println(produit4.toString());
   
    
    Magasin m1 = new Magasin(1, "siliana");
    m1.ajouterProduit(produit1);
    m1.ajouterProduit(produit2);
    m1.ajouterProduit(produit3);
    m1.ajouterProduit(produit4);
    System.out.println(m1.toString());
    System.out.println(m1.getCapaciteMagasin());
    
    System.out.println(produit2.comparer(produit3));
    
   }
}

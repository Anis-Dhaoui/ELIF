package com.elife.prosit1;


import com.elife.prosit1.ProduitAlimentaire;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FGH
 */
public class MainTest extends Object{
    
    public static void main(String[] args) {
        ProduitAlimentaire p1 = new ProduitAlimentaire();
        ProduitAlimentaire p2 = new ProduitAlimentaire(1021, "Lait" , "Delice");
        ProduitAlimentaire p3 = new ProduitAlimentaire(2510, "Yaourt" , "Vitalait");
        ProduitAlimentaire p4 = new ProduitAlimentaire(3250, "Tomate" , "Sicam", 1.2f);
        
       
        
//        p1.afficher();
//        System.out.println("-----------------------");
//        p2.afficher();
//        System.out.println("-----------------------");
//        p3.afficher();
//        System.out.println("-----------------------");
//        p4.afficher();
        
//        p2.prix= 0.7f;
        
        p1.setIdentifiant(5555); 
        p2.attribuerPrix(0.7f);
        p2.afficher();
        
        p1.setIdentifiant(5069);
        p1.libelle = "Chocolat";
        p1.marque = "Said";
        p1.setPrix(3.5f);
        
        p3.attribuerPrix(4.5f);
        
//        p1.afficher();
//        p2.afficher();
//        p3.afficher();
//        p4.afficher();
//        
//        System.out.println("*********************************");
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());
//        System.out.println(p4.toString());
//        
        Magasin m1 = new Magasin(1, "Monoprix", "Siliana");
        Magasin m2 = new Magasin(2, "Monoprix", "Kef");
        
        m1.ajouterProduit(p1);
        m1.ajouterProduit(new ProduitAlimentaire(1455, "Jus", "Danao", .98f));
        m1.ajouterProduit(p2);
        
        m2.ajouterProduit(p4);
        m2.ajouterProduit(p3);
        
        System.out.println(m1.toString());
        
        System.out.println("Le nombre total de produit dans tous les magasins est : " + Magasin.nbrProdAllMagasin);
        
    }
}

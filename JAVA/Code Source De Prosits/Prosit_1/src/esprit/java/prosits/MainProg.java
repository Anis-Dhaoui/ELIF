/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.prosits;

import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.Produit;

/**
 *
 * @author aissa
 */
public class MainProg {
    
    public static void main(String[] args) {
        // Question 1
        Produit p1 = new Produit();
        // Question 2
        Produit p2 = new Produit(1021, "Lait", "Délice");
        Produit p3 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p4 = new Produit(3250, "Tomate", "Sicam", 1.200f);
        // Question 3
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();
        // Question 4
        p2.setPrix(0.700f);
        p2.afficher();
        // Question 5
        p3.setPrix(0.5f);
        p1.setId(1000);
        p1.setLibelle("Oeuf");
        p1.setMarque("Mazraa");
        p1.setPrix(0.8f);
        // Question 6
        p1.afficher();
        p3.afficher();
        // Question 7
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println("**********");
        // Prosit 2
        Magasin m1 = new Magasin(1, "Ariana");
        m1.ajoutProduit(p1);
        m1.ajoutProduit(p2);
        m1.ajoutProduit(p3);
        m1.ajoutProduit(p4);
        System.out.println(m1.toString());
        
        Magasin m2 = new Magasin(2, "Seliana");
        m2.ajoutProduit(p1);
        m2.ajoutProduit(p2);
        m2.ajoutProduit(p3);
        
        Magasin magasins[] = {m1, m2};
        int capaciteTotale = 0;
        for(int i = 0; i < magasins.length; i++) {
            capaciteTotale += magasins[i].getCapacite();
        }
        System.out.println(capaciteTotale);
    }
}

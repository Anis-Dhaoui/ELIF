/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esprit.java.prosits;

//import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.*;

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
//        p1.afficher();
//        p2.afficher();
//        p3.afficher();
//        p4.afficher();
        // Question 4
        p2.setPrix(0.700f);
//        p2.afficher();
        // Question 5
        p3.setPrix(0.5f);
        p1.setId(1000);
        p1.setLibelle("Oeuf");
        p1.setMarque("Mazraa");
        p1.setPrix(0.8f);
        // Question 6
//        p1.afficher();
//        p3.afficher();
        // Question 7
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());
//        System.out.println(p4.toString());
        System.out.println("**********");
        // Prosit 2
        Magasin m1 = new Magasin(1, "Ariana", "xxx");
        m1.ajoutProduit(p1);
        m1.ajoutProduit(p2);
        m1.ajoutProduit(p3);
        m1.ajoutProduit(p4);
//        System.out.println(m1.toString());
        
        Magasin m2 = new Magasin(2, "Seliana", "yyy");
        m2.ajoutProduit(p1);
        m2.ajoutProduit(p2);
        m2.ajoutProduit(p3);
        
        Magasin magasins[] = {m1, m2};
        int capaciteTotale = 0;
        for(int i = 0; i < magasins.length; i++) {
            capaciteTotale += magasins[i].getCapacite();
        }
//        System.out.println(capaciteTotale);
        



        //Derniere prosit
        //Q1
        Magasin a = new Magasin(1, "Carefour", "Centre-ville");
        Magasin b = new Magasin(2, "Monoprix", "Menzah 6");   

        //Q2
        Caissier c1 = new Caissier(1, "Jamila", "Siliana", 6, 1234);
        Caissier c2 = new Caissier(2, "Anis", "Kairouan", 3, 0123);
        Vendeur v1 = new Vendeur(3, "Amal", "Nabeul", 4, 10);
        Responsable r1 = new Responsable(4, "Khalifa", "Tunis", 2, 300);
        
        a.ajoutEmp(c1);
        a.ajoutEmp(c2);
        a.ajoutEmp(v1);
        a.ajoutEmp(r1);
        
        
//        Vendeur v2 = new Vendeur();
//        Vendeur v3 = new Vendeur();
//        Vendeur v4 = new Vendeur();
//        Responsable r2 = new Responsable();
//        
//        b.ajoutEmp(v2);
//        b.ajoutEmp(v3);
//        b.ajoutEmp(v4);
//        b.ajoutEmp(r2);
       
//        System.out.println(c1.toString());
//        System.out.println("******************************************");
        System.out.println(a);
        System.out.println(b);

    }
}

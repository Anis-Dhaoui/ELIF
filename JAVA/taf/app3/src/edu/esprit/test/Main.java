/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.esprit.test;

import edu.esprit.entities.Acteur;
import edu.esprit.entities.sousclasses.Figurant;
import edu.esprit.entities.sousclasses.Realisateur;

/**
 *
 * @author f2c
 */
public class Main{
    public static void main(String[] args) {
        //Question 2:
        Acteur act1, act2 = new Acteur();
        Realisateur reali = new Realisateur(15, "Alain Marvel", 1222.5f);
        Figurant fig1 = new Figurant(5, "Julien", "France");
        Figurant fig2 = new Figurant(36, "Sami", "Algerie");
        
                Acteur acteur1 = new Acteur(9876,"Hend Sabri");
        Acteur acteur2 = new Acteur(12510, "Jaafer Guesmi", "Comedie");
        Acteur acteur3 = new Acteur(32350, "Dhafer Abeddine", "Drama", 40);
        
        
        //Question 3:
        //a:
        fig1.idFigurant = 24;
        fig1.afficher();
        
        //b:
        reali.setSalaireRealisateur(reali.getSalaireRealisateur() + 75.5f);
        reali.afficher();
        
        //Question 5:
            //cas 1(public vers private): idFigurant has private access in Figurant
           //cas 2(public vers default): idFigurant is not public in Figurant; cannot be accessed from outside package
        
        //Question 6:
        System.out.println(reali.getSalaireRealisateur());
        System.out.println(reali.AfficherNouveauSalaire());
    }
    
}

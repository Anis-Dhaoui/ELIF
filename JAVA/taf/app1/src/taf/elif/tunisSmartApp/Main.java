/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taf.elif.tunisSmartApp;

/**
 *
 * @author f2c
 */
public class Main {
    public static void main(String[] args) {
        //Question 1:
        Acteur acteur0 = new Acteur();
        
        //Question 2:
        Acteur acteur1 = new Acteur(9876,"Hend Sabri");
        Acteur acteur2 = new Acteur(12510, "Jaafer Guesmi", "Comedie");
        Acteur acteur3 = new Acteur(32350, "Dhafer Abeddine", "Drama", 40);
        
        //Question 3:
        acteur0.afficher();
        acteur1.afficher();
        acteur2.afficher();
        acteur3.afficher();
        
        //Question 4:
        acteur2.setAge(99);
        acteur2.afficher();
        
        //Question 5:
        acteur1.setDomArtis("Romantique");
        acteur1.setAge(50);
        
        //Question 6:
        acteur1.afficher();
        
        //Question 7:
        acteur1.setSalaire(500f);
        acteur2.setSalaire(1500f);
        acteur3.setSalaire(2000f);
        
        acteur1.afficher();
        acteur2.afficher();
        acteur3.afficher();
    }
    
}

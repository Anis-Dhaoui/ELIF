/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces.collection.main;

import iterface.collection.list.EspritArrayList;
import iterface.collection.list.Etudiant;

/**
 *
 * @author f2c
 */
public  class MainProg {
    public static void main(String arg[]){
        Etudiant eVide = new Etudiant();
        Etudiant e1 = new Etudiant(0, "Anis", "Dhaoui");
        Etudiant e2 = new Etudiant(1, "Mohamed", "Karoui");
        Etudiant e3 = new Etudiant(0, "John", "Smith");
        
//        System.out.println(e1.toString() + "\n");
//        System.out.println(e2.toString() + "\n");
//        System.out.println(e3.toString());
//        System.out.println("*******************************************************\n");
//        
//        System.out.println(e1.equals(e2));
//        System.out.println(e1.equals(e3));

    EspritArrayList eal1 = new EspritArrayList();
    eal1.ajouterEtud(e1);
    }
    
}

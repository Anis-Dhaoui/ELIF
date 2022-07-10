/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshop;

/**
 *
 * @author aissa
 */
public class ClientEntreprise extends Client {
    private String matricule;
    
    public ClientEntreprise(int id, String nom, String matricule) {
        super(id, nom);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    
    public void faireDevis() {
        System.out.println("Faire devis");
    }
    
    public void acheter() {
        System.out.println("Je suis un CE");
    }
}

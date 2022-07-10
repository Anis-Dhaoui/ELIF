/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshop;

/**
 *
 * @author aissa
 */
public class EntrepriseEtrangere extends ClientEntreprise {
    private String pays;
    
    public EntrepriseEtrangere(int id, String nom, String matricule, String pays) {
        super(id, nom, matricule);
        this.pays = pays;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    
    public void ajouterRs() {
        System.out.println("RS");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshop;

/**
 *
 * @author aissa
 */
public class EntrepriseLocale extends ClientEntreprise {
    private String gov;
    
    public EntrepriseLocale(int id, String nom, String matricule, String gov) {
        super(id, nom, matricule);
        this.gov = gov;
    }

    public String getGov() {
        return gov;
    }

    public void setGov(String gov) {
        this.gov = gov;
    }
    
    public void ajouterTva() {
        System.out.println("TVA");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshopp1;

/**
 *
 * @author aissa
 */
public class Voiture {
    private String matricule;
    private Personne pers;
    
    public Voiture(String matricule, Personne pers) {
        this.matricule = matricule;
        this.pers = pers;
    }
    
    public String getMatricule(){
        return this.matricule;
    }
    
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    
    public String toString() {
        return "Matricule : " + this.matricule +
                " est la proprio de " + this.pers.getNom() +
                " titulaire de cin " + this.pers.getCin();
    }
}

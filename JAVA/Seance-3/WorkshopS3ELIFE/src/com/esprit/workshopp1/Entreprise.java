/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshopp1;

/**
 *
 * @author aissa
 */
public class Entreprise {
    private String nom;
    private Personne pers[];
    
    public Entreprise(String nom, Personne personnes[]) {
        this.nom = nom;
        this.pers = personnes;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String toString() {
        String str = "";
        for(int i = 0; i < this.pers.length; i++) {
            //str = str + pers[i];
            str += pers[i] + "\n";
        }
        return "L'entreprise " + this.nom + " a les personnes " + str;
    }
}

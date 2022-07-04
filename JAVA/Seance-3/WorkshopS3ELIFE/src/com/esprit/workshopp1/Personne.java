/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshopp1;

/**
 *
 * @author aissa
 */
public class Personne {
    
    private String nom;
    private int cin;
    
    public Personne(String nom, int cin) {
        this.nom = nom;
        this.cin = cin;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getCin() {
        return this.cin;
    }
    
    public void setCin(int cin) {
        this.cin = cin;
    }
    
    public String toString() {
        return "Nom=" + this.nom + ", cin=" + this.cin;
    }
}

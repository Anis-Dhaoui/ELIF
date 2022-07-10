package edu.esprit.entities.sousclasses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author f2c
 */
public class Figurant {
    public int idFigurant;
    private String nomFigurant;
    String paysFigurant;

    public Figurant(int idFigurant, String nomFigurant, String paysFigurant) {
        this.idFigurant = idFigurant;
        this.nomFigurant = nomFigurant;
        this.paysFigurant = paysFigurant;
    }

    public String getNomFigurant() {
        return nomFigurant;
    }

    public void setNomFigurant(String nomFigurant) {
        this.nomFigurant = nomFigurant;
    }
    
    public void afficher() {
        System.out.println("Identifiant: " + this.idFigurant + "\nNom: " + this.nomFigurant + "\nPays:: " + this.paysFigurant + "\n");
    }
}

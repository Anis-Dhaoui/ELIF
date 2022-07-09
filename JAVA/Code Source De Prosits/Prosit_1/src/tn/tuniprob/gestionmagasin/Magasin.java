/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

import tn.tuniprob.gestionmagasin.Produit;

/**
 *
 * @author aissa
 */
public class Magasin {
    
    private int id;
    private String addresse;
    private int capacite;
    private Produit produits[];
    
    final int CAPACITE_PRODUITS_MAX = 50;
    
    public Magasin(int id, String addresse) {
        this.id = id;
        this.addresse = addresse;
        produits = new Produit[CAPACITE_PRODUITS_MAX];
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    
    public void ajoutProduit(Produit p) {
        if(capacite < CAPACITE_PRODUITS_MAX) {
            produits[capacite] = p;
            if(capacite < CAPACITE_PRODUITS_MAX - 1) {
                capacite++;
            }
        }
    }
    
    public String toString() {
        String str = "";
        for(int i = 0; i < capacite; i++) {
            str += "\n" + produits[i];
        }
        return "id=" + id + ", addresse=" + addresse +
                ", capacité=" + capacite + ", produits=" + str;
    }
}

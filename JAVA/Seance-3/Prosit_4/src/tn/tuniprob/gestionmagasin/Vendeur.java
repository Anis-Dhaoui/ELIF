/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author f2c
 */
public class Vendeur extends Employes{
    private int tauxDeVente;
    
    public Vendeur() {
    }

    public Vendeur(int id, String nom, String adresse, int nbr_heures, int tauxDeVente) {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
    
}

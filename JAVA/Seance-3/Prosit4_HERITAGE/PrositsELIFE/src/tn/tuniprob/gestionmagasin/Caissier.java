/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author f2c
 */
public class Caissier extends Employes{
    private int numCaisse;

    public Caissier() {
    }

    public Caissier(int id, String nom, String adresse, int nbr_heures, int numCaisse) {
        
        super(id, nom, adresse, nbr_heures);
        this.numCaisse = numCaisse;
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }
    
    
    
    
}

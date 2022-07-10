/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author f2c
 */
public class Responsable extends Employes{
    private float prime;
    
    public Responsable() {
    }

    public Responsable(int id, String nom, String adresse, int nbr_heures, int prime) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }
    
    
    
}

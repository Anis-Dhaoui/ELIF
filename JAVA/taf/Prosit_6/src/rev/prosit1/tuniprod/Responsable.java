/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rev.prosit1.tuniprod;

/**
 *
 * @author f2c
 */
public class Responsable extends Employee {

    private float prime;

    public Responsable(float prime, int id, String nom, String adresse, float nb_heurs) {
        super(id, nom, adresse, nb_heurs);
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "\nIdentifiant: " + getId() + "\nNom: " + getNom() + "\nAdresse: " + getAdresse()
                + "\nNombre d'heures: " + getNb_heurs() + "\nPrime: " + this.prime;
    }
}

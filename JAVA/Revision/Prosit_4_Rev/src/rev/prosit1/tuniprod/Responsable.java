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

    public void calculerSalaire() {
        final float MONTANT_PAR_HEURE = 10f;
        float heureSup = this.getNb_heurs() - 160;
        if (heureSup < 0) {
            heureSup = 0;
        }
        float montantHeuresSup = heureSup * MONTANT_PAR_HEURE * 1.2f;
        float montantHeuresNormales = (this.getNb_heurs() - heureSup) * MONTANT_PAR_HEURE;
        float res = montantHeuresSup + montantHeuresNormales + this.prime;
        System.out.println("Le montant total est " + res);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrime: " + this.prime;
    }
}

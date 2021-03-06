/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rev.prosit1.tuniprod;

/**
 *
 * @author f2c
 */
public class Caissier extends Employee {

    private int numeroDeCaisse;

    public Caissier(int numeroDeCaisse, int id, String nom, String adresse, float nb_heurs) {
        super(id, nom, adresse, nb_heurs);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public void calculerSalaire() {
        final float MONTANT_PAR_HEURE = 5f;
        float heureSup = this.getNb_heurs() - 180;
        if (heureSup < 0) {
            heureSup = 0;
        }
        float montantHeuresSup = heureSup * MONTANT_PAR_HEURE * 1.15f;
        float montantHeuresNormales = (this.getNb_heurs() - heureSup) * MONTANT_PAR_HEURE;
        float res = montantHeuresSup + montantHeuresNormales;
        System.out.println("Le montant total est " + res);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de caisse: " + this.numeroDeCaisse;
    }

}

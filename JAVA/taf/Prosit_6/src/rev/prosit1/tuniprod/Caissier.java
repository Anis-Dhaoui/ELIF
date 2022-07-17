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

    @Override
    public String toString() {
        return "\nIdentifiant: " + getId() + "\nNom: " + getNom() + "\nAdresse: " + getAdresse()
                     + "\nNombre d'heures: " + getNb_heurs() + "\nNumero de caisse: " + this.numeroDeCaisse;
    }

}

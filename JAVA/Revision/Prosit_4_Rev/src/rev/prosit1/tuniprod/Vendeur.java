/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rev.prosit1.tuniprod;

/**
 *
 * @author f2c
 */
public class Vendeur extends Employee {

    private int tauxDeVente;

    public Vendeur(int tdv, int id, String nom, String adresse, float nb_heurs) {
        super(id, nom, adresse, nb_heurs);
        this.tauxDeVente = tdv;
    }

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    public void calculerSalaire() {
        float res = 450 * this.tauxDeVente;
        System.out.println("Le montant total est " + res);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaux de vente: " + this.tauxDeVente;
    }
}

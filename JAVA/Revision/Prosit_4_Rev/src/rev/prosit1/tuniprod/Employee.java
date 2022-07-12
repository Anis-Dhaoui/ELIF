/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rev.prosit1.tuniprod;

/**
 *
 * @author f2c
 */
public class Employee {

    private int id;
    private String nom;
    private String adresse;
    private float nb_heurs;

    public Employee() {
    }

    public Employee(int id, String nom, String adresse, float nb_heurs) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heurs = nb_heurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getNb_heurs() {
        return nb_heurs;
    }

    public void setNb_heurs(float nb_heurs) {
        this.nb_heurs = nb_heurs;
    }

    @Override
    public String toString() {
        return "\nIdentifiant: " + this.id + "\nNom: " + this.nom + "\nAdresse: " + this.adresse
                + "\nNombre d'heures: " + this.nb_heurs + "\n";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author aissa
 */
public class Produit {
    
    private int id;
    private String libelle;
    private String marque;
    private float prix;

    public Produit() {
    }

    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if(prix <= 0) {
            System.out.println("Le prix ne peut pas etre négatif !");
        } else {
            this.prix = prix;
        }
    }
    
    public void afficher() {
        System.out.println("ProduitAlimentaire{" + "id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + '}');
    }
    
    public boolean comparer(Produit p) {
        return this.id == p.getId() && this.libelle.equals(p.getLibelle()) && this.prix == p.getPrix();
    }
    
    public static boolean comparer(Produit p1, Produit p2) {
        return p1.getId() == p2.getId() && p1.getLibelle().equals(p2.getLibelle()) && p1.getPrix() == p2.getPrix();
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + '}';
    }
}

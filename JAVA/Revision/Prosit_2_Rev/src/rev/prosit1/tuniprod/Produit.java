/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rev.prosit1.tuniprod;

import java.util.Date;

/**
 *
 * @author f2c
 */
public class Produit {
    private int id;
    private float prix;
    private String libellee, marque;
    private Date dateExp;
    
    public Produit(){}
    
    public Produit(int id, String lib, String marq){
        this.id = id;
        this.libellee = lib;
        this.marque = marq;
    }
    
    public Produit(int id, String lib, String marq, int prix){
        this.id = id;
        this.libellee = lib;
        this.marque = marq;
        this.prix = prix;
    }
    
    public void afficher(){
        System.out.println("identifiant: " + this.id + "\n" +
                           "Libelee: " + this.libellee + "\n" +
                           "Marque: " + this.marque + "\n" +
                           "Prix: " + this.prix + "\n" +
                           "Date Exp: " + this.dateExp
        );
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if(prix <= 0){
            System.out.println("Le prix ne peut pas etre negatif");
        }else{
            this.prix = prix;
        }
    }

    public String getLibellee() {
        return libellee;
    }

    public void setLibellee(String libellee) {
        this.libellee = libellee;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Date getDateExp() {
        return dateExp;
    }

    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }
    
    @Override
    public String toString(){
        return (
                "identifiant: " + this.id + "\n" +
                "Libelee: " + this.libellee + "\n" +
                "Marque: " + this.marque + "\n" +
                "Prix: " + this.prix + "\n" +
                "Date Exp: " + this.dateExp
        );
    }
}

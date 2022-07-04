/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elife.prosit1;

/**
 *
 * @author FGH
 */
public class Magasin {
    
    public static int nbrProdAllMagasin = 0;
    
    private int id, nbrProd = 0;
    private String nom, address;
    private final int CAPACITE = 50 ;
    private ProduitAlimentaire[] listProduits ;
    
    public Magasin(){
        listProduits = new ProduitAlimentaire[CAPACITE];
    }
    
    public Magasin(int id, String nom, String address){
        this.id= id;
        this.address = address;
        this.nom = nom;
        listProduits = new ProduitAlimentaire[CAPACITE];
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void ajouterProduit(ProduitAlimentaire p){
        
        if (nbrProd < CAPACITE) {
            listProduits[nbrProd] = p;
            nbrProdAllMagasin++;
            nbrProd++;
        }else{
            System.out.println("Le magasin est plein !");
        }
    }    
    
    @Override
    public String toString(){
        String affichage = "id: "+id+" - nom: "+nom+" - address: "+address+"\nListProduits :\n";
        
        for (int i = 0; i < nbrProd; i++) {
            affichage += "id= "+ listProduits[i].getIdentifiant()+"\n";
            affichage += "Libelle= "+ listProduits[i].libelle+"\n";
            affichage += "Marque= "+ listProduits[i].marque+"\n";
            affichage += "Prix= "+ listProduits[i].getPrix()+"\n";
            
        }
        
        return affichage;
    }
}

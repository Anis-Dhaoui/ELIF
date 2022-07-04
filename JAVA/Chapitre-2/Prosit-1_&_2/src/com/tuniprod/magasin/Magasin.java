/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuniprod.magasin;

/**
 *
 * @author f2c
 */
public class Magasin {
    private int id;
    private String  adresse;
    private int capMag;
    private Produit prod[];
    
    public Magasin(int id, String addr, int capMag, Produit prod[]){
        this.id = id;
        this.adresse = addr;
        this.capMag = capMag;
        this.prod = prod;
    }
    
    public int getId(){
        return this.id;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public int getCapMag(){
        return this.capMag;
    }
    public Produit[] getProd(){
        return this.prod;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setAdresse(String adr){
        this.adresse = adr;
    }
    public void setCapMag(int capMag){
        this.capMag = capMag;
    }

 
}

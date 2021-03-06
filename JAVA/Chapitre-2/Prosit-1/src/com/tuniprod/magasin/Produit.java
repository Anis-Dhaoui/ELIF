/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuniprod.magasin;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author f2c
 */
public class Produit {
    int id;
    String lib;
    String marq;
    float prix;
    Date datExp;
//  LocalDate datExp;
    
    public Produit(){}
    
    public Produit(int id, String lib, String marq){
        this.id = id;
        this.lib = lib;
        this.marq = marq;
    }
    
    public Produit(int id, String lib, String marq, float prix){
        this.id = id;
        this.lib = lib;
        this.marq = marq;
        this.prix = prix;
    }
        
    void afficher(){
        System.out.println("id: " + id + " libelee: " + lib + " marque: " + marq + " prix: " + prix + " Date-Exp: " + datExp);
    }
    
    public String toString(){
        return "id: " + id + ", libelee: " + lib + ", marque: " + marq + ", prix: " + prix;
    }
}

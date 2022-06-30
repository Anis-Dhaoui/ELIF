/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuniprod.magasin;

/**
 *
 * @author f2c
 */
public class mainProd {
    public static void main(String[] args) {
        Produit P1 = new Produit();
        Produit a = new Produit(1021, "lait", "delice");
        Produit b = new Produit(2510, "yayourt", "vitalait");
        Produit c = new Produit(3250, "tomate", "sicam", 1.200f);
        
        a.afficher();
        b.afficher();
        c.afficher();
        
        a.prix = 0.700f;
        a.afficher();
        b.prix = 0.400f;
        b.afficher();
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}

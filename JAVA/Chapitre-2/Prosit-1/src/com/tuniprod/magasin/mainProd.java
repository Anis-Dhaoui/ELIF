/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuniprod.magasin;

import java.text.*;
//import java.time.LocalDate;

/**
 *
 * @author f2c
 */
public class mainProd {
    public static void main(String[] args) throws ParseException {
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
        
        //Q 8 Methode 1:
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
        a.datExp = formatter.parse("20-05-2022");
        a.afficher();
        
        b.datExp = formatter.parse("10-10-2023");
        b.afficher();
        
        c.datExp = formatter.parse("05-07-2024");
        c.afficher();
        
        //Q 8 Methode 2:
//        a.datExp = LocalDate.of(2022,05,20);
//        a.afficher();
//        
//        b.datExp = LocalDate.of(2023,10,10);
//        b.afficher();
//        
//        c.datExp = LocalDate.of(2024,07,05);
//        c.afficher();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshopp2;

import com.esprit.workshopp1.*;
/**
 *
 * @author aissa
 */
public class MainProg {
    public static void main(String[] args) {
        /*Personne p1 = new Personne("Ali", 99999999);
        Voiture v1 = new Voiture("200 Tunisie 9999", p1);*/
        Voiture v1 = new Voiture("200 Tunisie 9999", new Personne("Ali", 99999999));
        System.out.println(v1);
        
        Personne personnes[] = new Personne[2];
        personnes[0] = new Personne("Med", 88888888);
        personnes[1] = new Personne("Fedi", 77777777);
        Entreprise ent1 = new Entreprise("Délice", personnes);
        System.out.println(ent1);
    }
}

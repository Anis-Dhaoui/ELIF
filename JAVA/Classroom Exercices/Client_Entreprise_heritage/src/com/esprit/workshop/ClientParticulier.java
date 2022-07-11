/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshop;

/**
 *
 * @author aissa
 */
public class ClientParticulier extends Client {
    private int cin;
    
    public ClientParticulier() {
        super();
    }
    
    public ClientParticulier(int id, String nom, int cin) {
        super(id, nom);
        this.cin = cin;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }
    
    public void payer() {
        System.out.println("Je paie");
    }
    
    @Override
    public void acheter() {
        System.out.println("Je suis un CP");
    }
}

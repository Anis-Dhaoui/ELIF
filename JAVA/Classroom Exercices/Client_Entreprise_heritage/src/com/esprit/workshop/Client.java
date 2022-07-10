/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshop;

/**
 *
 * @author aissa
 */
public class Client {
    private int id;
    private String nom;
    
    public Client() {}
    
    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
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
    
    public void acheter() {
        System.out.println("J'achète");
    }
    
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(this.getClass() != obj.getClass())
            return false;
        
        final Client other = (Client)obj;
        if(this.id != other.getId())
            return false;
        if(!this.nom.equals(other.getNom()))
            return false;
        return true;
    }
}

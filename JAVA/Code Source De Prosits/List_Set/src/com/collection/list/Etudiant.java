/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collection.list;

/**
 *
 * @author aissa
 */
public class Etudiant implements Comparable<Etudiant> {

    private int id;
    private String nom;
    private String prenom;

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    /*
    public int compareTo(Object o) {
        Etudiant e = (Etudiant) o;
        //if(this.id > e.getId()) {
        //    return 1;
        //} else if (this.id < e.getId()) {
        //    return -1;
        //} else {
        //    return 0;
        //}
        return this.id - e.getId();
    }*/

    @Override
    public int compareTo(Etudiant o) {
        return this.id - o.getId();
    }
}

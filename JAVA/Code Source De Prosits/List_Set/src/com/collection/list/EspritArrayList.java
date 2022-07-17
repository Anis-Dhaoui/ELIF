/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collection.list;

import java.util.*;

/**
 *
 * @author aissa
 */
public class EspritArrayList implements University {
    
    private List<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for(int i = 0; i < etudiants.size(); i++) {
            if(etudiants.get(i).getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for(int i = 0; i < etudiants.size(); i++) {
            System.out.println(etudiants.get(i).toString());
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, new TriParNom());
    }
    
}

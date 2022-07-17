/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aissa
 */
public class EspritHashSet implements GestionEnseignant {
    
    Set<Enseignant> enseignants = new HashSet<>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant element : enseignants) {
            if(element.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for(Enseignant ele : enseignants) {
            System.out.println(ele.toString());
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.collection.list;

import java.util.Comparator;

/**
 *
 * @author aissa
 */
public class TriParNom implements Comparator<Etudiant> {
    
    public int compare(Etudiant o1, Etudiant o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}

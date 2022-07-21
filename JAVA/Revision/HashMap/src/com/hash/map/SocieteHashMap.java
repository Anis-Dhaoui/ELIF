/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hash.map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author f2c
 */
public class SocieteHashMap implements InterfaceSociete {

    Map<Employe, Departement> empDep = new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe emp, Departement dep) {
        empDep.put(emp, dep);
    }

    @Override
    public void supprimerEmploye(Employe emp) {
        empDep.remove(emp);
    }
//////////////////////////////
    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> elem : empDep.entrySet()) {
            System.out.println(elem.getKey() + " = " + elem.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe elem : empDep.keySet()) {
            System.out.println(elem);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement elem : empDep.values()) {
            System.out.println(elem);
        }
    }
///////////////////////////////:
    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(empDep.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return empDep.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return empDep.containsValue(e);
    }
}

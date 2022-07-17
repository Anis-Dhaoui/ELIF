/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.java;

/**
 *
 * @author aissa
 */
public class ClasseImplementation extends SuperClasse implements IExemple, IExemple2 {
    
    public void afficher() {
        System.out.println("Bonjour");
    }
    
    public int addition(int op1, int op2) {
        return op1 + op2;
    }
    
    public void a() {
        System.out.println("A");
    }
}

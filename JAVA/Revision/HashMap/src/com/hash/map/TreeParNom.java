/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hash.map;

import java.util.Comparator;

/**
 *
 * @author f2c
 */
public class TreeParNom implements Comparator<Employe>{
        @Override
        public int compare(Employe o1, Employe o2) {
        return o1.getPrenom().compareTo(o2.getPrenom());
    }
}

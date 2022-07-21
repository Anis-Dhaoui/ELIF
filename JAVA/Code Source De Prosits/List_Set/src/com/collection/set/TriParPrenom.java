package com.collection.set;

import java.util.Comparator;

/**
 *
 * @author aissa
 */
public class TriParPrenom implements Comparator<Enseignant> {
   
    public int compare(Enseignant o1, Enseignant o2) {
        return o1.getPrenom().compareTo(o2.getPrenom());
    }
}
package com.collection.list;

import java.util.Comparator;

/**
 *
 * @author aissa
 */
public class TriParId implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return o1.getId() - o2.getId();
    }
}

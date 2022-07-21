/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author aissa
 */
public class Magasin extends Employes{

    private int id;
    private String addresse;
    private String libelee;
    private int capacite;
    private int capaciteEmp;
    private Produit produits[];
    private Employes employes[];

    final int CAPACITE_PRODUITS_MAX = 50;
    final int CAPACITE_EMP_MAX = 20;

    public Magasin(int id, String libelee, String addresse) {
        this.id = id;
        this.libelee = libelee;
        this.addresse = addresse;
        produits = new Produit[CAPACITE_PRODUITS_MAX];
        employes = new Employes[CAPACITE_EMP_MAX];
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void ajoutProduit(Produit p) {
        if (!chercherProduit(p)) {
            if (capacite < CAPACITE_PRODUITS_MAX) {
                produits[capacite] = p;
                if (capacite < CAPACITE_PRODUITS_MAX - 1) {
                    capacite++;
                }
            }
        } else {
            System.out.println("Ce produit existe déjà !");
        }
    }
    
    public void ajoutEmp(Employes emp) {

        if (capaciteEmp < CAPACITE_EMP_MAX) {
            employes[capaciteEmp] = emp;
            if (capaciteEmp < CAPACITE_EMP_MAX - 1) {
                capaciteEmp++;
            }
        }
    }

    public boolean chercherProduit(Produit p) {
        for (int i = 0; i < capacite; i++) {
            if (this.produits[i].comparer(p)) {
                return true;
            }
        }
        return false;
    }
    
    public void supprimerProduit(Produit p) {
        if(chercherProduit(p)) {
            int index = 0;
            for(int i = 0; i < capacite; i++) {
                if(produits[i].comparer(p)) {
                    index = i;
                    break;
                }
            }
            for(int i = index; i < capacite - 1; i++) {
                produits[i] = produits[i+1];
            }
            produits[capacite-1] = null;
            capacite--;
        } else {
            System.out.println("Ce produit n'existe pas !");
        }
    }
    
    public static Magasin supMagasin(Magasin m1, Magasin m2) {
        if(m1.getCapacite() > m2.getCapacite()) {
            return m1;
        } else {
            return m2;
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < capacite; i++) {
            str += "\n" + produits[i];
        }
        String allProd = "id=" + id + ", addresse=" + addresse
                         + ", capacité=" + capacite + ", produits=" + str + "\n";

        
        String str1 = "";
        for (int i = 0; i < capaciteEmp; i++) {
            str1 += "\n" + employes[i].toString();
        }
        String allEmp = "Employes: " + str1;
        
        return allProd + allEmp;
    }
}

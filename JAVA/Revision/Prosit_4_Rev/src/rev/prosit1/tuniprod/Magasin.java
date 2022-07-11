/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rev.prosit1.tuniprod;

/**
 *
 * @author f2c
 */
public class Magasin {

    private int id;
    private String adresse;
    private int capacite;
    private Produit prodTab[];

    public Magasin() {
    }

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
        prodTab = new Produit[50];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void ajoutProd(Produit prod) {
        if (!chercheProd(prod)) {
            if (capacite <= 50) {
                prodTab[capacite] = prod;
                capacite++;
                System.out.println("Produit ajouté avec succés");
            }
        } else {
            System.out.println("Prouit déja exist");
        }
    }

    public boolean chercheProd(Produit p) {
        for (int i = 0; i < capacite; i++) {
            if (p.getId() == this.prodTab[i].getId()) {
                return true;
            }
        }
        return false;
    }

    public void supprimerProd(Produit p) {
        for (int j = 0; j < capacite; j++) {
            if (p.comparer(this.prodTab[j])) {
                for (int i = j; i < capacite; i++) {
                    if (capacite - 1 != j) {
                        prodTab[i] = prodTab[i + 1];
                    } else {
                        prodTab[j] = null;
                    }
                }
            }
            break;
        }
        capacite--;
    }
    
    public void higherProd(Magasin m){
        if(m.getCapacite() > this.getCapacite()){
            System.out.println(m.toString());
        }else{
            System.out.println(this.toString());
        }
    }

    @Override
    public String toString() {
        String prodList = "";
        for (int i = 0; i < capacite; i++) {
            prodList += prodTab[i];
        }
        return "Identifiant: " + this.id + "\nAdresse: " + this.adresse + "\nCapacité:" + this.capacite + "\nProduit:[\n" + prodList + "\n]";
    }

}

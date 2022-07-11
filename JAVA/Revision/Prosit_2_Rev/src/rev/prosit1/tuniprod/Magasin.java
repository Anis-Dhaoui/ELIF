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
    private  int id;
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
    
    public void ajoutProd(Produit prod){
        if(capacite <= 50 ){
                prodTab[capacite] = prod;
                capacite++;
        }
    }
    
    public String toString(){
        String prodList = "";
        for(int i = 0; i < capacite; i++){
            prodList += prodTab[i];
        }
        return "Identifiant: " + this.id + "\nAdresse: " + this.adresse + "\nCapacité:" + this.capacite + "\nProduit:[\n" + prodList + "\n]";
    }
    
}

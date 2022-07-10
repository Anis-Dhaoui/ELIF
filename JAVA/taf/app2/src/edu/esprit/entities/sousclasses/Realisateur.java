package edu.esprit.entities.sousclasses;

public class Realisateur {
    public int idRealisateur;
    protected String nomRealisateur;
    private float salaireRealisateur;

    public Realisateur(int idRealisateur, String nomRealisateur, float salaireRealisateur) {
        this.idRealisateur = idRealisateur;
        this.nomRealisateur = nomRealisateur;
        this.salaireRealisateur = salaireRealisateur;
    }

    public float getSalaireRealisateur() {
        return salaireRealisateur;
    }

    public void setSalaireRealisateur(float salaireRealisateur) {
        this.salaireRealisateur = salaireRealisateur;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }
    
    public void afficher() {
        System.out.println("Identifiant: " + this.idRealisateur + "\nNom: " + this.nomRealisateur + "\nSalaire: " + this.salaireRealisateur + "\n");
    }
    
//    private float calculNouveauSalaire(){
//        return this.salaireRealisateur + 200;
//    }
}

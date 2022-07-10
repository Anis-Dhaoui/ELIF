package edu.esprit.entities;

public class Acteur {

    private int id, ncp, age;
    private String nom, domArtis;
    private float salaire;

    public Acteur() {
    }

    public Acteur(int id, String nom, String domArtis, int age) {
        this.id = id;
        this.nom = nom;
        this.domArtis = domArtis;
        this.age = age;
    }

    public Acteur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Acteur(int id, String nom, String domArtis) {
        this.id = id;
        this.nom = nom;
        this.domArtis = domArtis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNcp() {
        return ncp;
    }

    public void setNcp(int ncp) {
        this.ncp = ncp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDomArtis() {
        return domArtis;
    }

    public void setDomArtis(String domArtis) {
        this.domArtis = domArtis;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        if(salaire >= 1000){
            this.salaire = salaire;
        }else{
            System.out.println("Veuillez entrer un salaire >= 1000");
        }
        
    }

    public void afficher() {
        System.out.println("Identifiant: " + this.id + "\nNom: " + this.nom + "\nDomaine Artistique: " + this.domArtis + "\nAge: " + this.age + "\nSalaire: " + this.salaire + "\n");
    }
}

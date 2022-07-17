/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterface.collection.list;

/**
 *
 * @author f2c
 */
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    
    public Etudiant(){}

    public Etudiant(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        
        return this.id == other.id;
    }
    
//        @Override
//    public boolean equals(Object obj) {
//        if(obj == null){
//            return false;
//        }
//        if(this != obj){
//            return false;
//        }
//        if(this.getClass() != obj.getClass()){
//            return false;
//        }
//        
//        final Etudiant aux = (Etudiant) obj;
//        
//        if(this.id == aux.id){
//            return  true;
//        }
//        
//        return true;
//    }



    @Override
    public String toString() {
        return "Identifiant: " + this.id + "\nNom: " + this.nom  + "\nPrenom: " + this.prenom ;
    }
    
    
    
    
}

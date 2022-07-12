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
    private String nom;
    private String adresse;
    private int capacite;
    private Produit prodTab[];
    private Employee empTab[];
    private int capacitEmp;

    public Magasin() {
    }

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        prodTab = new Produit[50];
        empTab = new Employee[20];
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

    public Employee[] getEmpTab() {
        return empTab;
    }

    public void setEmpTab(Employee[] empTab) {
        this.empTab = empTab;
    }

    public int getCapacitEmp() {
        return capacitEmp;
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

    public void higherProd(Magasin m) {
        if (m.getCapacite() > this.getCapacite()) {
            System.out.println(m.toString());
        } else {
            System.out.println(this.toString());
        }
    }

    public void ajoutEmp(Employee emp) {
        if (capacitEmp < 20) {
            empTab[capacitEmp] = emp;
            capacitEmp++;
        }
    }
    public static final String ANSI_GREEN = "\u001B[32m";
    @Override
    public String toString() {
        String prodList = "";
        for (int i = 0; i < capacite; i++) {
            prodList += prodTab[i];
        }

        String empList = "";
        for (int i = 0; i < capacitEmp; i++) {
            empList += empTab[i];
        }
        return "Identifiant: " + this.id + "\nNom: " + this.nom + "\nAdresse: " + this.adresse +
                     "\nCapacité:" + this.capacite + "\n" + ANSI_GREEN + "Produit:[\n" + prodList + "\n]" + "\n" + ANSI_GREEN + "Employés:[\n" + empList + "\n]";
    }

}

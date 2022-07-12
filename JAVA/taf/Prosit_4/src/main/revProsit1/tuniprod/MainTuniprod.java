package main.revProsit1.tuniprod;

import java.text.*;
import java.util.Arrays;
import rev.prosit1.tuniprod.Caissier;
import rev.prosit1.tuniprod.Employee;
import rev.prosit1.tuniprod.Magasin;
import rev.prosit1.tuniprod.Produit;
import rev.prosit1.tuniprod.Responsable;
import rev.prosit1.tuniprod.Vendeur;

public class MainTuniprod {

    public static void main(String arg[]) throws ParseException {
        //QUELQUE INSTRUCTION DE PROSIT 1
        Produit p1 = new Produit(1021, "Lait", "Delice");
        Produit p2 = new Produit(2510, "Yayourt", "Vitalait");
        Produit p3 = new Produit(3250, "Tomate", "Sicam", -10);
        p1.setPrix(0.7f);
        p2.setPrix(0.5f);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        p1.setDateExp(formatter.parse("20-05-2022"));
        p2.setDateExp(formatter.parse("25-08-2023"));
        p3.setDateExp(formatter.parse("30-10-2024"));
        //FIN PROSIT 1

        //QUELQUE INSTRUCTION DE PROSIT 2
        //FIN PROSIT 2
        //QUELQUE INSTRUCTION DE PROSIT 3
        //FIN PROSIT 2
        //Question 1:
        Magasin m1 = new Magasin(1, "Carrefour", "Centre-ville");
        Magasin m2 = new Magasin(2, "Monoprix", "Menzah 6");

        //Question 2:
        Caissier c1 = new Caissier(258, 1, "Anis Dhaoui", "Kairouan", 6);
        Caissier c2 = new Caissier(852, 2, "Med Ali", "Siliyana", 8);
        Caissier c3 = new Caissier(82, 3, "Malek Aliya", "Sfax", 8);

        Vendeur v1 = new Vendeur(150, 1, "Jamel Ouni", "Sbitla", 8);
        Vendeur v2 = new Vendeur(100, 2, "Issam Rayes", "Ahmed's well", 8);
        Vendeur v3 = new Vendeur(98, 3, "Kamel barouch", "Sousse", 8);
        Vendeur v4 = new Vendeur(110, 4, "Omar Zawali", "Ben Garden", 8);

        Responsable r1 = new Responsable(221.5f, 1, "Abou Baker", "Irak", 2);
        Responsable r2 = new Responsable(125.8f, 1, "Raouf Donya", "Baghdad", 4);

        m1.ajoutEmp(c1);
        m1.ajoutEmp(c2);
        m1.ajoutEmp(v1);
        m1.ajoutEmp(r1);

        m2.ajoutEmp(c2);
        m2.ajoutEmp(v2);
        m2.ajoutEmp(v3);
        m2.ajoutEmp(v4);
        m2.ajoutEmp(r2);

        //Question 3:
        Employee employees[] = {c1, c2, c3, v1, v2, v3, v4, r1, r2};
//        for (int i = 0; i < employees.length; i++) {
//                System.out.println(employees[i].toString());
//        }

        //Question 4:
        m1.ajoutProd(p1);
        m1.ajoutProd(p2);
        m2.ajoutProd(p1);
        m2.ajoutProd(p2);
        m2.ajoutProd(p3);

        //Question 5:
        System.out.println("*********************** Magasin 1 ***********************");
        System.out.println(m1.toString());
        System.out.println("*********************** Magasin 2 ***********************");
        System.out.println(m2.toString());
    }
}

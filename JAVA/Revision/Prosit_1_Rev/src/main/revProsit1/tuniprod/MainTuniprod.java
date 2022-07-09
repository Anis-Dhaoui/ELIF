package main.revProsit1.tuniprod;
import java.text.*;
import java.util.Date;
import rev.prosit1.tuniprod.Produit;

public class MainTuniprod {
    
    public static void main(String arg[])  throws ParseException{
            //Q1
            System.out.println("QUESTION 1:");
            Produit prodVide = new Produit();
            System.out.println(prodVide);

            //Q2
            System.out.println("\nQUESTION 2:");
            Produit p1 = new Produit(1021, "Lait", "Delice");
            Produit p2 = new Produit(2510, "Yayourt", "Vitalait");
            Produit p3 = new Produit(3250, "Tomate", "Sicam", 2500);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);

            //Q3
            System.out.println("\nQUESTION 3:");
            p1.afficher();
            System.out.println("\n");
            p2.afficher();
            System.out.println("\n");
            p3.afficher();

            //Q4
            p1.setPrix(0.7f);
            System.out.println("\nQUESTION 4:");
            p1.afficher();

            //Q5
            p2.setPrix(0.5f);
            //Q6
            System.out.println("\nQUESTION 5 & 6:");
            p2.afficher();

            //Q7
            System.out.println("\nQUESTION 7: ");
            System.out.println(p1.toString());
            
            //Q8
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date date = formatter.parse("20-05-2022");
            p1.setDateExp(date);
            p1.afficher();
        }
}

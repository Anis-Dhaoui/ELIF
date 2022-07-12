package main.revProsit1.tuniprod;
import java.text.*;
import rev.prosit1.tuniprod.Magasin;
import rev.prosit1.tuniprod.Produit;

public class MainTuniprod {
    
    public static void main(String arg[])  throws ParseException{
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
            Magasin m1 = new Magasin(123, "cartié Mohamed Ali");
            Magasin m2 = new Magasin(456, "Silicon Valey");
            m1.ajoutProd(p1);
            m1.ajoutProd(p2);
            m2.ajoutProd(p1);
            m2.ajoutProd(p2);
            m2.ajoutProd(p3);
            int nbProdTotal = m1.getCapacite() + m2.getCapacite();
            //FIN PROSIT 2
            
            //Question 1:
            //a:
            System.out.println(p3.comparer(new Produit(3250, "Tomate", "Sicam", -10)));
            System.out.println(p1.comparer(new Produit(123, "xxxx", "yyyy", 457)));
            //b:
            System.out.println(Produit.comparer2Prod(p1, p2));
            System.out.println(Produit.comparer2Prod(p1, p1));
            //Question 2:
            System.out.println(m2.chercheProd(p3));
            
            //Question 3:
            m1.ajoutProd(p1);
            //Produit déja exist
            m1.ajoutProd(p3);
            //Produit ajouté avec succés
            
            //Question 4:
            System.out.println(m2.toString());
            m2.supprimerProd(p3);
            System.out.println(m2.toString());
            
            //Question 5:
            m1.higherProd(m2);
        }
}

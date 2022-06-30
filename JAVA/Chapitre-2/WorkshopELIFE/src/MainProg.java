/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** psvm ===> shorcut of public static void main...
 *
 * @author f2c
 */
public class MainProg {
    public static void main(String[] args) {
        //constructeur non parametré
        Client c1 = new Client();
        System.out.println(c1.nom);
        System.out.println(c1.adresse);
        System.out.println(c1.cin);
        System.out.println(c1.poid);
        
        c1.afficher();
        System.out.println(c1.toString());
        
        //Constructeur parametré
        Client c2 = new Client("Ali", "Siliana", 123456789, 90.5f);
        System.out.println(c2.nom);
        System.out.println(c2.adresse);
        System.out.println(c2.cin);
        System.out.println(c2.poid);
        
        c2.afficher();
        System.out.println(c2.toString());
    }
}

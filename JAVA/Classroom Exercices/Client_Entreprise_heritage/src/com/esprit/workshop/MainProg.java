/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.workshop;

/**
 *
 * @author aissa
 */
public class MainProg {
    public static void main(String[] args) {
        Client cl1 = new Client(0, "Ali");
        ClientParticulier cp1 = new ClientParticulier(1, "Med", 99999999);
        ClientEntreprise ce1 = new ClientEntreprise(2, "Fedi", "12/00124578");
        EntrepriseLocale el1 = new EntrepriseLocale(3, "Hosni", "12/1124578", "Seliana");
        EntrepriseEtrangere ee1 = new EntrepriseEtrangere(4, "Oussema", "12/55463211", "France");
        
        Client x = new Client();
        System.out.println(x instanceof ClientParticulier);
//        cl1.acheter();
//        cp1.acheter();
//        cp1.payer();
//        ce1.acheter();
//        el1.acheter();
//        
//        Client cl2 = new ClientParticulier(5, "Khaled", 88888888);
//        //ClientParticulier cp2 = new Client(6, "Mohcen");
//        cl2.acheter();
//        //cl2.payer();
//        //((ClientParticulier)cl2).payer();
//        ClientParticulier cp2 = (ClientParticulier)cl2;
//        cp2.payer();
//        
//        
//        System.out.println("*********");
//        Client cl3 = new ClientEntreprise(0, "nom", "matricule");
//        cl3.acheter();
//        //cl3.faireDevis();
//        ((ClientEntreprise)cl3).faireDevis();
//        ClientEntreprise ce2 = (ClientEntreprise)cl3;
//        ce2.faireDevis();
//        
//        /*ClientParticulier cp3 = (ClientParticulier)cl1;
//        cp3.payer();*/
//        
//        Client cl4 = new EntrepriseEtrangere(4, "Oussema", "12/55463211", "France");
//        ClientEntreprise ce3 = new EntrepriseEtrangere(4, "Oussema", "12/55463211", "France");
//        
//        ((ClientEntreprise)cl4).faireDevis();
//        ((EntrepriseEtrangere)cl4).ajouterRs();
//        
//        System.out.println("***********");
//        Client clients[] = {cl1, cp1, ce1, el1, ee1};
//        for(int i = 0; i < clients.length; i++) {
//            if(clients[i] instanceof ClientParticulier) {
//                ((ClientParticulier)clients[i]).payer();
//            } else if(clients[i] instanceof ClientEntreprise) {
//                ((ClientEntreprise)clients[i]).faireDevis();
//            } else {
//                clients[i].acheter();
//            }
//        }
//        
//        System.out.println("**********");
//        Client cll1 = new Client(0, "Ali");
//        Client cll3 = new Client(0, "Ali");
//        Client cll2 = new ClientParticulier(0, "Ali", 99999999);
//        System.out.println(cll1.equals(cll2));
//        System.out.println(cll1.equals(cll3));
    }
}

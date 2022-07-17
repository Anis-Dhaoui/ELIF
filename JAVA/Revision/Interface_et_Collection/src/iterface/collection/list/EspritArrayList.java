/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterface.collection.list;

import java.util.ArrayList;

/**
 *
 * @author f2c
 */
public class EspritArrayList  implements University{
    
    ArrayList<Etudiant> listEtud = new ArrayList<>();
    
    @Override
    public void ajouterEtud(Etudiant e){
        listEtud.add(e);
    }

    @Override
    public boolean rechercherEtud(Etudiant e) {
        
    }
    
    
}

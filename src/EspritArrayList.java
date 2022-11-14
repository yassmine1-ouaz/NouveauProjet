/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author octanet
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EspritArrayList implements University{
    
    ArrayList <Etudiant> listeSt ;

    public EspritArrayList() {
        
        listeSt = new ArrayList();
    }
    
    @Override
    public void ajouterEtudiant(Etudiant eleve) {
        listeSt.add(eleve);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant eleve) {
        return(listeSt.contains(eleve));
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        
        for (int i = 0; i< listeSt.size(); i++)
        {
            if ((listeSt.get(i)).getNom().equals(nom)) 
            return true ;
        }
        return false; 
    }

    @Override
    public void supprimerEtudiant(Etudiant eleve) {
        listeSt.remove(eleve);
    }
   
    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants);
    }

      @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants, new Parnom());
    } 

    @Override
    public void displayEtudiants() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

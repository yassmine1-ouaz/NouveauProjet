/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author octanet
 */
public interface GestionEnseignant{
public void ajouterEnseignant(Enseignant e);
public boolean rechercherEnseignant (Enseignant e);
public boolean rechercherEnseignant (int id);
public void supprimerEnseignant (Enseignant e);
public void displayEnseignants();
}

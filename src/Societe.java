/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author octanet
 */
public interface Societe {
    
    public void ajouterEmployeDepartement(Employe e,Departement d);
    public void supprimerEmploye(Employe e);
    public void afficherLesEmployesLeursDepartements();
    public void afficherLesEmployes();
    public void afficherLesDepartements();
    public void afficherDepartement(Employe e);
    public boolean rechercherEmploye(Employe e);
    public boolean rechercherDepartement(Departement e);
    
}

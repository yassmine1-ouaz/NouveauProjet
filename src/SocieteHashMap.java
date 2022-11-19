
/**
 *
 * @author octanet
 */

import java.util.HashMap;
import java.util.*;


public class SocieteHashMap implements Societe {
    
 HashMap<Employe, Departement> societe = new HashMap<Employe, Departement>();


    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        societe.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        societe.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
       for (Employe i : societe.keySet()) {
        System.out.println("key: " + i.toString() + " value: " + societe.get(i).toString());
        }
    }

    @Override
    public void afficherLesEmployes() {
       for (Employe i : societe.keySet()) {
            System.out.println(i.toString());
        }
    }
    
      @Override
    public boolean rechercherEmploye(Employe e) {
        for(Employe i : societe.keySet())
        {
            if(i.equals(e)==true)
            {
               return true;
            }
        }
        return false;
    }
    
     @Override
    public void afficherDepartement(Employe e) {
        System.out.println(societe.get(e).toString());
    }


    @Override
    public void afficherLesDepartements() {
        for (Departement i : societe.values()) {
        System.out.println(i.toString());
        }
    }
  

    @Override
    public boolean rechercherDepartement(Departement e) {
        for(Departement i : societe.values())
        {
            if(i.equals(e)==true)
            {
               return true;
            }
        }
        return false;
       
    }
    
}
   
    


/**
 *
 * @author octanet
 */

import java.util.*;

public class SocieteTreeMap implements Societe{

    TreeMap<Employe, Departement> treemap = new TreeMap <Employe, Departement> ();
    
    
    
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        treemap.put(e,d);
    }
    

    @Override
    public void supprimerEmploye(Employe e) {
        treemap.remove(e);
    }
    
    
      @Override
    public void afficherLesEmployes() {
        for (Map.Entry i : treemap.entrySet()) {
            Employe e = (Employe)i.getKey();
            System.out.println( e.toString() );
            }
        }
    
    
        @Override
    public boolean rechercherEmploye(Employe e) {
        for(Map.Entry i : treemap.entrySet())
        {
            if(i.getKey().equals(e))
            {
               return true;
            }
        }
        return false;
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry i : treemap.entrySet()) {
            Employe e = (Employe)i.getKey();
            Departement d = (Departement)i.getValue();
            System.out.println( e.toString() + d.toString() );
        }}
    
    
    @Override
    public void afficherLesDepartements() {
            for (Map.Entry i : treemap.entrySet()) {
            Departement d = (Departement)i.getValue();
            System.out.println(  d.toString() );
        }
    }
    

    @Override
    public void afficherDepartement(Employe e) {
        for(Map.Entry i : treemap.entrySet())
        {
            if(i.getKey().equals(e))
            {
                Departement d = (Departement)i.getValue();
                System.out.println(d.toString());
            }}}


    @Override
    public boolean rechercherDepartement(Departement e) {
        for(Map.Entry i : treemap.entrySet())
        {
            if(i.getValue().equals(e))
            {
                return true;
            }
            
        }
        return false;
    }
    
}


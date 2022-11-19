
import java.util.*;
import java.util.Collection;



public class Main {

    public static void main(String[] args) {
        
        
        
    Etudiant eleve1 = new Etudiant();
    Etudiant eleve2 = new Etudiant (3,"Yassmine","Ouaz");
    Etudiant eleve3 = new Etudiant(1,"mariem","ahmed");
    
    eleve1.toString();
    eleve2.toString();
    eleve3.toString();
    eleve2.equals(eleve3);
    }
    
    /**    
    Enseignant e1 = new Enseignant(11,"Zayneb","Alala");
    Enseignant e2 = new Enseignant (12,"Yassmine","Ouaz");
    Enseignant e3 = new Enseignant(50,"Balkis","ahmed");
    **/
    
    
     EspritHashSet hash = new EspritHashSet();
     System.out.println(e1.toString());
              hash.ajouterEnseignant(e1);
              hash.ajouterEnseignant(e2);
              hash.ajouterEnseignant(e3);
            
       
        EspritTreeSet treeset = new EspritTreeSet();
        treeset.ajouterEnseignant(e1);
        treeset.ajouterEnseignant(e2);
        treeset.ajouterEnseignant(e3);
        treeset.displayEnseignants();
     

        System.out.println("id : " + treeset.rechercherEnseignant(11));
        System.out.println("id : " + treeset.rechercherEnseignant(50));
        

// TD MAP
        
      
     Employe e1= new Employe();
     Employe e2= new Employe(002121236, "514EMP7269" , "salma" , " sall");
     Employe e3 = new Employe(002121236,"514EMP7269","Yassmine","Ouaz");
     Employe e4 = new Employe(002121236,"514EMP7269","Employe","Empp");
     
     
     
     Departement d =new Departement ();
     Departement d1 =new Departement (01,"DEP1");
     Departement d2 =new Departement (02,"DEP2");
     Departement d3 =new Departement (03,"DEP3");

     
     SocieteHashMap societe = new SocieteHashMap();
     
      System.out.println(e1.toString());
      System.out.println(d1.toString());
      
      societe.afficherDepartement(e1);
      societe.ajouterEmployeDepartement(e2);
      societe.ajouterEmployeDepartement(e1,d1);
      societe.supprimerEmploye(e3);
      
      SocieteTreeMap treemap = new SocieteTreeMap();
      
      societe.afficherDepartement(e1);
      societe.ajouterEmployeDepartement(e2);
      societe.ajouterEmployeDepartement(e1,d1);
      societe.supprimerEmploye(e3);

     System.out.println("id : " + treemap.rechercherEmploye(11));
     System.out.println("cin : " + societe.rechercherEmploye(50));
        
    }






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
    
        
    Enseignant e1 = new Enseignant(11,"Zayneb","Alala");
    Enseignant e2 = new Enseignant (12,"Yassmine","Ouaz");
    Enseignant e3 = new Enseignant(50,"Balkis","ahmed");
    
    
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


    }






import java.util.*;



public class Main {

    public static void main(String[] args) {
        
    Etudiant eleve1 = new Etudiant();
    Etudiant eleve2 = new Etudiant (3,"Yassmine","salma");
    Etudiant eleve3 = new Etudiant(1,"mariem","ahmed");
    
    eleve1.toString();
    eleve2.toString();
    eleve3.toString();
    eleve2.equals(eleve3);
    }
    
        
    Enseignant eleve1 = new Enseignant();
    Enseignant eleve2 = new Enseignant (3,"Yassmine","salma");
    Enseignant eleve3 = new Enseignant(1,"mariem","ahmed");
}



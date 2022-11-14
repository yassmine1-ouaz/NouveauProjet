
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EspritHashSet implements GestionEnseignant {

    Set<Enseignant> hash = new HashSet<Enseignant>();

    @Override
    public void ajouterEnseignant(Enseignant e) {

        hash.add(e);

    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hash.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {

        Iterator<Enseignant> it = hash.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        hash.remove(e);

    }

    @Override
    public void displayEnseignants() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

}

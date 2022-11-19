/**
 *
 * @author octanet
 */
import java.util.Objects;

public class Employe implements Comparable<Employe> {
    
    
    private int cin;
    private String nom, prenom;
    private String matricule;
    
    public Employe (){}
    
    public Employe(int cin, String matricule , String nom , String Prenom){
        
        this.cin= cin;
        this.matricule= matricule;
        this.nom= nom;
        this.prenom= prenom;
        
    }
    
    public int getCin(){
        return cin;
    }
    
    public void setcin( int cin){
        this.cin=cin;
    }
    
    
    public String getMatricule(){
        return matricule;
    }
    
    public void setmatricule( String matricule){
        this.matricule=matricule;
    }
    
    
    public String getNom(){
        return nom;
    }
    
    public void setnom( String nom){
        this.nom=nom;
    }
    
    
     public String getPrenom(){
        return prenom;
    }
    
    public void setprenom( String prenom){
        this.prenom=prenom;
    }
    
        @Override
           public String toString(){
               System.out.println("un Employe est caracterise par cin:"+this.getCin()+"et matricule :"+this.getMatricule()+"et un nom:"+this.getNom()+"et un prenom:"+this.getPrenom());return null;
       }
      
       
         @Override
          public boolean equals (Object o){
              if (this == o)
                  return true;
              if (o == null)
                  return false;
              
              if (getClass() != o.getClass())
                  
                  return false;
              Employe employe = (Employe) o;
              
              return cin == employe.cin;
          }
      
       
     @Override
         public int compareTo(Employe e ) {
             return this.cin-e.cin;}
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.cin;
        hash = 23 * hash + (this.nom != null ? this.nom.hashCode() : 0);
        hash = 23 * hash + (this.prenom != null ? this.prenom.hashCode() : 0);
        hash = 23 * hash + (this.matricule != null ? this.matricule.hashCode() : 0);
        return hash;
    }
    
  
     
}

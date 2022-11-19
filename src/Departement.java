/**
 *
 * @author octanet
 */
import java.util.Objects;
        
public class Departement implements Comparable<Departement>{
    
    private int id ;
    private String nom;
    
    
    public Departement(){}
    
    public Departement(int id, String nom){
        
        this.id= id;
        this.nom= nom;
    }
    
    public int getId(){
            return id;}
    
    public void setid(int id){
       this.id=id; 
    }
    
    public String getNom(){
            return nom;}
    
    public void setnom(String nom){
       this.nom=nom; 
    }
    
    
    @Override
    public String toString(){
        System.out.println("Un Departement est caraterisé par id:"+this.getId()+"et son nom:" +this.getNom());
        return null;
    }
    
    @Override
      public boolean equals (Object o){
           if (this == o)
             return true;
           if (o == null)
             return false;
              
           if (getClass() != o.getClass())
                  
               return false;
             Departement departement = (Departement) o;
              
              return id == departement.id;
          }
      
       
      @Override
         public int compareTo(Departement e ) {
             return this.id-e.id;}
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + (this.nom != null ? this.nom.hashCode() : 0);
        return hash;
    }
    
    
    
    
    
    
    
    }


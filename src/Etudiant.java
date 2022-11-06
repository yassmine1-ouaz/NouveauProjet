/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author octanet
 */
public class Etudiant {
    
    private int id ;
    private String nom;
    private String prenom;
    
    public Etudiant(){
        
    }
    
    Etudiant(int id, String nom, String prenom){
        
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }
    
    
    public void setNom(String nom){
        this.nom=nom;
    }
     public void setid(int id){
        this.id=id;
    }
      public void setprenom(String prenom){
        this.nom=prenom;
    }
      
    public int getId(){
      return id;
      }
    
    public String getNom(){
       return nom; 
    }
    
    public String getPrenom(){
        return prenom; 
    }
    
     @Override
    public boolean equals(Object b){
        if (this == b) {
          return true;
            }
        if (b == null || getClass() != b.getClass()) {
            return false;
            }
            Etudiant etudiant = (Etudiant) b;
            return id == etudiant.id; 
        }

    @Override
    public String toString(){
        System.out.println("un etudiant est caracterise par id:"+this.getId()+"et un nom :"+this.getNom()+"et un prenom:"+this.getPrenom());return null;
}
    }




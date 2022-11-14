/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author octanet
 */

public class Enseignant implements Comparable<Enseignant>{
    
    private int id ;
    private String nom;
    private String prenom;
    
    public Enseignant(){
        
    }
    
    public Enseignant(int id, String nom, String prenom){
        
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
    
    /* @Override
    public boolean equals(Object b){
        if (this == b) {
          return true;
            }
        if (b == null || getClass() != b.getClass()) {
            return false;
            }
            Etudiant etudiant = (Etudiant) b;
            return id == etudiant.id; 
       }*/

    
     @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Etudiant) {
            final Etudiant e = (Etudiant) o;
            if (e.getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        System.out.println("un etudiant est caracterise par id:"+this.getId()+"et un nom :"+this.getNom()+"et un prenom:"+this.getPrenom());return null;
}
    
    @Override
    public int compareTo(Etudiant o) {
     return this.id - o.id;
     //ki ne9lb ywli  croissent
     //return o.id - this.id chtar croissent
    
    }

    @Override
    public int compareTo(Enseignant o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }



package test;

public abstract class Personne  {
	private String nom ; 
	private String prenom; 
	
	public Personne(String n, String p) {
		this.nom =n ; 
		this.prenom = p ;
	}
	
	public String toString() {
		return "Personne [ nom : " + nom + ", prenom : " + prenom + " ]" ;
	}
}

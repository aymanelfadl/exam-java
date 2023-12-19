package test;

import java.util.Objects;

public class Player extends Personne{
	private playerPost poste;
	private int numero_maillot ; 
	private String equipeOrigin;
	
	public Player(String n , String p ,playerPost post , int num ) {
		super(n,p);
		this.setNumero_maillot(num);
		this.poste=post;
	}
	
	public void setPost(playerPost post) {
		this.poste=post;
	}
	
	public playerPost getPoste() {
		return poste;
	}
	

	public int getNumero_maillot() {
		return numero_maillot;
	}

	public void setNumero_maillot(int numero_maillot) {
		this.numero_maillot = numero_maillot;
	}

	public String getEquipeOrigin() {
		return equipeOrigin;
	}

	public void setEquipeOrigin(String equipeOrigin) {
		this.equipeOrigin = equipeOrigin;
	}

	
	public String toString() {
		return super.toString() +" Player : [poste=" + poste + ", numero_maillot=" + numero_maillot + ", equipeOrigin=" + equipeOrigin + "]";
	}

	public int hashCode() {
		return Objects.hash(equipeOrigin, numero_maillot, poste);
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(equipeOrigin, other.equipeOrigin) && numero_maillot == other.numero_maillot
				&& poste == other.poste;
	}
	
  
	
	
	

	
	
}

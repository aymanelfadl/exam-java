package test;

import java.util.Objects;

public class Arbitre extends Personne {
	private arbitrePoste poste;
	
	public Arbitre(String n , String p , arbitrePoste poste ) {
		super(n,p);
		this.poste = poste;
	}

	public arbitrePoste getPoste() {
		return poste;
	}

	public void setPoste(arbitrePoste poste) {
		this.poste = poste;
	}

	@Override
	public int hashCode() {
		return Objects.hash(poste);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Arbitre other = (Arbitre) obj;
		return poste == other.poste;
	}

	@Override
	public String toString() {
		return "Arbitre [poste=" + poste + "]";
	}

	
	
}

package test;

import java.util.ArrayList;
import java.util.List;

public class Tour {
	private String nom; 
	private int numbr_equipe ;
	private ArrayList<Equipe> equipe;
	private ArrayList<Match> matches;
	private List<Equipe> equipes_vinqueurs;
	
	public Tour(String nom, int nbr, ArrayList<Equipe> equipes) {
		this.nom = nom ;
		this.numbr_equipe = nbr;
		this.equipe=equipes;
	}
	
	public void lister() {
		System.out.print(this.nom + " : " );
		for(int i=0 ;i<this.matches.size();i++) {
			matches.get(i).lister();
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumbr_equipe() {
		return numbr_equipe;
	}

	public void setNumbr_equipe(int numbr_equipe) {
		this.numbr_equipe = numbr_equipe;
	}

	public ArrayList<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(ArrayList<Equipe> equipe) {
		this.equipe = equipe;
	}

	public ArrayList<Match> getMatches() {
		return matches;
	}

	public void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
	}

	public List<Equipe> getEquipes_vinqueurs() {
		return equipes_vinqueurs;
	}

	public void setEquipes_vinqueurs(List<Equipe> equipes_vinqueurs) {
		this.equipes_vinqueurs = equipes_vinqueurs;
	}
	
	
	
	
	

}

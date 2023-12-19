package test;

import java.util.*;

public class Match {
	
	private String nom ; 
	private Arbitre arbitre; 
	private List<Equipe> equipes;
	private Map<Equipe, Integer> results;
	
	public Match(String nom , List<Equipe> equipes ) {
		this.nom = nom ;
		this.equipes = equipes;
		 this.results = new HashMap<>(); 
	}
	
	public void lister() {
		System.out.print(equipes.get(0)+" ( "
				+ results.get(equipes.get(0))+" : " + results.get(equipes.get(1)
					+" ) "+ equipes.get(1)));
	}
	
	public void changePlayer(Player mainPlayer , Player secondPlayer) {		
		if(equipes.get(0).getMainPlayers().contains(mainPlayer) && equipes.get(0).getSecondPlayers().contains(secondPlayer)){
			equipes.get(0).chnagePlayer(mainPlayer, secondPlayer);
		}else {
			equipes.get(1).chnagePlayer(mainPlayer, secondPlayer);
		}
	}
	
	
	
	
}

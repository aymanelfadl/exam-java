package test;

import java.util.List;

public class Equipe {
	private String nomE;
	private List<Player> mainPlayers;
	private List<Player> secondPlayers;
	
	public Equipe(String n , List<Player> mainEquipe, List<Player> secondEquipe) {
		this.nomE = n ;
		this.mainPlayers = mainEquipe;
		this.secondPlayers = secondEquipe;
	}
	
	public void lister() {
	    System.out.println("Equipe name: " + this.nomE);
	    
	    System.out.println("Main Players:");
	    for (Player p : mainPlayers) {
	        System.out.println(p);
	    }
	    
	    System.out.println("Second Players:");
	    for (Player s : secondPlayers) {
	        System.out.println(s);
	    }
	}

	
	public void chnagePlayer(Player mainPlayer , Player secondPlayer) {
		if(mainPlayers.contains(mainPlayer) && secondPlayers.contains(secondPlayer)) {
			int mainIndex = mainPlayers.indexOf(mainPlayer);
			int secondIndex = secondPlayers.indexOf(secondPlayer);
			mainPlayers.set(mainIndex, secondPlayer);
			secondPlayers.set(secondIndex, mainPlayer);
		
		}
	}
    public String toString() {
        StringBuilder result = new StringBuilder("Equipe name: " + nomE + "\n");

        result.append("Main Players:\n");
        for (Player p : mainPlayers) {
            result.append(p.toString()).append("\n");
        }

        result.append("Second Players:\n");
        for (Player s : secondPlayers) {
            result.append(s.toString()).append("\n");
        }

        return result.toString();
    }

	public String getNomE() {
		return nomE;
	}

	public void setNomE(String nomE) {
		this.nomE = nomE;
	}

	public List<Player> getMainPlayers() {
		return mainPlayers;
	}

	public void setMainPlayers(List<Player> mainPlayers) {
		this.mainPlayers = mainPlayers;
	}

	public List<Player> getSecondPlayers() {
		return secondPlayers;
	}

	public void setSecondPlayers(List<Player> secondPlayers) {
		this.secondPlayers = secondPlayers;
	}
	
}

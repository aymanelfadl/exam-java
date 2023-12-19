package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating players with playerPost enum
        Player player1 = new Player("John", "Doe", playerPost.MID, 10);
        Player player2 = new Player("Jane", "Doe", playerPost.GB, 1);

        // Creating coach with typeDiplome enum
        Coach coach = new Coach("Coach", "Smith", "CoachNick", typeDiplome.A);

        // Creating arbitre
        Arbitre arbitre = new Arbitre("Referee", "One", arbitrePoste.jnab);

        // Creating teams
        List<Player> mainPlayers1 = Arrays.asList(player1, new Player("Player3", "Doe", playerPost.MID, 7));
        List<Player> secondPlayers1 = Arrays.asList(new Player("Player4", "Doe", playerPost.DEF, 4));
        Equipe equipe1 = new Equipe("TeamA", mainPlayers1, secondPlayers1);

        List<Player> mainPlayers2 = Arrays.asList(player2, new Player("Player5", "Doe", playerPost.ATT, 9));
        List<Player> secondPlayers2 = Arrays.asList(new Player("Player6", "Doe", playerPost.MID, 6));
        Equipe equipe2 = new Equipe("TeamB", mainPlayers2, secondPlayers2);

        // Creating a match
        List<Equipe> equipes = Arrays.asList(equipe1, equipe2);
        Match match = new Match("FootballMatch", equipes);

        // Creating a tour
        ArrayList<Equipe> tourEquipes = new ArrayList<>(Arrays.asList(equipe1, equipe2));
        Tour tour = new Tour("FirstTour", 2, tourEquipes);
        tour.setMatches(new ArrayList<>(Arrays.asList(match)));

        // Performing some actions
        System.out.println("Initial state:");
        tour.lister(); // List the matches in the tour

        // Changing a player between teams
        Player playerToSwap = mainPlayers1.get(0);
        Player newPlayer = new Player("New", "Player", playerPost.MID, 11);
        equipe1.chnagePlayer(playerToSwap, newPlayer);

        System.out.println("\nAfter changing a player:");
        tour.lister(); // List the matches in the tour

        // Note: You can perform more actions and testing based on your requirements
    }
}

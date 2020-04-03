import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		/*
		Characters c = new Characters("Zoe", "Blue");
		Weapons w = new Weapons("Dagger");
		Rooms r = new Rooms("Living Room", true);
		
		System.out.printf("%s%n", c);
		System.out.printf("%s%n", w);
		System.out.printf("%s%n", r);
		*/
		Scanner s = new Scanner(System.in);
		
		System.out.printf("How many players?");
		int numPlayers = s.nextInt();
		
		Card c = new Card();
		GameManager gm = new GameManager(numPlayers, s);
		
		for(int j = 0; j <= numPlayers; j++)
		{
			System.out.printf("Enter player #%d name: ", j+1);
			String player = s.nextLine();
			gm.playerName();
			System.out.printf("%s: Enter the character you want to be: ", player);
			String character = s.nextLine();
			gm.playerCharacter();
		}
		
		ArrayList<Player> players = gm.deal();
		
		for(int i = 0; i < players.size(); i++)
		{
			System.out.printf("%s%n", players.get(i));
		}

	}
}

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
		GameManager gm = new GameManager(numPlayers);
		
		String[] allNames = new String[numPlayers];
		for(int j = 1; j <= numPlayers; j++)
		{
			System.out.printf("Enter player #%d name: ", j);
			String player = s.nextLine();
			allNames[j-1] = player;
		}
		String[] finalnames = gm.playerName(allNames);
		
		String[] allCharacters = new String[numPlayers];
		for(int k = 1; k <= numPlayers; k++)
		{
			System.out.printf("Player %d: Enter the character you want to be: ", k);
			String character = s.nextLine();
			allCharacters[k-1] = character;
		}
		String[] finalCharacters = gm.playerCharacter(allCharacters);
		
		ArrayList<Player> players = gm.deal(finalnames, finalCharacters);
		
		for(int i = 0; i < players.size(); i++)
		{
			System.out.printf("%s%n", players.get(i));
		}

	}
}

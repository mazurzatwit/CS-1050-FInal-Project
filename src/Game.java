import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Pane board = new Pane();
		Button diningRoom = new Button("Dining Room");
		Button hall = new Button("Hall");
		Button library = new Button("Library");
		Button ballroom = new Button("Ballroom");
		Button study = new Button("Study");
		Button billardRoom = new Button("Billard Room");
		Button conservatory = new Button("Conservatory");
		Button kitchen = new Button("Kitchen");
		Button lounge = new Button("Lounge");
		board.getChildren().addAll(diningRoom, hall, library, ballroom, study, billardRoom, conservatory, kitchen, lounge);
		Scene s1 = new Scene(board, 500, 500);
		arg0.setTitle("Welcome to Clue!");
		arg0.setScene(s1);
		arg0.show();	
			
		Scanner s = new Scanner(System.in);
		
		System.out.printf("PUBLIC SERVICE ANNOUCEMENT: Please have a notebook or a small piece of paper handy to keep track of your guesses. Thank you!");
		System.out.printf("How many players?");
		int numPlayers = s.nextInt();
		s.nextLine();
		
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
			System.out.printf("Choose a character: %n"
					+ "Mrs. White (White) %n"
					+ "Professor Plum (Purple) %n"
					+ "Colonel Mustard (Yellow)%n "
					+ "Mrs. Peacock (Blue) %n "
					+ "Miss Scarlet (Red) %n"
					+ "Mr. Green (Green) %n");
			String character = s.nextLine();
			allCharacters[k-1] = character;
		}
		String[] finalCharacters = gm.playerCharacter(allCharacters);
		
		ArrayList<Player> players = gm.deal(finalnames, finalCharacters);
		
//		for(int i = 0; i < players.size(); i++)
//		{
//			System.out.printf("%s%n", players.get(i));
//		}
		
		for (Player p: players ) {
			System.out.printf("Do you want a FINAL guess? (y/n)");
			String ans = s.nextLine();
			
			if(ans.equals("y")) {
				String[] solution = gm.Solution();
				ArrayList<String> guesses = p.guessing(s);
				int counter = 0;
				for(int n = 0; n < solution.length; n++)
				{
					String curr = solution[n];
					for(int o = 0; o < guesses.size(); o++)
					{
						if(curr.equals(guesses.get(o)))
						{
							counter++;
						}
					}
				}
				if(counter == 3)
				{
					System.out.printf("Correct! You have done did it, Congrats Sherlock!!");
					System.exit(0);
				}
				else if(counter < 3)
					System.out.printf("Wrong! Sorry! You have lost! ");
			} else {
				System.out.printf("Who would you like to ask? Type player's name: ");
				String response = s.nextLine();
				ArrayList<String> guesses = p.guessing(s);
				Hand guessingH = new Hand();
				for(int a = 0; a < players.size(); a++)
				{
					if(response.equals(players.get(a).getName()))
					{
						guessingH = players.get(a).getHand();
					}
				}
				int counter = 0;
				for(int w = 0; w < guesses.size(); w++)
				{
					String curr = guesses.get(w);
					for(int z = 0; z < guessingH.handLength(); z++)
					{
						if(curr.equals(guessingH.showCards(z)))
							System.out.printf("Card Match: %s%n", guessingH.showCards(z));
						else
							counter++;
					}
				}
				if(counter == (guessingH.handLength()*3))
					System.out.printf("No Matches!");
			}
		}
		
	}
}

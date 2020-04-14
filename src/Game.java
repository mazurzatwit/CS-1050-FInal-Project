import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Game extends Application{
	double oX, oY;
	double oTX, oTY;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {	
			
//		Scanner s = new Scanner(System.in);
//		
//		System.out.printf("Welcome to Clue! %n%n");
//		System.out.printf("PUBLIC SERVICE ANNOUCEMENT: Please have a notebook or a small piece of paper handy to keep track of your guesses. Thank you! %n%n%n");
//		System.out.printf("How many players?");
//		int numPlayers = s.nextInt();
//		s.nextLine();
//		System.out.println();
//		
//		Card c = new Card();
//		GameManager gm = new GameManager(numPlayers);
//		
//		String[] allNames = new String[numPlayers];
//		for(int j = 1; j <= numPlayers; j++)
//		{
//			System.out.printf("Enter player #%d name: ", j);
//			String player = s.nextLine();
//			allNames[j-1] = player;
//			System.out.printf("%n");
//		}
//		String[] finalnames = gm.playerName(allNames);
//		
//		System.out.printf("%n%n%n");
//		String[] allCharacters = new String[numPlayers];
//		for(int k = 1; k <= numPlayers; k++)
//		{
//			System.out.printf("Choose a character: %n"
//					+ "Mrs. White (White) %n"
//					+ "Professor Plum (Purple) %n"
//					+ "Colonel Mustard (Yellow)%n"
//					+ "Mrs. Peacock (Blue) %n"
//					+ "Miss Scarlet (Red) %n"
//					+ "Mr. Green (Green) %n%n");
//			System.out.printf("Player %d: Enter the character name you want to be from the above list: ", k);
//			String character = s.nextLine();
//			allCharacters[k-1] = character;
//			System.out.printf("%n%n%n");
//		}
//		String[] finalCharacters = gm.playerCharacter(allCharacters);
//		
//		ArrayList<Player> players = gm.deal(finalnames, finalCharacters);
		
		Pane board = new Pane();
		board.setMinSize(500, 500);
		Button diningRoom = new Button("Dining Room");
		Button hall = new Button("Hall");
		hall.setLayoutX(0);
		hall.setLayoutY(250);
		Button library = new Button("Library");
		library.setLayoutX(0);
		library.setLayoutY(500);
		Button ballroom = new Button("Ballroom");
		ballroom.setLayoutX(250);
		ballroom.setLayoutY(0);
		Button study = new Button("Study");
		study.setLayoutX(500);
		study.setLayoutY(0);
		Button billardRoom = new Button("Billard Room");
		billardRoom.setLayoutX(250);
		billardRoom.setLayoutY(500);
		Button conservatory = new Button("Conservatory");
		conservatory.setLayoutX(250);
		conservatory.setLayoutY(250);
		Button kitchen = new Button("Kitchen");
		kitchen.setLayoutX(500);
		kitchen.setLayoutY(500);
		Button lounge = new Button("Lounge");
		lounge.setLayoutX(500);
		lounge.setLayoutY(250);
		board.getChildren().addAll(diningRoom, hall, library, ballroom, study, billardRoom, conservatory, kitchen, lounge);
		
		EventHandler<MouseEvent> pressed = new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent m)
			{
				oX = m.getSceneX();
				oY = m.getSceneY();
				oTX = ((Circle)(m.getSource())).getTranslateX();
				oTY = ((Circle)(m.getSource())).getTranslateY();
			}
		};
		
		EventHandler<MouseEvent> dragged = new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent m)
			{
				double newOX = m.getSceneX() - oX;
				double newOY = m.getSceneY() - oY;
				double newOTX = oTX + newOX;
				double newOTY = oTY + newOY;
				
				((Circle)(m.getSource())).setTranslateX(newOTX);
				((Circle)(m.getSource())).setTranslateY(newOTY);
			}
		};
		
		//character Circles
		Circle white = new Circle();
		white.setCenterX(300);
		white.setCenterY(200);
		white.setRadius(25);
		white.setStroke(Color.BLACK);
		white.setFill(Color.GHOSTWHITE);
		white.setOnMousePressed(pressed);
		white.setOnMouseDragged(dragged);
		
		Circle plum = new Circle();
		plum.setCenterX(200);
		plum.setCenterY(100);
		plum.setRadius(25);
		plum.setStroke(Color.BLACK);
		plum.setFill(Color.PURPLE);
		plum.setOnMousePressed(pressed);
		plum.setOnMouseDragged(dragged);
		
		Circle mustard = new Circle();
		mustard.setCenterX(300);
		mustard.setCenterY(100);
		mustard.setRadius(25);
		mustard.setStroke(Color.BLACK);
		mustard.setFill(Color.GOLDENROD);
		mustard.setOnMousePressed(pressed);
		mustard.setOnMouseDragged(dragged);
		
		Circle peacock = new Circle();
		peacock.setCenterX(400);
		peacock.setCenterY(100);
		peacock.setRadius(25);
		peacock.setStroke(Color.BLACK);
		peacock.setFill(Color.MEDIUMBLUE);
		peacock.setOnMousePressed(pressed);
		peacock.setOnMouseDragged(dragged);
		
		Circle scarlet = new Circle();
		scarlet.setCenterX(200);
		scarlet.setCenterY(200);
		scarlet.setRadius(25);
		scarlet.setStroke(Color.BLACK);
		scarlet.setFill(Color.RED);
		scarlet.setOnMousePressed(pressed);
		scarlet.setOnMouseDragged(dragged);
		
		Circle green = new Circle();
		green.setCenterX(400);
		green.setCenterY(200);
		green.setRadius(25);
		green.setStroke(Color.BLACK);
		green.setFill(Color.OLIVEDRAB);
		green.setOnMousePressed(pressed);
		green.setOnMouseDragged(dragged);
		
		board.getChildren().addAll(white, plum, mustard, peacock, scarlet, green);
		
		Scene s1 = new Scene(board);
		arg0.setTitle("Welcome to Clue!");
		arg0.setScene(s1);
		arg0.show();
		
		
//		for (Player p: players ) {
//			System.out.printf("Do you want a FINAL guess? (y/n)");
//			String ans = s.nextLine();
//			
//			if(ans.equals("y")) {
//				String[] solution = gm.Solution();
//				ArrayList<String> guesses = p.guessing(s);
//				int counter = 0;
//				for(int n = 0; n < solution.length; n++)
//				{
//					String curr = solution[n];
//					for(int o = 0; o < guesses.size(); o++)
//					{
//						if(curr.equals(guesses.get(o)))
//						{
//							counter++;
//						}
//					}
//				}
//				if(counter == 3)
//				{
//					System.out.printf("Correct! You have done did it, Congrats Sherlock!!");
//					System.exit(0);
//				}
//				else if(counter < 3)
//					System.out.printf("Wrong! Sorry! You have lost! ");
//			} else {
//				System.out.printf("Who would you like to ask? Type player's name: ");
//				String response = s.nextLine();
//				ArrayList<String> guesses = p.guessing(s);
//				Hand guessingH = new Hand();
//				for(int a = 0; a < players.size(); a++)
//				{
//					if(response.equals(players.get(a).getName()))
//					{
//						guessingH = players.get(a).getHand();
//					}
//				}
//				int counter = 0;
//				for(int w = 0; w < guesses.size(); w++)
//				{
//					String curr = guesses.get(w);
//					for(int z = 0; z < guessingH.handLength(); z++)
//					{
//						if(curr.equals(guessingH.showCards(z)))
//							System.out.printf("Card Match: %s%n", guessingH.showCards(z));
//						else
//							counter++;
//					}
//				}
//				if(counter == (guessingH.handLength()*3))
//					System.out.printf("No Matches!");
//			}
//		}
//		
	}
}

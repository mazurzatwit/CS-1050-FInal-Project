import java.util.Scanner;

public class Player {

	private String name;
	private String character;
	
	public Player(String name, String character)
	{
		this.name = name;
		this.character = character;
	}
	
	
	public void guessing(Scanner s)
	{
		System.out.printf("Who would you like to ask? Type player's name");
		String response = s.nextLine();
		System.out.printf("Murderer Guess: ");
		response = s.nextLine();
		System.out.printf("Room Guess: ");
		response = s.nextLine();
		System.out.printf("Murderer Guess: ");
		response = s.nextLine();
	}
}

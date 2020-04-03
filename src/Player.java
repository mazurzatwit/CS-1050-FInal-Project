import java.util.Scanner;

public class Player {

	private String name;
	private String character;
	private Hand hand;
	
	public Player(String name, String character, Hand hand)
	{
		this.name = name;
		this.character = character;
		this.hand = hand;
	}
	
	public String toString()
	{
		String str = "";
		str = String.format("%s (%s): %s", character, name, hand);
		return str;
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

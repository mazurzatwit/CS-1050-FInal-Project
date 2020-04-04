import java.util.ArrayList;
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
	
	public Hand getHand()
	{
		return hand;
	}
	
	public String getName()
	{
		return name;
	}
	
	public ArrayList<String> guessing(Scanner s)
	{
		ArrayList<String> guess = new ArrayList<>();
		System.out.printf("Murderer Guess: ");
		String response = s.nextLine();
		guess.add(response);
		System.out.printf("Room Guess: ");
		response = s.nextLine();
		guess.add(response);
		System.out.printf("Murderer Guess: ");
		response = s.nextLine();
		guess.add(response);
		
		return guess;
	}
}

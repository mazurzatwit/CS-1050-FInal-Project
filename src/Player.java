
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
		str = String.format("%s (%s): %s", character, name, hand.toString());
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
	
}

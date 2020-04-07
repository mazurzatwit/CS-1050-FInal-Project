

public class Hand {
	private String[] hand;
	
	
	public Hand(String[] hand)
	{
		 this.hand = hand;
	}
	
	public Hand()
	{
		for(int i = 0; i < this.hand.length; i++)
		{
			hand[i] = "";
		}
	}

	//interaction guess between players
	public String showCards(int index) 
	{
		return hand[index];
	}	
	
	public int handLength()
	{
		return hand.length;
	}
	
	
	@Override
	public String toString() { // prints the hand
		StringBuilder  sb = new StringBuilder();
		for(int i = 0; i < hand.length; i++)
		{
			sb.append(String.format("%s, ", hand[i]));
		}
		return sb.toString();
	}
		
	
	
}

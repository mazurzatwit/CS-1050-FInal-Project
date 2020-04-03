

public class Hand {
	private String[] hand;
	
	
	public Hand(String[] hand)
	{
		 this.hand = hand;
	}

	//interaction guess between players
	public void showCards() 
	{
	
		//loop for asking about final guess
	}	
	
	
	
	@Override
	public String toString() { // prints the hand
		StringBuilder  sb = new StringBuilder();
		for(int i = 0; i < hand.length; i++)
		{
			sb.append(String.format("%s", hand[i]));
		}
		return sb.toString();
	}
		
	
	
}

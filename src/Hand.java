import java.util.ArrayList;

public class Hand extends Deck {
	private static ArrayList<String> hand;
	private ArrayList<String> newDeck = shuffle();
	
	public Hand()
	{
		hand = new ArrayList<>(); 
	}

	//interaction guess between players
	public void showCards() 
	{
	
		//loop for asking about final guess
	}	
	
	
	
	@Override
	public String toString() { // prints the hand
		String output = "no clue what's going on";
		return output;
	}



	@Override
	public ArrayList<String> deal(int size) {
		ArrayList<String> holds = new ArrayList<>();
		int handSize = newDeck.size()/size;
		if(size == 2 || size == 3)
		{
			for(int i = 0; i <= handSize; i++)
			{
				String curr = newDeck.get(i);
				holds.add(curr);
				newDeck.remove(curr);
			}
		}
		else if(size == 4)
		{
			
		}
		/*
		if(handSize == 0) {
			for(int i = 0; i <= handSize; i++)
			{
				String curr = newDeck.get(i);
				holds.add(curr);
				newDeck.remove(curr);
			}
		} else if (handSize != 0) {
			
			// mod shuffle deck
		} 
		*/ 
		return holds;
	}
	
	
}

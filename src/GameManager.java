import java.util.ArrayList;

public class GameManager extends Deck{
	private int numPlayers;
	private ArrayList<String> newDeck = shuffle();
	
	public GameManager(int num)
	{
		num = numPlayers;
	}
	
	

	@Override
	public ArrayList<String> deal() {
		ArrayList<String> holds = new ArrayList<>();
		int handSize = newDeck.size()/numPlayers;
		if(numPlayers == 2 || numPlayers == 3)
		{
			for(int i = 0; i <= handSize; i++)
			{
				String curr = newDeck.get(i);
				holds.add(curr);
				newDeck.remove(curr);
			}
		}
		else if(numPlayers == 4)
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

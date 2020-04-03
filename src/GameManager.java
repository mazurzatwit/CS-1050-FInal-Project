import java.util.ArrayList;

public class GameManager extends Deck{
	private int numPlayers;
	private ArrayList<String> newDeck = shuffle();
	
	public GameManager(int num)
	{
		num = numPlayers;
	}
	
	

	@Override
	public void deal() {
		int handSize = newDeck.size()/numPlayers;
		if(numPlayers == 3)
		{
			String[] hand1 = new String[handSize];
			String[] hand2 = new String[handSize];
			String[] hand3 = new String[handSize];
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand1[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand2[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand3[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			Hand h1 = new Hand(hand1);
			Hand h2 = new Hand(hand2);
			Hand h3 = new Hand(hand3);
		}
		else if(numPlayers == 4)
		{
			String[] hand1 = new String[handSize];
			String[] hand2 = new String[handSize];
			String[] hand3 = new String[handSize];
			String[] hand4 = new String[handSize];
			
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand1[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand2[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand3[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++) 
			{
				hand4[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			Hand h1 = new Hand(hand1);
			Hand h2 = new Hand(hand2);
			Hand h3 = new Hand(hand3);
			Hand h4 = new Hand(hand4);
		}
		else if(numPlayers == 5) 
		{
			String[] hand1 = new String[handSize];
			String[] hand2 = new String[handSize];
			String[] hand3 = new String[handSize];
			String[] hand4 = new String[handSize];
			String[] hand5 = new String[handSize];
			
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand1[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand2[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand3[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++) 
			{
				hand4[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++) 
			{
				hand5[i] = newDeck.get(i);
				newDeck.remove(i);
			}			
			Hand h1 = new Hand(hand1);
			Hand h2 = new Hand(hand2);
			Hand h3 = new Hand(hand3);
			Hand h4 = new Hand(hand4);
			Hand h5 = new Hand(hand5);
		}
		else if(numPlayers == 6) 
		{
			String[] hand1 = new String[handSize];
			String[] hand2 = new String[handSize];
			String[] hand3 = new String[handSize];
			String[] hand4 = new String[handSize];
			String[] hand5 = new String[handSize];
			String[] hand6 = new String[handSize];
			
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand1[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand2[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++)
			{
				hand3[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++) 
			{
				hand4[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++) 
			{
				hand5[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			for(int i = 0; i < newDeck.size(); i++) {
				hand6[i] = newDeck.get(i);
				newDeck.remove(i);
			}
			Hand h1 = new Hand(hand1);
			Hand h2 = new Hand(hand2);
			Hand h3 = new Hand(hand3);
			Hand h4 = new Hand(hand4);
			Hand h5 = new Hand(hand5);
			Hand h6 = new Hand(hand6);
		}
		
		
	}
	
	
}

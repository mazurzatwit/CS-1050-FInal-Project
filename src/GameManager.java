import java.util.ArrayList;
import java.util.Scanner;

public class GameManager extends Deck{
	private int numPlayers;
	private ArrayList<String> newDeck = shuffle();
	private Scanner input;
	
	public GameManager(int num, Scanner s)
	{
		num = numPlayers;
		input = s;
	}
	
	public String[] playerName()
	{
		String[] names = new String[numPlayers];
		for(int i = 0; i < names.length; i++)
		{
			names[i] = input.nextLine();
		}
		return names;
	}
	
	public String[] playerCharacter()
	{
		String[] characters = new String[numPlayers];
		for(int i = 0; i < characters.length; i++)
		{
			characters[i] = input.nextLine();
		}
		return characters;
	}

	@Override
	public void deal() {
		int handSize = newDeck.size()/numPlayers;
		String[] names = playerName();
		String[] characters = playerCharacter();
		if(numPlayers%newDeck.size() == 0)
		{
			for(int i = 1; i <= numPlayers; i++)
			{
				String[] hand = new String[handSize];
				for(int j = 0; j < newDeck.size(); j++)
				{
					hand[j] = newDeck.get(j);
					newDeck.remove(j);
				}
				Player p = new Player(names[i-1],characters[i-1], new Hand(hand));
			}
		}
		else if(numPlayers%newDeck.size() != 0)
		{
			if(numPlayers == 4)
			{
				String[] hand1 = new String[5];
				String[] hand2 = new String[5];
				String[] hand3 = new String[4];
				String[] hand4 = new String[4];
				
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
				Player p1 = new Player(names[0],characters[0], new Hand(hand1));
				Player p2 = new Player(names[1],characters[1], new Hand(hand2));
				Player p3 = new Player(names[2],characters[2], new Hand(hand3));
				Player p4 = new Player(names[3],characters[3], new Hand(hand4));
			}
			else if(numPlayers == 5)
			{
				String[] hand1 = new String[4];
				String[] hand2 = new String[4];
				String[] hand3 = new String[4];
				String[] hand4 = new String[3];
				String[] hand5 = new String[3];
				
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
				Player p1 = new Player(names[0],characters[0], new Hand(hand1));
				Player p2 = new Player(names[1],characters[1], new Hand(hand2));
				Player p3 = new Player(names[2],characters[2], new Hand(hand3));
				Player p4 = new Player(names[3],characters[3], new Hand(hand4));
				Player p5 = new Player(names[4],characters[4], new Hand(hand5));
			}
		}
		/*
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
		*/
		
	}
	
	
}

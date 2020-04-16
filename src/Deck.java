import java.util.ArrayList;
import java.util.Random;

public abstract class Deck extends Card{
	private Random rand = new Random();
	protected String[] solution;
	
	public String[] Solution()
	{
		String[] solution = new String[3];
        int num = rand.nextInt(characters.size()); 
        solution[0] = characters.get(num).toString();
        characters.remove(num);
       
        num = rand.nextInt(rooms.size());
        solution[1] = rooms.get(num).toString();
        rooms.remove(num);
        
        num = rand.nextInt(weapons.size());
        solution[2] = weapons.get(num).toString();
        weapons.remove(num);
        
        return solution;
	}
	
	public ArrayList<String> fillDeck()
	{
		ArrayList<String> deck = new ArrayList<>();
		String[] cString = new String[5];
		solution = Solution();
		for(int i = 0; i < characters.size(); i++)
		{
			cString[i] = characters.get(i).toString();
			deck.add(cString[i]);
		}
		String[] rString = new String[8];
		for(int j = 0; j < rooms.size(); j++)
		{
			rString[j] = rooms.get(j).toString();
			deck.add(rString[j]);
		}
		String[] wString = new String[5];
		for(int k = 0; k < weapons.size(); k++)
		{
			wString[k] = weapons.get(k).toString();
			deck.add(wString[k]);
		}
		return deck;
	}
	
	public ArrayList<String> shuffle() 
	{
		ArrayList<String> deck = fillDeck();
		ArrayList<String> shuffledDeck = new ArrayList<>();
		int num = 0;
		for(int i = 0; i < deck.size(); i++)
		{
			num = rand.nextInt(deck.size());
			shuffledDeck.add(i, deck.get(num));
			deck.remove(num);
		}
		return shuffledDeck;
	}
	
	public abstract ArrayList<Player> deal(String[] names, String[] characters);

}

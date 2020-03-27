import java.util.Random;

public abstract class Deck extends Card{
	private Random rand = new Random();
	
	public void Solution()
	{
		 Object[] solution = new Object[3];
        int num = rand.nextInt(characters.size()); 
        solution[0] = characters.get(num);
        characters.remove(num);
       
        num = rand.nextInt(rooms.size());
        solution[1] = rooms.get(num);
        rooms.remove(num);
        
        num = rand.nextInt(weapons.size());
        solution[2] = weapons.get(num);
        weapons.remove(num);
	}
	
	public void fillDeck()
	{
		
	}
	
	public void deal()
	{
		
	}

}

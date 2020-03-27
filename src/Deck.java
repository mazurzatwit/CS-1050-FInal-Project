import java.util.ArrayList;
import java.util.Random;

public abstract class Deck extends Card{
	private Random rand = new Random();

	public ArrayList<Characters> Character(ArrayList<Characters> c){
		c.add(new Characters("Mrs.White", "White"));
		c.add(new Characters("Professor Plum", "Purple"));
		c.add(new Characters("Colonel Mustard", "Yellow"));
		c.add(new Characters("Mrs.Peacock", "Blue"));
		c.add(new Characters("Miss.Scarlet", "Red"));
		c.add(new Characters("Mr.Green", "Green"));
		return c;
	}
	
	public static ArrayList<Rooms> Rooms(ArrayList<Rooms> r){
		r.add(new Rooms("Library", true));
		r.add(new Rooms("Ballroom", true));
		r.add(new Rooms("Kitchen", true));
		r.add(new Rooms("Conservatory", true));
		r.add(new Rooms("Billard Room", true));
		r.add(new Rooms("Study", true));
		r.add(new Rooms("Hall", true));
		r.add(new Rooms("Lounge", true));
		r.add(new Rooms("Dining Room", true));
		return r;
	}
	
	public ArrayList<Weapons> Weapons(ArrayList<Weapons> w) {
		w.add(new Weapons("Wrench"));
		w.add(new Weapons("Candlestick"));
		w.add(new Weapons("Lead Pipe"));
		w.add(new Weapons("Rope"));
		w.add(new Weapons("Revolver"));
		w.add(new Weapons("Dagger (Knife)"));
		return w;
	}
	 
	
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

import java.util.ArrayList;

public abstract class Card {
	
	private void Character(){
		ArrayList<Characters> characters = new ArrayList<>();
		characters.add(new Characters("Mrs.White", "White"));
		characters.add(new Characters("Professor Plum", "Purple"));
		characters.add(new Characters("Colonel Mustard", "Yellow"));
		characters.add(new Characters("Mrs.Peacock", "Blue"));
		characters.add(new Characters("Miss.Scarlet", "Red"));
		characters.add(new Characters("Mr.Green", "Green"));
		characters.add(new Characters("Mr.Boddy", "Black"));
	}
	
	private static void Rooms(){
		ArrayList<Rooms> rooms = new ArrayList<>();
		rooms.add(new Rooms("Library", true));
		rooms.add(new Rooms("Ballroom", true));
		rooms.add(new Rooms("Kitchen", true));
		rooms.add(new Rooms("Conservatory", true));
		rooms.add(new Rooms("Billard Room", true));
		rooms.add(new Rooms("Study", true));
		rooms.add(new Rooms("Hall", true));
		rooms.add(new Rooms("Lounge", true));
		rooms.add(new Rooms("Dining Room", true));
		
	}
	
	private void Weapons() {
		ArrayList<Weapons> weapons = new ArrayList<>();
		weapons.add(new Weapons("Wrench"));
		weapons.add(new Weapons("Candlestick"));
		weapons.add(new Weapons("Lead Pipe"));
		weapons.add(new Weapons("Rope"));
		weapons.add(new Weapons("Revolver"));
		weapons.add(new Weapons("Dagger (Knife"));
	}
	 
	public Card()
	{
		
	}
	
	public void showCards()
	{
		
	}
			
}

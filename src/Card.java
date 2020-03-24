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
	}
	
	private void Weapons() {
		ArrayList<Weapons> weapons = new ArrayList<>();
	}
	
	public Card()
	{
		
	}
	
	public void showCards()
	{
		
	}
			
}

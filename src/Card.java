import java.util.ArrayList;


public class Card {
	

	 protected ArrayList<Characters> characters = new ArrayList<>();
	 protected ArrayList<Rooms> rooms = new ArrayList<>();
	 protected ArrayList<Weapons> weapons = new ArrayList<>();
	 
	 public Card()
	 {
		 Character();
		 Rooms(rooms);
		 Weapons(weapons);
	 }


	public void Character(){
		characters.add(new Characters("Mrs.White", "White"));
		characters.add(new Characters("Professor Plum", "Purple"));
		characters.add(new Characters("Colonel Mustard", "Yellow"));
		characters.add(new Characters("Mrs.Peacock", "Blue"));
		characters.add(new Characters("Miss.Scarlet", "Red"));
		characters.add(new Characters("Mr.Green", "Green"));
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
	 
			
}

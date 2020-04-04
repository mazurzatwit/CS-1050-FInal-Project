
public class Weapons{
	private String weapon;
	
	public Weapons(String weapon)
	{
		this.weapon = weapon;
	}
	
	@Override 
	public String toString() {
		
		String weapon = String.format("Weapons: %s", this.weapon);
		return weapon;
		
	}

}

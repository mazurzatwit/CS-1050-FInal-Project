
public class Characters extends Card{
	private String name;
	private String color;
	//private Rooms location;
	
	public Characters(String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		String str = "";
		str = String.format("Character: %s, Color: %s", name, color);
		return str;
	}
	

}

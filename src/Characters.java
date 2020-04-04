
public class Characters{
	private String name;
	private String color;
	//private Rooms location;
	
	public Characters(String name, String color)
	{
		//MS: There is an implicit call to super() here, which calls your constructor in Card,
		//which calls this constructor, which calls your constructor in Card, which calls
		//this constructor...hence the stack overflow.
		//Consider changing the structure
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

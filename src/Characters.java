
public class Characters{
	private String name;
	private String color;
	
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

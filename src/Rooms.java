
public class Rooms{
	private String name;
	
	public Rooms(String name, boolean door)
	{
		this.name = name;
	}
	@Override
	public String toString() {
		String string = "";
		string = String.format("Rooms: %s", name);
		return string;
	}
	

}

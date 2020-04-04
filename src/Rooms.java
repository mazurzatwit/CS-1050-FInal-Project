
public class Rooms{
	private String name;
	private boolean door; //if true door is "open", else door is "closed"
	
	public Rooms(String name, boolean door)
	{
		this.name = name;
		this.door = door;
	}
	@Override
	public String toString() {
		String string = "";
		string = String.format("Rooms: %s, Door: %s",name, door);
		return string;
	}
	

}

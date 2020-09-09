
public class Two {
	private String s;
	
	public Two(String s)
	{
		this.s = s;
	}
	
	public String getFullName()
	{
		int space = s.indexOf(" ");
		
		if(space == -1)
			return s.substring(0, 1).toUpperCase() + s.substring(1);
		
		s = s.substring(0, 1).toUpperCase() + s.substring(1, space) + " " + s.substring(space + 1, space + 2).toUpperCase() + s.substring(space + 2);
		
		return s;
	}
}

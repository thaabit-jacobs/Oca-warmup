

public class One {
	
	private String firstWord;
	private String lastWord;
	
	public void setFirstWord(String s1)
	{
		firstWord = s1.substring(0, 1).toUpperCase() + s1.substring(1);		
	}
	
	public void setlastWord(String s1)
	{
		lastWord = s1.substring(0, 1).toUpperCase() + s1.substring(1);	
	}
	
	public String getFullName()
	{
		return firstWord + " " + lastWord;
	}

}

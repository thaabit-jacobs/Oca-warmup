package linked_list;

interface Setter
{
	void setFirstWord(String s1);
	void setlastWord(String s1);
}

interface Getter
{
	String getFullName();
}


class ModifyOne implements Setter, Getter
{
	
	private String firstWord;
	private String lastWord;
	
	public void setFirstWord(String s1)
	{
		firstWord = s1;
				
	}
	
	public void setlastWord(String s1)
	{
		lastWord = s1;
				
	}
	
	public String getFullName()
	{
		firstWord = firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1);
		lastWord = lastWord.substring(0, 1).toUpperCase() + lastWord.substring(1);
		
		return firstWord + " " + lastWord;
	}
}


class ModifyTwo
{
	private String s;
	
	
	public ModifyTwo(String s1)
	{
		s = s1;
	}
	
	public String getFullName()
	{
		int space = s.indexOf(" ");
		
		s = s.substring(0, 1).toUpperCase() + s.substring(1, space) + " " + s.substring(space + 1, space + 2).toUpperCase() + s.substring(space + 2);
		return s;
	}
}

public class OCAWarmUp {

	public static void main(String[] args) {
		//reflecion
		
		ModifyOne m1 = new ModifyOne();
		m1.setFirstWord("thaabit");
		m1.setlastWord("jacobs");
		m1.getFullName();
		
		
		Setter s1 = (Setter)m1;
		s1.setFirstWord("thaabit");
		s1.setlastWord("jacobs");
		//reference type setter has no getFullName() method
		//s1.getFullName();
		
		Getter g1 = (Getter)m1;
		//refernec getter does not know anything about set methods
		//g1.setFirstWord("thaabit");
		//g1.setlastWord("jacobs");
		g1.getFullName();
		
		Setter s2 = (Setter)g1;
		Getter g2 = (Getter)s1;
		
		ModifyOne m2 = (ModifyOne)s2;
		ModifyOne m3 = (ModifyOne)g2;
		
		/*
		 * Using interfaces as references always for casting of the instance to reference type
		 * of any of the interfaces it implements
		 * It always for casting to a reference type of the object from an interface reference type
		 */
		
		//System.out.println(m2.getFullName());
		
	}

}

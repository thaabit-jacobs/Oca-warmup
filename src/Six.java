
public class Six {
	
	private int[] arr;
	
	public Six(int[] userArr)
	{
		arr = userArr;
	}
	
	public int getSumOfThrees()
	{
		int total = 0;
		
		for(int i: arr)
			if(i % 3 == 0)
				total += i;
		
		return total;
	}

	public static void main(String[] args) {
		System.out.println(new Six(new int[] {2, 5, 18, 24, 4, -4, 15, 12, 10}).getSumOfThrees());
	}

}

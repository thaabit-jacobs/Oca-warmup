
public class Seven {
	int[][] arr;
	
	public Seven(int[][] userArr)
	{
		arr = userArr;
	}
	
	public int getSumOfFives()
	{
		int total = 0;
		
		for(int[] a: arr)
			for(int b: a)
				if(b % 5 == 0)
					total += b;
		
		return total;
	}
}

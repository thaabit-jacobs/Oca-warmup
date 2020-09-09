
public class Eight {
	private int mutiple;
	private int[][] arr;
	
	public Eight(int[][] userArr)
	{
		arr = userArr;
	}
	
	public void setMutiple(int val)
	{
		mutiple = val;
	}
	
	public int sumOfMutiples()
	{
		int total = 0;
		
		for(int[] a: arr)
			for(int b: a)
				if(b % mutiple == 0)
					total += b;
		
		return total;
	}
}

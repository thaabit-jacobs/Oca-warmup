
public class Five {
	public void printArray()
	{
		int[][] arr = new int[10][10];
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
			{
				count++;
				arr[i][j] = count*2;
			}
				
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
			{
				if((arr[i][j] % 3 == 0) || (arr[i][j] % 5 == 0))
					arr[i][j] = 0;
			}
		
		
		for(int[] a: arr)
			for(int b: a)
				System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		Five f = new Five();
		f.printArray();
	}
}

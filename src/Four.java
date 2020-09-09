
public class Four {
	public void printArray()
	{
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = i*2;
		
		for(int i = 0; i < arr.length; i++)
		{
			if((arr[i] % 3 == 0 ) || (arr[i] % 5 == 0))
				arr[i] = 0;
		}
		
		for(int i: arr)
			System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		Four f = new Four();
		f.printArray();
	}
}

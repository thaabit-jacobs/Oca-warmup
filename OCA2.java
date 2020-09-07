package linked_list;

public class OCA2 {

	public static void specialArrayOneDimesionalArray()
	{
		int[] arr = new int[10];
		String[] str = new String[10];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = i*2;
		
		for(int i = 0; i < arr.length; i++)
		{
			if((arr[i] % 3 == 0 ) || (arr[i] % 5 == 0))
				str[i] = "*";
			else
				str[i] = Integer.valueOf(arr[i]).toString();
		}
		
		for(String i: str)
			System.out.println(i);
	}
	
	public static void specialArrayTwoDimesionalArray()
	{
		int[][] arr = new int[10][10];
		String[][] str = new String[10][10];
		
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
					str[i][j] = "*";
				else
					str[i][j] = Integer.valueOf(arr[i][j]).toString();
			}
		
		
		for(String[] a: str)
			for(String b: a)
				System.out.println(b);
	}
	
	public static void main(String[] args) {
		//specialArrayOneDimesionalArray();
		//specialArrayTwoDimesionalArray();
		
		SumMutipleThree sum = new SumMutipleThree(new int[] {2, 4, 10, 15, 3, 47, 10, 25});
		System.out.println(sum.getSumOfThrees());
	}
}

class SumMutipleThree
{
	private int[] arr;
	
	public SumMutipleThree(int[] userArr)
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
}

class SumMutipleFive
{
	int[][] arr;
	
	public SumMutipleFive(int[][] userArr)
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

class SumSetMutiple
{
	private int mutiple;
	private int[][] arr;
	
	public SumSetMutiple(int[][] userArr)
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





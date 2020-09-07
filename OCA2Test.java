package linked_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OCA2Test {
	
	SumMutipleThree sum = new SumMutipleThree(new int[] {2, 4, 10, 15, 3, 47, 10, 25});
	
	@Test
	void addAllMutipliesOfThree() {
		assertEquals(18, sum.getSumOfThrees());
	}
	
	@Test
	void addAllMutipliesOfFive() {
		int[][] arr = new int[2][5];
		
		SumMutipleFive s = new SumMutipleFive(arr);
		
		arr[0][0] = 2;
		arr[0][1] = 10;
		arr[0][2] = 8;
		arr[0][3] = 25;
		arr[0][4] = 4;
		
		arr[1][0] = 4;
		arr[1][1] = 115;
		arr[1][2] = 2;
		arr[1][3] = 24;
		arr[1][4] = 4;
		assertEquals(150, s.getSumOfFives());
	}
	
	@Test
	void addAllMutipliesOfASetValue() {
		int[][] arr = new int[2][5];
		
		SumSetMutiple s = new SumSetMutiple(arr);
		s.setMutiple(5);
		
		arr[0][0] = 2;
		arr[0][1] = 10;
		arr[0][2] = 8;
		arr[0][3] = 25;
		arr[0][4] = 4;
		
		arr[1][0] = 4;
		arr[1][1] = 115;
		arr[1][2] = 2;
		arr[1][3] = 24;
		arr[1][4] = 4;
		assertEquals(150, s.sumOfMutiples());
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SevenTest {
	private final Seven s = new Seven(new int[][] {{2, 10}, {5, 25}});
	
	@Test
	void shouldReturnAllTheMutiplesofFive() {
		assertEquals(40, s.getSumOfFives());
	}

}

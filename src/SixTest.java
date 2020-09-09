import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SixTest {

	private final Six s = new Six(new int[] {3, 5, 7, 2, 4, 12});
	
	@Test
	void shouldReturnSumOfMutipliesOfThree() {
		assertEquals(15, s.getSumOfThrees());
	}

}

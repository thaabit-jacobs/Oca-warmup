import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoTest {
	private final Two t = new Two("thaabit jacobs");
	private final Two t2 = new Two("thaabit");
	
	@Test
	void shouldMakeFirstLetterUppercaseAndLastNameLetterUppperCase() {
		assertEquals("Thaabit Jacobs", t.getFullName());
	}
	
	@Test
	void shouldMakeFirstLetterUppercase() {
		assertEquals("Thaabit", t2.getFullName());
	}
}

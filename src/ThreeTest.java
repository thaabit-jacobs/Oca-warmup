import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThreeTest {
	private final Three o = new Three();
	
	@Test
	void shouldMakeFirstLetterUpperCase() {
		String name = "thaabit";
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		assertEquals("Thaabit", name);
	}
	
	@Test
	void shouldSetTheFirstAndLastNameAndGetFullName() {
		o.setFirstWord("thaabit");
		o.setlastWord("jacobs");
		assertEquals("Thaabit Jacobs", o.getFullName());
	}

}

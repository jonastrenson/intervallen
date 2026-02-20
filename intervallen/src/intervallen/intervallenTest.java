package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intervallenTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval(3,4);
		int length = myInterval.getLength();
		assertEquals(1, length);
	}

}

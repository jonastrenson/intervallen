package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intervallenTest {
	
	@Test
	void test() {
		Interval myInterval = new Interval();
		Interval.setOndergrens(myInterval,3);
		Interval.setBovengrens(myInterval,4);
		int length = Interval.getLength(myInterval);
		assertEquals(1, length);
	}

}

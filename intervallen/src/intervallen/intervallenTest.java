package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intervallenTest {
	
	class Interval {
		int ondergrens;
		int bovengrens;
	}
	
	void setOndergrens(Interval interval, int ondergrens) {
		interval.ondergrens = ondergrens;
	}
	
	void setBovengrens(Interval interval, int bovengrens) {
		interval.bovengrens = bovengrens;
	}
	
	int getLength(Interval interval) {
		return interval.bovengrens - interval.ondergrens;
	}

	@Test
	void test() {
		Interval myInterval = new Interval();
		setOndergrens(myInterval,3);
		setBovengrens(myInterval,4);
		int length = getLength(myInterval);
		assertEquals(1, length);
	}

}

package intervallen;



public class Interval {
	int ondergrens;
	int lengte;
	

	static void setOndergrens(Interval interval, int ondergrens) {
		interval.ondergrens = ondergrens;
	}

	static void setBovengrens(Interval interval, int bovengrens) {
	interval.lengte = bovengrens - interval.ondergrens;
	}

	static int getLength(Interval interval) {
	return interval.lengte;
	}
	
}
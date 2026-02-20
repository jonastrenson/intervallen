package intervallen;



public class Interval {
	private int ondergrens;
	private int lengte;
	
	Interval(int ondergrens, int bovengrens) {
		this.ondergrens = ondergrens;
		this.lengte = bovengrens - ondergrens;
	}

	void setOndergrens(int ondergrens) {
		this.ondergrens = ondergrens;
	}

	void setBovengrens(int bovengrens) {
		this.lengte = bovengrens - this.ondergrens;
	}

	int getLength() {
		return this.lengte;
	}
	
}
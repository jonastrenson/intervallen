package intervallen;



public class Interval {
	private int ondergrens;
	private int lengte;
	

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
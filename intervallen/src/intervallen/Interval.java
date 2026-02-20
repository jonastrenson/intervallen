package intervallen;


/**
 * Elke instantie van deze klasse slaat een interval met gehele
 * ondergrens en gehele bovengrens op.
 * 
 * @invar De lengte is niet negatief.
 * 	| 0 <= this.getLength()
 * 
 * @invar
 * 	| getLength() == getBovengrens() - getOndergrens()
 */
public class Interval {
	/**
	 * @invar | 0 <= lengte
	 */
	private int ondergrens;
	private int lengte;
	
	public int getOndergrens() {return ondergrens;}
	
	public int getBovengrens() {return lengte + ondergrens;}
	
	public int getLength() {
		return this.lengte;
	}
	
	/**
	 * Initialiseert het object met de gegeven ondergrens 
	 * en bovengrens.
	 * @throws IllegalArgumentException
	 * 	| ondergrens > bovengrens
	 * @post | getLength() == bovengrens - ondergrens
	 * @post | getOndergrens() == ondergrens
	 */
	public Interval(int ondergrens, int bovengrens) {
		if (ondergrens > bovengrens)
			throw new IllegalArgumentException("`ondergrens` is"
					+ "groter dan `bovengrens`");
		this.ondergrens = ondergrens;
		lengte = bovengrens - ondergrens;
	}
	
	/**
	 * Stelt de ondergrens van het interval in op de gegeven waarde.
	 * @mutates | this
	 * @post | getOndergrens() == ondergrens
	 * @post | getLength() == old(getLength())
	 */
	public void setOndergrens(int ondergrens) {
		this.ondergrens = ondergrens;
	}

	/**
	 * Stelt de bovengrens van het interval in op de gegeven waarde.
	 * @pre | getOndergrens() <= bovengrens
	 * @mutates | this
	 * @post | getBovengrens() == bovengrens
	 * @post | getOndergrens() == old(getOndergrens())
	 */
	public void setBovengrens(int bovengrens) {
		lengte = bovengrens - this.ondergrens;
	}
	
}
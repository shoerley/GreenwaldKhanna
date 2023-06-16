
public class Tuple {

	private long val;		// an observation, v in the paper
	private int g;			// g = rmin(v_i) - rmin(v_(i-1)) ; rmin being the lower bound on the rank of v amoung the observations seen so far
	private int d;			// d = rmax(v_i) - rmin(v_i) , rmax being the upper bound.

	// ranks are left integers, allowing 2 147 483 647 values. Should be enough !
	private int rmin;
	private int rmax;

	public Tuple(long val, int g, int d) {
		this.val = val;
		this.g = g;
		this.d = d;
		rmin = 0;
		rmax = 0;
	}

	public long getVal() {
		return val;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getD() {
		return d;
	}

	public int getRmin() {
		return rmin;
	}

	public void setRmin(int rmin) {
		this.rmin = rmin;
	}

	public int getRmax() {
		return rmax;
	}

	public void setRmax(int rmax) {
		this.rmax = rmax;
	}

	public String toString() {

		return "(" + val + ", " + g + ", " + d + ")";

	}

}

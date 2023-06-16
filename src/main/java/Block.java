import java.util.ArrayList;

public class Block {

	private ArrayList<Tuple> summary;

	private long bstart;
	private long numObs;

	public Block(long bstart) {
		summary = new ArrayList<Tuple>();
		numObs = 0;
		this.bstart = bstart;
	}

	public long bstart() {
		return bstart;
	}

	public long numObs() {
		return numObs;
	}

	public void incrNumObs() {
		numObs++;
	}
	
	public ArrayList<Tuple> summary() {
		return summary;
	}

}

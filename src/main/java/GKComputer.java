import java.util.ArrayList;
import java.util.List;

public class GKComputer {

	private int n = 0;
	private double epsilon;
	ArrayList<Tuple> summary = new ArrayList<>();

	public GKComputer(double epsilon) {
		this.epsilon = epsilon;
	}

	public GKComputer(double epsilon, ArrayList<Tuple> summary) {
		this.epsilon = epsilon;
		this.summary = summary;
		this.n = summary.size();
	}

	public void insertSummary(ArrayList<Tuple> summary) {
		if (this.summary.isEmpty()) {
			this.summary = summary;
		}
		else {
			this.summary = GKWindow.merge(this.summary, summary);
		}

	}

	public void insertManySummaries(List<ArrayList<Tuple>> summaryList) {
		for (ArrayList<Tuple> summary : summaryList) {
			this.summary = GKWindow.merge(this.summary, summary);
		}
	}

	public void insertMany(List<Integer> bulk) {
		for (Integer obs : bulk) {
			insertAndCompress(obs);
		}
	}

	public void insertAndCompress(int obs) {
		GK.insertAndCompress(n, obs, summary, epsilon);
		n++;
	}

	public ArrayList<Integer> quantiles(double phi) {
		return GK.quantile(phi, n, summary, epsilon);
	}

	public double quantile(double phi) {
		ArrayList<Integer> quantiles = quantiles(phi);
		return quantiles.stream().mapToInt(Integer::intValue).average().orElse(0.0);

	}

	public ArrayList<Tuple> getSummary() {
		return summary;
	}

	public int getN() {
		return n;
	}

	public double getEpsilon() {
		return epsilon;
	}

	public void setN(int n) {
		this.n = n;
	}
}

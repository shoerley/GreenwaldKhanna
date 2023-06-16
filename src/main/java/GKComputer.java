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

	public void insertMany(List<Long> bulk) {
		for (Long obs : bulk) {
			insertAndCompress(obs);
		}
	}

	public void insertAndCompress(long obs) {
		GK.insertAndCompress(n, obs, summary, epsilon);
		n++;
	}

	public ArrayList<Long> quantiles(double phi) {
		return GK.quantile(phi, n, summary, epsilon);
	}

	public double quantile(double phi) {
		ArrayList<Long> quantiles = quantiles(phi);
		return quantiles.stream().mapToLong(Long::longValue).average().orElse(0.0);

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

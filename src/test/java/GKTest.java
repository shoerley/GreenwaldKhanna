import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@RunWith(JUnit4.class)
public class GKTest {

	List<Integer> firstList = Arrays.asList(33, 40, 28, 24, 59, 63, 29, 60, 2, 39, 86, 99, 72, 9, 57, 3, 72, 55, 99, 88, 21, 34, 29, 62, 11, 3, 70, 61, 18, 20, 15, 8, 4, 90, 86, 8, 66, 38, 60, 52, 11, 95, 83, 79, 77, 58, 3, 73, 18, 58, 86, 79, 91, 19, 43, 95, 74, 78, 96, 68, 36, 31, 79, 42, 44, 2, 65, 9, 79, 13, 92, 4, 85, 76, 73, 65, 73, 59, 40, 41, 20, 27, 15, 42, 89, 56, 62, 82, 5, 43, 71, 49, 62, 37, 22, 97, 30, 9, 89, 12, 91, 33, 85, 12, 49, 41, 49, 58, 65, 92, 13, 54, 42, 61, 98, 35, 35, 25, 73, 32, 3, 4, 57, 92, 50, 34, 47, 52, 93, 95, 28, 90, 46, 25, 98, 19, 50, 46, 87, 26, 18, 69, 47, 40, 40, 53, 7, 1, 41, 65, 31, 75, 76, 10, 90, 31, 87, 3, 84, 82, 96, 94, 79, 80, 46, 67, 57, 9, 54, 30, 79, 15, 40, 71, 47, 50, 97, 95, 69, 42, 23, 4, 51, 81, 30, 56, 50, 84, 35, 27, 64, 30, 16, 92, 24, 21, 86, 13, 12, 75, 20, 60, 78, 39, 33, 60, 87, 74, 54, 29, 49, 35, 88, 69, 52, 89, 78, 65, 53, 12, 2, 21, 66, 99, 61, 69, 67, 31, 17, 22, 62, 50, 99, 95, 31, 38, 94, 60, 39, 56, 69, 88, 26, 16, 7, 1, 15, 55, 16, 92, 28, 99, 14, 61, 44, 3, 7, 55, 40, 49, 60, 40, 17, 94, 12, 25, 54, 9, 91, 60, 6, 82, 12, 85, 20, 80, 75, 4, 24, 17, 45, 98, 15, 78, 98, 23, 91, 41, 60, 90, 13, 12, 42, 11, 98, 50, 20, 23, 62, 35, 84, 6, 73, 80, 61, 92, 18, 76, 58, 33, 9, 63, 35, 30, 51, 58, 86, 34, 11, 15, 25, 34, 52, 95, 72, 7, 75, 61, 16, 75, 49, 60, 10, 41, 83, 79, 45, 73, 83, 16, 29, 26, 54, 24, 32, 89, 73, 99, 7, 23, 5, 84, 28, 59, 84, 98, 51, 1, 63, 54, 92, 23, 21, 61, 39, 96, 11, 80, 84, 97, 15, 58, 76, 21, 38, 68, 35, 11, 21, 89, 10, 78, 75, 70, 23, 98, 7, 87, 22, 81, 29, 81, 16, 75, 3, 84, 77, 34, 70, 7, 73, 18, 28, 23, 3, 74, 19, 19, 90, 8, 31, 71, 91, 22, 65, 68, 63, 81, 30, 67, 44, 66, 83, 27, 98, 43, 62, 64, 34, 77, 39, 43, 77, 13, 68, 82, 26, 43, 59, 79, 57, 41, 65, 82, 22, 82, 69, 42, 46, 19, 31, 37, 15, 91, 63, 82, 63, 44, 24, 16, 48, 54, 79, 62, 53, 12, 41, 69, 28, 62, 94, 71, 10, 65, 6, 22, 5, 73, 15, 18, 40, 77, 44, 74, 22, 2, 5, 79, 15, 28, 18, 3, 87, 31, 3, 42, 93, 77, 6, 73, 33, 88, 37, 94, 86, 69, 79, 36, 17, 83, 12, 29, 71, 4, 95, 70, 23, 72, 15, 84, 96, 59, 83, 78, 80, 96, 25, 62, 89, 64, 43, 51, 37, 35, 26, 85, 96, 25, 87, 49, 91, 78, 61, 16, 88, 39, 41, 32, 74, 87, 25, 60, 59, 46, 35, 7, 38, 88, 59, 9, 23, 43, 6, 25, 36, 5, 26, 3, 64, 11, 13, 5, 75, 94, 43, 41, 1, 81, 46, 11, 81, 30, 36, 95, 18, 95, 67, 63, 19, 93, 11, 44, 80, 98, 59, 92, 40, 65, 47, 18, 24, 49, 65, 34, 35, 54, 48, 47, 91, 40, 6, 8, 2, 8, 69, 82, 1, 47, 35, 93, 56, 98, 97, 83, 76, 92, 85, 20, 69, 46, 29, 21, 55, 25, 1, 48, 34, 82, 4, 67, 97, 36, 66, 4, 59, 9, 89, 78, 13, 11, 69, 70, 45, 93, 76, 46, 27, 98, 68, 72, 38, 95, 49, 45, 94, 2, 69, 72, 57, 29, 46, 56, 69, 97, 94, 70, 12, 3, 34, 9, 86, 83, 54, 16, 1, 47, 99, 3, 14, 9, 69, 93, 17, 31, 85, 95, 51, 43, 53, 82, 17, 1, 62, 72, 89, 97, 85, 99, 52, 54, 24, 53, 28, 89, 51, 93, 55, 15, 77, 11, 92, 3, 64, 34, 93);
	List<Integer> secondList = Arrays.asList(58, 8, 95, 3, 8, 3, 87, 78, 3, 7, 84, 84, 85, 65, 10, 36, 87, 68, 81, 61, 73, 95, 87, 39, 30, 60, 33, 19, 98, 80, 50, 3, 85, 21, 50, 29, 56, 96, 22, 7, 76, 82, 41, 92, 65, 61, 83, 51, 64, 68, 60, 84, 36, 29, 51, 2, 32, 37, 52, 93, 56, 93, 21, 52, 9, 49, 9, 93, 50, 84, 75, 6, 59, 74, 42, 16, 78, 75, 76, 26, 12, 2, 13, 1, 14, 82, 36, 9, 66, 49, 63, 34, 68, 12, 44, 35, 93, 49, 67, 68, 32, 54, 41, 77, 34, 67, 90, 23, 3, 92, 54, 51, 70, 2, 62, 66, 9, 36, 83, 83, 25, 26, 71, 66, 6, 41, 65, 14, 29, 79, 56, 17, 25, 79, 94, 90, 12, 24, 39, 67, 81, 29, 99, 73, 78, 33, 11, 18, 52, 5, 14, 28, 69, 24, 51, 38, 43, 24, 75, 9, 52, 6, 55, 8, 96, 90, 2, 61, 83, 23, 16, 24, 64, 85, 54, 93, 85, 55, 8, 23, 22, 11, 76, 84, 74, 6, 21, 62, 46, 59, 32, 50, 81, 45, 21, 3, 47, 45, 30, 34, 19, 75, 60, 45, 74, 64, 29, 5, 1, 70, 63, 4, 99, 65, 68, 67, 69, 3, 96, 71, 35, 99, 73, 36, 17, 53, 26, 59, 68, 91, 27, 84, 46, 93, 97, 61, 87, 75, 50, 88, 74, 75, 37, 63, 74, 51, 54, 57, 1, 25, 20, 7, 16, 38, 21, 67, 14, 57, 9, 7, 5, 49, 78, 29, 40, 41, 86, 64, 34, 5, 57, 6, 11, 97, 75, 29, 93, 33, 39, 51, 77, 69, 95, 20, 72, 51, 10, 56, 53, 25, 46, 59, 26, 97, 28, 37, 36, 36, 48);
	long randomSeed = 2048;
	//int nObservations = 100;
	Random random = new Random(randomSeed);

	private static final Logger log = LoggerFactory.getLogger(GKTest.class);



	double epsilon = 0.01;


	List<Integer>  initObservations(int nObservations) {
		List<Integer> randomNumbers = new ArrayList<>(nObservations);
		for (int i= 0; i < nObservations; i++) {
			randomNumbers.add(random.nextInt(100));
		}
		return randomNumbers;
	}

	@Test
	public void testGK() {
		double phi = 0.75;

		GKComputer gkComputer = new GKComputer(0.01);
		gkComputer.insertMany(firstList);

		log.info("Test GK simple");

		double quantile = gkComputer.quantile(phi);		// expected 77 (computed with libreoffice calc)
		log.info("average quantile {}: {}", phi, quantile);

		Assert.assertEquals(quantile, 77, 0);

	}

	@Test
	public void testGKAddObservations() {
		double phi = 0.75;
		GKComputer gkComputer = new GKComputer(0.01);
		gkComputer.insertMany(firstList);

		log.info("Test GK add observations");

		double quantile = gkComputer.quantile(phi);		// expected 77 (computed with libreoffice calc)
		log.info("avg quantile {} (first list): {}", phi, quantile);

		gkComputer.insertMany(secondList);
		quantile = gkComputer.quantile(phi);			// expected 75 (computed with libreoffice calc)
		log.info("avg quantile {} (full list): {}", phi, quantile);

		Assert.assertEquals(quantile, 77, 1);
		Assert.assertEquals(quantile, 75, 1);

	}

	@Test
	public void testGKRestore() {
		double phi = 0.75;

		// build model
		GKComputer gkComputer = new GKComputer(0.01);
		gkComputer.insertMany(firstList);
		gkComputer.insertMany(secondList);

		log.info("Test GK restore");

		// print quantile
		double quantile = gkComputer.quantile(phi);			// expected 75 (computed with libreoffice calc)
		log.info("original quantile {} (full list): {}", phi, quantile);
		Assert.assertEquals(quantile, 75, 1);

		// save params
		double epsilon = gkComputer.getEpsilon();
		int nObs = gkComputer.getN();
		ArrayList<Tuple> summary = gkComputer.getSummary();

		// restore params in new model
		GKComputer restoredGK = new GKComputer(epsilon, summary);

		// ensure restored model outputs same quantile as original
		double restoredQuantile = restoredGK.quantile(phi);
		log.info("Restored quantile {} (full list): {}", phi, quantile);
		Assert.assertEquals(restoredQuantile, 75, 1);

	}

	@Test
	public void testGKMerge() {
		double phi = 0.75;
		double epsilon = 0.05;

		log.info("Test GK merge");

		// build model with full list
		GKComputer gkFullList = new GKComputer(epsilon);
		gkFullList.insertMany(firstList);

		// print quantile for model with full list
		double quantile = gkFullList.quantile(phi);		// expected 75 (computed with libreoffice calc)
		log.info("avg quantile {} (full list): {}", phi, quantile);
		Assert.assertEquals(quantile, 75, 1);


		// build separate models, one per list
		GKComputer gkFirstList = new GKComputer(epsilon);
		gkFirstList.insertMany(firstList);

		GKComputer gkSecondList = new GKComputer(epsilon);
		gkSecondList.insertMany(secondList);


		// attempt merge models, not lists
		GKComputer gkMergedModels = new GKComputer(epsilon);
		int nObs = gkFirstList.getN() + gkSecondList.getN();
		gkMergedModels.insertSummary(gkFirstList.getSummary());
		gkMergedModels.insertSummary(gkSecondList.getSummary());
		gkMergedModels.setN(nObs);

		quantile = gkMergedModels.quantile(phi);		// expected 75 (computed with libreoffice calc)
		log.info("avg quantile {} (merged models): {}", phi, quantile);
		Assert.assertEquals(quantile, 75, 1);

	}

	@Test
	public void testGKBig() {

		int nbAttempts = 50000000;
		double epsilon = 0.05;
		GKComputer gkModel = new GKComputer(epsilon);
		double quantile = 0;
		double phi = 0.75;
		int bound = 100000;

		log.info("Test GK big");

		for (int i = 0; i < nbAttempts; i++) {
			gkModel.insertAndCompress(random.nextInt(bound));

			if (i % 5000 == 0) {
				quantile = gkModel.quantile(phi);		// expected to tend towards phi * bound if observations are drawn at random (uniform drawing)
				log.info("intermediate quantile {} (iter {}): {}", phi, i, quantile);
				log.info("number of tuples: {}", gkModel.getSummary().size());
			}
		}
	}

	/*public static void main(String[] args) {
		GKTest gkTest = new GKTest();

		gkTest.testGK();
		gkTest.testGKAddObservations();
		gkTest.testGKRestore();
		gkTest.testGKMerge();
		gkTest.testGKBig();
	}*/

}

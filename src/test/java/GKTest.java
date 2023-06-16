import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


@RunWith(JUnit4.class)
public class GKTest {

	List<Long> firstList = Arrays.asList(33L,  40L,  28L,  24L,  59L,  63L,  29L,  60L,  2L,  39L,  86L,  99L,  72L,  9L,  57L,  3L,  72L,  55L,  99L,  88L,  21L,  34L,  29L,  62L,  11L,  3L,  70L,  61L,  18L,  20L,  15L,  8L,  4L,  90L,  86L,  8L,  66L,  38L,  60L,  52L,  11L,  95L,  83L,  79L,  77L,  58L,  3L,  73L,  18L,  58L,  86L,  79L,  91L,  19L,  43L,  95L,  74L,  78L,  96L,  68L,  36L,  31L,  79L,  42L,  44L,  2L,  65L,  9L,  79L,  13L,  92L,  4L,  85L,  76L,  73L,  65L,  73L,  59L,  40L,  41L,  20L,  27L,  15L,  42L,  89L,  56L,  62L,  82L,  5L,  43L,  71L,  49L,  62L,  37L,  22L,  97L,  30L,  9L,  89L,  12L,  91L,  33L,  85L,  12L,  49L,  41L,  49L,  58L,  65L,  92L,  13L,  54L,  42L,  61L,  98L,  35L,  35L,  25L,  73L,  32L,  3L,  4L,  57L,  92L,  50L,  34L,  47L,  52L,  93L,  95L,  28L,  90L,  46L,  25L,  98L,  19L,  50L,  46L,  87L,  26L,  18L,  69L,  47L,  40L,  40L,  53L,  7L,  1L,  41L,  65L,  31L,  75L,  76L,  10L,  90L,  31L,  87L,  3L,  84L,  82L,  96L,  94L,  79L,  80L,  46L,  67L,  57L,  9L,  54L,  30L,  79L,  15L,  40L,  71L,  47L,  50L,  97L,  95L,  69L,  42L,  23L,  4L,  51L,  81L,  30L,  56L,  50L,  84L,  35L,  27L,  64L,  30L,  16L,  92L,  24L,  21L,  86L,  13L,  12L,  75L,  20L,  60L,  78L,  39L,  33L,  60L,  87L,  74L,  54L,  29L,  49L,  35L,  88L,  69L,  52L,  89L,  78L,  65L,  53L,  12L,  2L,  21L,  66L,  99L,  61L,  69L,  67L,  31L,  17L,  22L,  62L,  50L,  99L,  95L,  31L,  38L,  94L,  60L,  39L,  56L,  69L,  88L,  26L,  16L,  7L,  1L,  15L,  55L,  16L,  92L,  28L,  99L,  14L,  61L,  44L,  3L,  7L,  55L,  40L,  49L,  60L,  40L,  17L,  94L,  12L,  25L,  54L,  9L,  91L,  60L,  6L,  82L,  12L,  85L,  20L,  80L,  75L,  4L,  24L,  17L,  45L,  98L,  15L,  78L,  98L,  23L,  91L,  41L,  60L,  90L,  13L,  12L,  42L,  11L,  98L,  50L,  20L,  23L,  62L,  35L,  84L,  6L,  73L,  80L,  61L,  92L,  18L,  76L,  58L,  33L,  9L,  63L,  35L,  30L,  51L,  58L,  86L,  34L,  11L,  15L,  25L,  34L,  52L,  95L,  72L,  7L,  75L,  61L,  16L,  75L,  49L,  60L,  10L,  41L,  83L,  79L,  45L,  73L,  83L,  16L,  29L,  26L,  54L,  24L,  32L,  89L,  73L,  99L,  7L,  23L,  5L,  84L,  28L,  59L,  84L,  98L,  51L,  1L,  63L,  54L,  92L,  23L,  21L,  61L,  39L,  96L,  11L,  80L,  84L,  97L,  15L,  58L,  76L,  21L,  38L,  68L,  35L,  11L,  21L,  89L,  10L,  78L,  75L,  70L,  23L,  98L,  7L,  87L,  22L,  81L,  29L,  81L,  16L,  75L,  3L,  84L,  77L,  34L,  70L,  7L,  73L,  18L,  28L,  23L,  3L,  74L,  19L,  19L,  90L,  8L,  31L,  71L,  91L,  22L,  65L,  68L,  63L,  81L,  30L,  67L,  44L,  66L,  83L,  27L,  98L,  43L,  62L,  64L,  34L,  77L,  39L,  43L,  77L,  13L,  68L,  82L,  26L,  43L,  59L,  79L,  57L,  41L,  65L,  82L,  22L,  82L,  69L,  42L,  46L,  19L,  31L,  37L,  15L,  91L,  63L,  82L,  63L,  44L,  24L,  16L,  48L,  54L,  79L,  62L,  53L,  12L,  41L,  69L,  28L,  62L,  94L,  71L,  10L,  65L,  6L,  22L,  5L,  73L,  15L,  18L,  40L,  77L,  44L,  74L,  22L,  2L,  5L,  79L,  15L,  28L,  18L,  3L,  87L,  31L,  3L,  42L,  93L,  77L,  6L,  73L,  33L,  88L,  37L,  94L,  86L,  69L,  79L,  36L,  17L,  83L,  12L,  29L,  71L,  4L,  95L,  70L,  23L,  72L,  15L,  84L,  96L,  59L,  83L,  78L,  80L,  96L,  25L,  62L,  89L,  64L,  43L,  51L,  37L,  35L,  26L,  85L,  96L,  25L,  87L,  49L,  91L,  78L,  61L,  16L,  88L,  39L,  41L,  32L,  74L,  87L,  25L,  60L,  59L,  46L,  35L,  7L,  38L,  88L,  59L,  9L,  23L,  43L,  6L,  25L,  36L,  5L,  26L,  3L,  64L,  11L,  13L,  5L,  75L,  94L,  43L,  41L,  1L,  81L,  46L,  11L,  81L,  30L,  36L,  95L,  18L,  95L,  67L,  63L,  19L,  93L,  11L,  44L,  80L,  98L,  59L,  92L,  40L,  65L,  47L,  18L,  24L,  49L,  65L,  34L,  35L,  54L,  48L,  47L,  91L,  40L,  6L,  8L,  2L,  8L,  69L,  82L,  1L,  47L,  35L,  93L,  56L,  98L,  97L,  83L,  76L,  92L,  85L,  20L,  69L,  46L,  29L,  21L,  55L,  25L,  1L,  48L,  34L,  82L,  4L,  67L,  97L,  36L,  66L,  4L,  59L,  9L,  89L,  78L,  13L,  11L,  69L,  70L,  45L,  93L,  76L,  46L,  27L,  98L,  68L,  72L,  38L,  95L,  49L,  45L,  94L,  2L,  69L,  72L,  57L,  29L,  46L,  56L,  69L,  97L,  94L,  70L,  12L,  3L,  34L,  9L,  86L,  83L,  54L,  16L,  1L,  47L,  99L,  3L,  14L,  9L,  69L,  93L,  17L,  31L,  85L,  95L,  51L,  43L,  53L,  82L,  17L,  1L,  62L,  72L,  89L,  97L,  85L,  99L,  52L,  54L,  24L,  53L,  28L,  89L,  51L,  93L,  55L,  15L,  77L,  11L,  92L,  3L,  64L,  34L,  93L);
	List<Long> secondList = Arrays.asList(58L, 8L, 95L, 3L, 8L, 3L, 87L, 78L, 3L, 7L, 84L, 84L, 85L, 65L, 10L, 36L, 87L, 68L, 81L, 61L, 73L, 95L, 87L, 39L, 30L, 60L, 33L, 19L, 98L, 80L, 50L, 3L, 85L, 21L, 50L, 29L, 56L, 96L, 22L, 7L, 76L, 82L, 41L, 92L, 65L, 61L, 83L, 51L, 64L, 68L, 60L, 84L, 36L, 29L, 51L, 2L, 32L, 37L, 52L, 93L, 56L, 93L, 21L, 52L, 9L, 49L, 9L, 93L, 50L, 84L, 75L, 6L, 59L, 74L, 42L, 16L, 78L, 75L, 76L, 26L, 12L, 2L, 13L, 1L, 14L, 82L, 36L, 9L, 66L, 49L, 63L, 34L, 68L, 12L, 44L, 35L, 93L, 49L, 67L, 68L, 32L, 54L, 41L, 77L, 34L, 67L, 90L, 23L, 3L, 92L, 54L, 51L, 70L, 2L, 62L, 66L, 9L, 36L, 83L, 83L, 25L, 26L, 71L, 66L, 6L, 41L, 65L, 14L, 29L, 79L, 56L, 17L, 25L, 79L, 94L, 90L, 12L, 24L, 39L, 67L, 81L, 29L, 99L, 73L, 78L, 33L, 11L, 18L, 52L, 5L, 14L, 28L, 69L, 24L, 51L, 38L, 43L, 24L, 75L, 9L, 52L, 6L, 55L, 8L, 96L, 90L, 2L, 61L, 83L, 23L, 16L, 24L, 64L, 85L, 54L, 93L, 85L, 55L, 8L, 23L, 22L, 11L, 76L, 84L, 74L, 6L, 21L, 62L, 46L, 59L, 32L, 50L, 81L, 45L, 21L, 3L, 47L, 45L, 30L, 34L, 19L, 75L, 60L, 45L, 74L, 64L, 29L, 5L, 1L, 70L, 63L, 4L, 99L, 65L, 68L, 67L, 69L, 3L, 96L, 71L, 35L, 99L, 73L, 36L, 17L, 53L, 26L, 59L, 68L, 91L, 27L, 84L, 46L, 93L, 97L, 61L, 87L, 75L, 50L, 88L, 74L, 75L, 37L, 63L, 74L, 51L, 54L, 57L, 1L, 25L, 20L, 7L, 16L, 38L, 21L, 67L, 14L, 57L, 9L, 7L, 5L, 49L, 78L, 29L, 40L, 41L, 86L, 64L, 34L, 5L, 57L, 6L, 11L, 97L, 75L, 29L, 93L, 33L, 39L, 51L, 77L, 69L, 95L, 20L, 72L, 51L, 10L, 56L, 53L, 25L, 46L, 59L, 26L, 97L, 28L, 37L, 36L, 36L, 48L);
	long randomSeed = 2048;
	int nObservations = 10000;
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
		GKComputer gkComputer = new GKComputer(0.15);
		gkComputer.insertMany(firstList);
		gkComputer.insertMany(secondList);

		log.info("Test GK restore");

		// print quantile
		double quantile = gkComputer.quantile(phi);			// expected 75 (computed with libreoffice calc)
		log.info("original quantile {} (full list): {}", phi, quantile);
		Assert.assertEquals(quantile, 75, 10);

		// save params
		double epsilon = gkComputer.getEpsilon();
		int nObs = gkComputer.getN();
		ArrayList<Tuple> summary = gkComputer.getSummary();

		// restore params in new model
		GKComputer restoredGK = new GKComputer(epsilon, summary);

		// ensure restored model outputs same quantile as original
		double restoredQuantile = restoredGK.quantile(phi);
		log.info("Restored quantile {} (full list): {}", phi, restoredQuantile);
		Assert.assertEquals(quantile, restoredQuantile, 10);

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
		gkMergedModels.setN(nObs);
		gkMergedModels.insertSummary(gkFirstList.getSummary());
		gkMergedModels.insertSummary(gkSecondList.getSummary());


		quantile = gkMergedModels.quantile(phi);		// expected 75 (computed with libreoffice calc)
		log.info("avg quantile {} (merged models): {}", phi, quantile);
		Assert.assertEquals(quantile, 75, 1);

	}

	@Test
	public void testGKBig() {

		double epsilon = 0.05;
		GKComputer gkModel = new GKComputer(epsilon);
		double quantile = 0;
		double phi = 0.75;

		List<Long> observations = generateLongTimestamps();
		gkModel.insertMany(observations);

		log.info("Test GK with longs");

		quantile = gkModel.quantile(phi);
		log.info("avg quantile {}: {}", phi, quantile);
	}

	public List<Long> generateLongTimestamps() {
		List<Long> longList = new ArrayList<>(nObservations);
		long min = 1592329783000L; 		// 15 juin 2020
		long max = 1686937817000L;		// 15 juin 2023

		for (int i = 0; i < nObservations; i++) {

			long val = min + (long) (random.nextDouble() * (max - min + 1));
			longList.add(val);
		}

		writeNumbers(longList, "timestamps.txt");
		return longList;
	}

	public void writeNumbers(List<Long> numbers, String filename)  {
		try (PrintWriter pw = new PrintWriter(filename)) {
			for (int i = 0; i < numbers.size(); i++) {
				pw.println(numbers.get(i));
			}
		} catch (Exception err) {
			err.printStackTrace();
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

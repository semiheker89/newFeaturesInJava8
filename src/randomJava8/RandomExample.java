package randomJava8;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("getRandomNumberInRange");
			System.out.println(getRandomNumberInRange(5, 10));
			System.out.println("getRandomDoubleInRange");
			System.out.println(getRandomDoubleInRange(3, 7));
			System.out.println("getRandomNumberInRangeWithInclusiveAndExclusive");
			System.out.println(getRandomNumberInRangeWithInclusiveAndExclusive(10, 30));
		}
		System.out.println("getRandomNumber");
		getRandomNumber();
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt(min) + min;
	}

	private static Double getRandomDoubleInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		return (Math.random() * ((max - min) + 1)) + min;
	}

	private static int getRandomNumberInRangeWithInclusiveAndExclusive(int min, int max) {

		Random r = new Random();
		return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

	}

	private static void getRandomNumber() {
		new Random().ints(10, 33, 38).forEach(System.out::println);
	}
}

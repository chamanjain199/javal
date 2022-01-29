package javal.java8;

import java.util.stream.IntStream;

public class WrongIdentityEx {

	public static void main(String[] args) {

		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println("Corret output " + sum);
		int sumWrong = IntStream.rangeClosed(1, 10).parallel().reduce(10, Integer::sum);
		System.out.println("Incorret output " + sumWrong);

		System.out.println("diff  " + (sumWrong - sum));
		System.out.println(Runtime.getRuntime().availableProcessors());


	}

}

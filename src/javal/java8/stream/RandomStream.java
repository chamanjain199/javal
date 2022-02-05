package javal.java8.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomStream {

	public static void main(String[] args) {

		Random random = new Random();
		IntStream randomInstStream= random.ints(1, 30).limit(10);
		randomInstStream.forEach(System.out::println);
	}

}

package javal.java9;

import java.util.stream.Stream;

public class IteratorMethod {

	public static void main(String[] args) {

		Stream.iterate(0, n -> n < 100, n -> n + 2).forEach(x -> System.out.println(x));
	}

}

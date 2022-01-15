package javal.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCanNotBeReused {
	public static void main(String[] args) {
		List<String> list = List.of("A", "D", "C");

		Stream<String> stream = list.stream();

		Stream<String> streamFilter = stream.filter(x -> x.length() > 0);
		streamFilter.collect(Collectors.toList());

		Stream<String> streamFilter1 = stream.filter(x -> x.length() > 0);
		// Exception in thread "main" java.lang.IllegalStateException: stream has
		// already been operated upon or closed
		streamFilter1.collect(Collectors.toList());

		// Exception in thread "main" java.lang.IllegalStateException: stream has
		// already been operated upon or closed

		streamFilter.filter(x -> x.length() > 0);
	}
}

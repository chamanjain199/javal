package javal.java8;

import java.util.List;
import java.util.stream.Collectors;

public class StatefullOperationInStream {

	public static void main(String[] args) {

		List<String> names = List.of("raj", "aman", "amit", "ankur", "kamal", "raj", "amit", "vipin", "lakhan",
				"parikshit", "vipin");
		names.stream().peek(e -> System.out.println("Gogin to filter")).filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Going for distinct")).distinct()
				.peek(e -> System.out.println("Going for sorted")).sorted()
				.peek(e -> System.out.println("Going for map")).map(e -> e.toUpperCase())
				.peek(e -> System.out.println("Going to collect")).collect(Collectors.toList());

	}

}

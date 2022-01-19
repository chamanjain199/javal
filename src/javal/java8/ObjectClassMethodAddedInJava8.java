package javal.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ObjectClassMethodAddedInJava8 {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<>();
		lists.add("A");
		lists.add("B");
		lists.add("C");
		lists.add("D");
		lists.add(null);

		List<String> abs = lists.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(abs); // [A, B, C, D]

		List<String> abs2 = lists.stream().map(el -> Objects.requireNonNull(el, () -> "Null found"))
				.collect(Collectors.toList()); // Exception in thread "main" java.lang.NullPointerException: Null found
		System.out.println(abs);

	}

}

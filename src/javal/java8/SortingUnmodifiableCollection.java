package javal.java8;

import java.util.List;
import java.util.stream.Collectors;

public class SortingUnmodifiableCollection {

	public static void main(String[] args) {
		List<String> list = List.of("A", "D", "C");

		// Collections.sort(list); // java.lang.UnsupportedOperationException
		// list.sort(null); // java.lang.UnsupportedOperationException
		List<String> l = list.stream().sorted().collect(Collectors.toList());
		System.out.println(l);

	}

}

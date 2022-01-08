package javal.java8;

import java.util.Set;
import java.util.stream.Collectors;

public class SkipAndLimitWithSet {

	public static void main(String[] args) {

		Set<String> set = Set.of("A", "B", "C", "D", "E", "F", "G", "H");
		System.out.println(set.stream().limit(5).collect(Collectors.toList()));
		System.out.println(set.stream().skip(5).collect(Collectors.toList()));
//      Output 1
//		[H, A, B, C, D]
//		[E, F, G]
		
//      Output 1
//		[C, D, E, F, G]
//		[H, A, B]

	}

}

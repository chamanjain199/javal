package javal.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStream {

	public static void main(String[] args) {

		List<Integer> list1 = List.of(1, 2, 3);
		List<Integer> list2 = List.of(4, 5, 6);
		List<Integer> list3 = List.of(7, 8, 9);

		List<List<Integer>> list = List.of(list1, list2, list3);
		List<Stream<Integer>> collectUsingMap = list.stream().map(x->x.stream()).collect(Collectors.toList());
		System.out.println(collectUsingMap);
		
		List<Integer> collectUsingFlatMap = list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(collectUsingFlatMap);

	}

}

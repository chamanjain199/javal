package javal.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reducting {

	public static void main(String[] args) {

		String suto = "Auto generated method stub";
		String concating = Stream.of(suto.split(" ")).reduce("", (s1, s2) -> s1.concat(s2));
		System.out.println(concating);

		ArrayList<String> list = Stream.of(suto.split(" ")).collect(() -> new ArrayList<String>(),
				(s1, s2) -> s1.add(s2), (l1, l2) -> l1.addAll(l2));
		System.out.println(list);

		ArrayList<String> list2 = Stream.of(suto.split(" ")).collect(ArrayList<String>::new, ArrayList::add,
				ArrayList::addAll);
		System.out.println(list2);
		List<String> list3 =  Stream.of(suto.split(" ")).map(Object::toString)
                .collect(Collectors.toList());
		System.out.println(list3);

	}

}

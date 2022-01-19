package javal.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethod {

	public static void main(String[] args) {

		List<String> emps = new ArrayList<>();
		emps.add("A");
		emps.add("B");
		emps.add("A");
		emps.add("B");
		emps.add("C");
		List<String> epms1=	emps.stream().distinct().collect(Collectors.toList());
		System.out.println(epms1); //[A, B, C]
	}

}

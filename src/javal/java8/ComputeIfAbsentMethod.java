package javal.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentMethod {

	public static void main(String[] args) {

		List<String> cities = List.of("vidisha", "bhopal", "basoda", "indore", "damoh", "dahod");
		Map<String, List<String>> mapCount = new HashMap<>();

		for (String city : cities) {
			mapCount.computeIfAbsent(city.charAt(0)+"", k->new ArrayList<>()).add(city);

		}
		System.out.println(mapCount);
	}

}

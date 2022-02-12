package javal.java.stackoverflow;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaRemoveDuplicate {

	public static void main(String[] args) {

		List<Map<String, List<String>>> set = List.of(Map.of("Ford", List.of("hatchback", "sedan", "TEST")),
				Map.of("Honda", List.of("hatchback", "sedan")), Map.of("Toyota", List.of("TeST2")));
		
		List<String> unique=set.stream().flatMap(map->map.values().stream()).flatMap(list->list.stream()).distinct().collect(Collectors.toList());

		System.out.println(unique);
	}

}

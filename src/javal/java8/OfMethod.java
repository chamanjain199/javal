package javal.java8;

import java.util.Map;

public class OfMethod {

	static void mapOf() {
		Map<String, String> maps = Map.of("A", "A");
		Map<String, String> maps1 = Map.ofEntries(Map.entry("B", "b"), Map.entry("C", "c"), Map.entry("D", "d"));
		
		maps1.forEach((key, value) -> System.out.println("Key " + key + "  Value " + value));

	}

	public static void main(String[] args) {

		mapOf();
	}

}

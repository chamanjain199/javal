package javal.java9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StaticMethodOfCollection {
	
	static void methodOfMap() {
		Map<String, String>  ma= Map.ofEntries(Map.entry("A", "l"),Map.entry(null, "a"));
		
		
	}

	static void methodOfSet() {
		Set<String> ts=Set.of("A","A");
		
		
	}

	public static void main(String[] args) {
		methodOfMap();
		methodOfSet();
	}

}

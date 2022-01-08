package javal.java9;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class OfNullableMethod {
	@Deprecated(forRemoval = true,since = "9")
	public static void main(String[] args) {

		Map<String, String> maps =Map.of("A", "a","B","b","C","c","D","d");
		List<String> keys=List.of("A","B","F");
		
		keys.stream().flatMap(x->Stream.ofNullable(maps.get(x))).forEach(x->System.out.println(x));
		

	}

}

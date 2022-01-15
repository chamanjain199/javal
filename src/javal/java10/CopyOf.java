package javal.java10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyOf {

	public static void main(String[] args) {

		List<String> cities=new ArrayList<>();
		cities.add("vidisha");
		cities.add("bhopal");
		cities.add("damoh");
		
		
		List<String> copyOfCities=List.copyOf(cities);
		List<String> copyOfCities2=List.of(cities.toArray(new String[] {}));

		List<String> viewOfCities=Collections.unmodifiableList(cities);
		
		cities.add("Indore");
		
		System.out.println(copyOfCities);
		System.out.println(viewOfCities);
		System.out.println(copyOfCities2);

		
	}

}

package javal.java8;

import java.util.HashMap;
import java.util.Map;

public class ForEachWithMap {

	public static void main(String[] args) {

		Map<String,String> map=new HashMap<>();
		map.put("D", "AAs");
		map.forEach((key,value)->System.out.println(key+" "+value));
	}

}

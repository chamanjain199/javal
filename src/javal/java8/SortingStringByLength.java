package javal.java8;

import java.util.Arrays;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class SortingStringByLength {
	
	public static void print() {
		System.out.println("Thread running");
	}

	public static void main(String[] args) {
		
		 Logger log=Logger.getLogger(SortingStringByLength.class.getName());
		List<String> strings=Arrays.asList("A","B","C","D","S","A","B","G","R","C","R");
		System.out.println(strings);
		System.out.println(strings.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));
		System.out.println(strings.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList()));

		Thread t1=new Thread(SortingStringByLength::print);
		t1.start();
	}
}

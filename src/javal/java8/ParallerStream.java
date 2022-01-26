package javal.java8;

import java.util.List;
import java.util.Random;

public class ParallerStream {

	public static void main(String[] args) {

		List<Integer> sal = new Random().ints(1,300).boxed().limit(200).toList();
		int sum=sal.parallelStream().reduce(0, Integer::sum);
		System.out.print(sum);
	}

}

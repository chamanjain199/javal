package javal.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamConcat {

	public static void main(String[] args) {
		int arr1[]=new int[] {1,2,3,4};
		int arr2[]=new int[] {5,6,7,8};

		
		List<Integer> merged=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).boxed().collect(Collectors.toList());
		System.out.println(merged);
		System.out.print(merged.stream().count());
		

	}

}

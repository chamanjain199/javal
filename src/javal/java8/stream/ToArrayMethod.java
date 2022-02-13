package javal.java8.stream;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {
    public static void main(String[] args) {
        List<Integer> integers=List.of(2,4,5,2,1);
        Object arr[]=integers.stream().toArray();
        System.out.println(Arrays.toString(arr));


        Integer arr1[]=integers.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr1));
    }
}

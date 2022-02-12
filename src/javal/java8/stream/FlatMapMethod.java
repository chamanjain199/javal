package javal.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMethod {
    public static void main(String[] args) {
        flatMap();
        flatMapInt();

    }

    private static void flatMap() {
        List<Integer> list1=List.of(1,2,3);
        List<Integer> list2=List.of(4,5,6);
        List<Integer> list3=List.of(7,8,9);

        List<List<Integer>> allElements=List.of(list1,list2,list3);
        List<Integer> list=allElements.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(list);
    }
    private static void flatMapInt() {
        List<Integer> list1=List.of(1,2,3);
        List<Integer> list2=List.of(4,5,6);
        List<Integer> list3=List.of(7,8,9);

        List<List<Integer>> allElements=List.of(list1,list2,list3);
        int arr[]=allElements.stream().flatMapToInt(x->x.stream().mapToInt(y->y.intValue())).toArray();
        System.out.println(Arrays.toString(arr));
    }
}

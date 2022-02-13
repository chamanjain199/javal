package javal.java8.stream;

import java.util.List;

public class ReduceStreamMethod {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum1 = integers.stream().reduce((sum, num2) -> sum + num2).get();
        System.out.println(sum1);
        Integer sum2 = integers.stream().reduce(0, (sum, num2) -> sum + num2);
        System.out.println(sum2);
        Integer sum3 = integers.stream().reduce(0, (sum, num2) -> sum + num2, (rsum1, rsum2) -> rsum1 + rsum2);
        System.out.println(sum3);
    }
}

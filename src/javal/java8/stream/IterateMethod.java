package javal.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IterateMethod {

    public static void main(String[] args) {
        List<Integer> scores = IntStream.iterate(0, (n) -> n < 10, (n) -> n + 1).boxed().collect(Collectors.toList());
                scores.forEach(x->System.out.print(x+" "));
                System.out.println();
        List<Integer> scores1 = IntStream.iterate(0,  (n) -> n + 1).limit(10).boxed().collect(Collectors.toList());
        scores1.forEach(x->System.out.print(x+" "));    }
}

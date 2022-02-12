package javal.java8.stream;

import javal.java.all.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DropWhile {
    public static void main(String[] args) {
        List<Integer> scores = IntStream.iterate(0, (n) -> n < 101, (n) -> n + 1).boxed().collect(Collectors.toList());
        List<Integer> firstDivision = scores.stream().dropWhile(x -> x < 65).collect(Collectors.toList());
        System.out.println(firstDivision);


        List<Integer> numbers = IntStream.iterate(1, (n) -> n < 11, (n) -> n + 1).boxed().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(numbers);


        Optional<Integer> numbers1 = IntStream.iterate(1, (n) -> n < 11, (n) -> n + 1).boxed().filter(x -> x % 2 == 0).findFirst();
        System.out.println(numbers1.get());
    }
}

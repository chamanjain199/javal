package javal.java8.stream;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratedStream {
    public static void main(String[] args) {
        List<String> list= Stream.generate(()->UUID.randomUUID().toString()).limit(10).collect(Collectors.toList());
        list.stream().forEach(System.out::println);

    }
}

package javal.java8.stream;

import java.util.stream.Stream;

public class OfAndOfNullable {
    public static void main(String[] args) {
        Stream s=Stream.of("2");
        Stream ss=Stream.of("2","3");
        Stream sss=Stream.ofNullable(null);

    }
}

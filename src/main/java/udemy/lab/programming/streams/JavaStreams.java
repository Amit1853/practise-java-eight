package udemy.lab.programming.streams;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();
        IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x));
        System.out.println();
        System.out.println(
                IntStream.range(1, 5).sum()
        );
        System.out.println();
        Stream.of("amit", "Amit", "avantika").sorted(Comparator.reverseOrder()).forEach(x -> System.out.println(x));
        System.out.println();
        List<String> name = Stream.of("Shivangi", "Amit", "Samriddhi", "Shruti").sorted().filter(x -> x.contains("d") || x.contains("a")).collect(Collectors.toList());
        System.out.println(name);

        OptionalInt maxLength = Stream.of("Shivangi", "Amit", "Shruti").mapToInt(String::length).max();
        System.out.println(maxLength);
        Arrays.stream(new int[]{2, 4, 6, 8, 10}).map(x -> x * x).average().ifPresent(System.out::println);
      

    }
}

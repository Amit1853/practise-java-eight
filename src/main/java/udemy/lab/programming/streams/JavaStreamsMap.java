package udemy.lab.programming.streams;

import java.util.Arrays;

public class JavaStreamsMap {
    public static void main(String[] args) {
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(x -> System.out.println(x));
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        Arrays.stream(new String[]{"Shivangi", "Amit", "Samriddhi", "Shruyi"})
                .map(s -> s.toLowerCase())
                .filter(s -> s.contains("s"))
                .forEach(s -> System.out.println(s));



    }
}

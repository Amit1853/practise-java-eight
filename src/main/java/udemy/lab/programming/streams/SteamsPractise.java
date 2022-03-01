package udemy.lab.programming.streams;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteamsPractise {

    public static void main(String[] args) {
        String[] array = new String[]{"Amit", "Apeksha", "Dipraj"};
        Stream.of(array).mapToInt(String::length).max().ifPresent(Str -> {
            System.out.println(Str);
        });

    }

}

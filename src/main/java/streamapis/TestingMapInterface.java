package streamapis;

import java.util.Arrays;
import java.util.List;

public class TestingMapInterface {

    public static void main(String[] args) {
        System.out.println("The Stream after applying the function is:");

        List<String> list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");

        list.stream().map(str -> str.length()).filter(s -> s > 5).forEach(s -> System.out.println(s));
    }
}

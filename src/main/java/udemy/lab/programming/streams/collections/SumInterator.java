package udemy.lab.programming.streams.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumInterator {
    static int sum(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }

    public static void main(String[] args) {
        System.out.println(SumInterator.sum(Arrays.asList(1, 5, 11, 5, 1, 20)));
    }
}

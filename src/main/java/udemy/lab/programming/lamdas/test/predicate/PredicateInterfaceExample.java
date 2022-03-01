package udemy.lab.programming.lamdas.test.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (integer -> integer > 10);

        Predicate<Integer> lessThanTen = (integer -> integer < 10);

        boolean result = greaterThanTen.or(lessThanTen).test(11);
        System.out.println(greaterThanTen.test(2));
        System.out.println(lessThanTen.test(2));
        System.out.println(result);
    }
}

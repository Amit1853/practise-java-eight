package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;

public class TestStringEquality {

    public static void main(String[] args) {


        String s1 = "123456";
        String s2 = null;

        BiPredicate<String, String> testEquality = (str1, str2) -> {
            boolean something = str2.equals(str1);
            return something;
        };
        testEquality.test(s1, s2);
        boolean test = s1 != null && s2 != null ? testEquality.test(s1, s2) : false;

        //Optional<Boolean> test  = testEquality.test(s1, s2)? : Boolean.FALSE ? null;


        List<String> names = Arrays.asList("Amit", "anamika", null);

        Optional<Integer> integer = names.stream().map(n -> n.length()).max(Integer::max);
        System.out.println(integer);



    }

}

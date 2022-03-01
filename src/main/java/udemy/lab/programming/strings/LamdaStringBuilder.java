package udemy.lab.programming.strings;

import java.util.ArrayList;
import java.util.List;

public class LamdaStringBuilder {

    public static void main(String[] args) {
        List<String> str = new ArrayList<>(10000);

        for (Integer i = 0; i < 10000; i++) {
            str.add(i.toString());
        }

        StringBuilder builder = new StringBuilder();
        str.stream().forEach(s -> builder.append(s).append("\n"));

        //System.out.println(builder);

        int x = 3;
        int y = 5;
        System.out.println(x+y+":"+x+y);
    }
}

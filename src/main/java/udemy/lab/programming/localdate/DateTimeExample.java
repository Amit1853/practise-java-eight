package udemy.lab.programming.localdate;

import udemy.lab.programming.lamdas.test.hackerrank.PerformOperation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeExample {
    public static void p(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        p(now);

        LocalDate hireDate = LocalDate.of(2018, 02, 26);
        p(hireDate);

        LocalDate aWeekFromNow = now.plusWeeks(1);
        p(aWeekFromNow);

        LocalDate aWeekAgo = now.minusWeeks(1);
        p(aWeekAgo);

        p(now);

        System.out.println(hireDate.isBefore(now));

        Period period = Period.of(3,5,12);
        p(period);

        now = now.minus(period);
        p(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        p(now.format(formatter));
    }
}

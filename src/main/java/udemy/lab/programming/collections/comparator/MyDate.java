package udemy.lab.programming.collections.comparator;

import java.util.*;

public class MyDate implements Comparator {

    int day, month, year;

    public MyDate() {
    }


    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public int compare(Object o, Object t1) {
        MyDate d1 = (MyDate) o;
        MyDate d2 = (MyDate) t1;

        if (d1.year != d2.year) {
            return d1.year - d2.year;
        }

        if (d1.month != d2.month) {
            return d1.month - d2.month;
        }

        if (d1.day != d2.day) {
            return d1.day - d2.day;
        }
        return 0;
    }

    public static void main(String[] args) {
        List<MyDate> myDates = new ArrayList<>();
        myDates.addAll(Arrays.asList(new MyDate(01, 02, 2021), new MyDate(02, 02, 2021),
                new MyDate(01, 01, 2021)));

        Collections.sort(myDates, new MyDate());
        Collections.sort(myDates, new Comparator<MyDate>() {
            @Override
            public int compare(MyDate myDate, MyDate t1) {
                return 0;
            }
        });
    }

}
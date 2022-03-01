package udemy.lab.programming.collections.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyDate implements Comparable {
    int day, month, year;

    public MyDate() {
    }


    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        MyDate d = (MyDate) o;
        if (year != d.year) {
            return year - d.year;
        }

        if (month != d.month) {
            return month - d.month;
        }

        if (day != d.day) {
            return day - d.day;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        List<MyDate> myDates = new ArrayList<>();
        myDates.addAll(Arrays.asList(new MyDate[]{new MyDate(01, 02, 2021), new MyDate(02, 02, 2021), new MyDate(01, 01, 2021)}));

        Collections.sort(myDates);

        System.out.println(myDates);
    }
}

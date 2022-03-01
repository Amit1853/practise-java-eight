package udemy.lab.programming.localdate.lab;

import java.time.LocalDate;
import java.time.Period;

public class TestOrder {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        Order.setRushable(localDate -> {
            LocalDate now = LocalDate.now();
            Period period = Period.between(localDate, now);
            if (period.getMonths() >= 1) {
                return true;
            } else {
                return false;
            }
        });

        Order hammer = new Order();
        hammer.setOrderDate(currentDate.minusDays(15));
        System.out.println(Order.getRushable().isRushable(hammer.getOrderDate()));
        Order anvil = new Order();
        anvil.setOrderDate(currentDate.minusMonths(1));
        System.out.println(Order.getRushable().isRushable(anvil.getOrderDate()));


    }
}

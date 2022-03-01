package udemy.lab.programming.localdate.lab;

import java.time.LocalDate;

public class Order {
    private static Rushable rushable;
    LocalDate orderDate;
    public static Rushable getRushable() {
        return rushable;
    }

    public static void setRushable(Rushable rushable) {
        Order.rushable = rushable;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}

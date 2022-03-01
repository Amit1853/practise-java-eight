package udemy.lab.programming.lamdas.test.one.parameter;

public class Order {
    private static Rushable rushable;
    private double orderAmount;

    public static Rushable getRushable() {
        return rushable;
    }

    public static void setRushable(Rushable rushable) {
        Order.rushable = rushable;
    }

    public Order() {
        this.orderAmount = 1000;
    }

    public Order(double orderAmount) {
        this.orderAmount = orderAmount;
    }


    public boolean isPriorityOrder() {
        boolean priortyOrder = false;
        if (rushable != null) {
            priortyOrder = rushable.isRushable(orderAmount);
        }
        return priortyOrder;
    }
}

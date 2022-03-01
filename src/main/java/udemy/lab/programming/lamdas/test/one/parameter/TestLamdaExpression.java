package udemy.lab.programming.lamdas.test.one.parameter;

import java.util.function.Predicate;

public class TestLamdaExpression {
    private Rushable rushable;
    private double amount;

    public TestLamdaExpression(){
        amount = 20000;
    }

    public TestLamdaExpression(double amount){
        this.amount = amount;
    }
    public Rushable getRushable() {
        return rushable;
    }

    public void setRushable(Rushable rushable) {
        this.rushable = rushable;
    }

    public boolean isRushable(){
        boolean isRushable = false;
        if(rushable != null){
            isRushable = rushable.isRushable(amount);
        }
        return isRushable;
    }

    public static void main(String[] args) {
        int salary = 50000;
        Payable p = (percentage) -> {
            return salary + (salary * percentage);
        };

        System.out.println(p.cutCheck(.4));
        Order order = new Order(2000);

        Order.setRushable((orderAmount) -> orderAmount > 1500);
        System.out.println("Is Priority " + order.isPriorityOrder());

        TestLamdaExpression testLamdaExpression = new TestLamdaExpression(2000);
        testLamdaExpression.setRushable(amount -> (amount + (amount * .4)) > 1500);
        System.out.println(testLamdaExpression.getRushable());
    }
}

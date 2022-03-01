package udemy.lab.programming.Final.keyword.variable;

public class Bike {
    public final int speedLimit = 90;

    public void run() {
       // speedLimit = 400;
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}

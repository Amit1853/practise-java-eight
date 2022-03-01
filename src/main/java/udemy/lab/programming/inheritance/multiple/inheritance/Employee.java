package udemy.lab.programming.inheritance.multiple.inheritance;

public interface Employee {
    public default void show() {
        System.out.println("show : Employee");
    }
}

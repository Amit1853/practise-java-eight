package udemy.lab.programming.polymorphism;

public class CarDealerShip {
    private static InventoryManager manager = new InventoryManager();

    public static void main(String[] args) {
        manager.addAutomobile(new Car());

        manager.addAutomobile(new Truck());

        manager.addAutomobile(new Motorcycle());
    }
}

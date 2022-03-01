package ObjectTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
    String color = "Green";
    String type;
    int serialNumber;
    /*used to count number of car object created and assign latest number to instance of object*/
    static int carCount = 0;

    {
        color = "Red";
        if (this.type == null || this.type == "") {
            this.type = "type is not set";
        }

        if (carCount == 0) {
            carCount = 1;
        } else {
            carCount = carCount + 1;
        }

        if (this.serialNumber == 0) {
            this.serialNumber = carCount;
        }
    }

    Car() {
        this.color = "Blue";
    }

    void start() {
        System.out.println("Getting Started!");
    }

    void printDescription() {
        System.out.println("This is " + this.color + " and " + this.type + " and serial Number : " + serialNumber);
    }

    public static void main(String[] args) {
        /*Car car = new Car();
        car.printDescription();
        Car myCar = new Car();
        myCar.printDescription();*/

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cars.add(new Car());
        }

        cars.stream().forEach(car1 -> car1.printDescription());

        List<Car> evenNumberCars = cars.stream().filter(car1 -> car1.serialNumber % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("\nPrinting Even Number Cars\n");

        evenNumberCars.stream().forEach(car1 -> car1.printDescription());

    }
}

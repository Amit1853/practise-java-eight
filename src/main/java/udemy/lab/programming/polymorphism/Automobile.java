package udemy.lab.programming.polymorphism;

public class Automobile {
    private static Integer vinCount = 3_818_201;
    private int VIN;

    public Integer getVIN() {
        return this.VIN;
    }

    public Automobile() {
        VIN = vinCount++;
    }
}

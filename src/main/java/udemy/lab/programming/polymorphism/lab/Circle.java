package udemy.lab.programming.polymorphism.lab;

public class Circle extends Shape {
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius;
    }
}

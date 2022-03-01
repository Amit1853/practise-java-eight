package udemy.lab.programming.polymorphism.lab;

public class ShapeManager {
    public double caculateArea(Shape shape) {
        return shape.area();
    }

    public static void main(String[] args) {
        System.out.println(new ShapeManager().caculateArea(new Circle(1.0f)));
        System.out.println(new ShapeManager().caculateArea(new Rectange(2.0f, 4.0f)));
    }
}

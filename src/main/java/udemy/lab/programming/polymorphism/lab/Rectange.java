package udemy.lab.programming.polymorphism.lab;

public class Rectange extends Shape {
    private float length;
    private float width;

    public Rectange() {
    }

    public Rectange(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

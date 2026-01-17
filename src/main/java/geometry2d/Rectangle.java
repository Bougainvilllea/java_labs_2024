package geometry2d;

public class Rectangle {
    public double a;
    public double b;
    public Rectangle(double a_rectangle, double b_rectangle) {
        a = a_rectangle;
        b = b_rectangle;
    }
    public Double area() {
        return a * b;
    }
    public String toString(){

        return "Rectangle: " + "a: " + a + " b: " + b;
    }
}

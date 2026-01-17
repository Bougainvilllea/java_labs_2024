package geometry2d;

import exceptions.WrongRadius;

public class Circle {
    double radius;
    public Circle(double radius_circle){
        if (radius_circle > 0){
            radius = radius_circle;
        }
        else{
            throw new WrongRadius("Radius must be positive");
        }

    }
    public Double area() {
        return 3.14 * radius * radius;
    }
    public String toString(){

        return "Circle: " + radius;
    }
}

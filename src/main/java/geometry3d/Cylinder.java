package geometry3d;

import exceptions.WrongHeight;
import exceptions.WrongRadius;
import geometry2d.Circle;
import geometry2d.Rectangle;

public class Cylinder {

    Circle circle;
    Rectangle rect;
    public Cylinder(double radius_cylinder, double a_cylinder) {
        if (a_cylinder > 0){
            circle = new Circle(radius_cylinder);
            rect = new Rectangle(a_cylinder, 0);
        }
        else{
            throw new WrongHeight("Height must be positive");
        }

    }

    public Double volume() {
        return circle.area() * rect.a;
    }
}

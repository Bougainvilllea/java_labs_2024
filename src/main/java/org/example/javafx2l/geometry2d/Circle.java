package org.example.javafx2l.geometry2d;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class Circle extends Figure{
    protected double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void render(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public boolean IsInCoordinates(double x, double y) {
        return round(sqrt(Math.abs((this.radius + this.y) - y)  *  Math.abs((this.radius + this.y) - y)
                + Math.abs((this.radius + this.x) - x)  *  Math.abs((this.radius + this.x) - x))) <= radius;
    }
}

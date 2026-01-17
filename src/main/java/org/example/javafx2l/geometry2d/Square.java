package org.example.javafx2l.geometry2d;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Square extends Figure {
    protected double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public void render(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillRect(x, y, side, side);
    }

    @Override
    public boolean IsInCoordinates(double x, double y) {
        return x >= this.x && x <= this.x + this.side && y >= this.y && y <= this.y + this.side;
    }
}

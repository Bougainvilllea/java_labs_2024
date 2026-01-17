package org.example.javafx2l.geometry2d;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import lombok.*;

import java.util.Random;

@Setter
@Getter
public abstract class Figure {
    protected Color color;
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        Random random = new Random();
        this.color = Color.color(random.nextDouble(1), random.nextDouble(1), random.nextDouble(1));
        this.x = x;
        this.y = y;
    }

    public void replace(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract void render(Canvas canvas);
    public abstract boolean IsInCoordinates(double x, double y);

}

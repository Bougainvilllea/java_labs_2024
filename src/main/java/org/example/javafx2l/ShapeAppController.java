package org.example.javafx2l;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import kotlin.jvm.internal.Intrinsics;
import org.example.javafx2l.geometry2d.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.lang.Math.round;


public class ShapeAppController {

    Random random = new Random();
    ArrayList<Figure> figureObjectsList = new ArrayList<Figure>();
    Figure pickedFigure = null;
    List<Double> cachedCoordinates = new ArrayList<Double>();

    @FXML
    private Canvas canvas;

    @FXML
    private Button circleButton;

    @FXML
    private Button rectangleButton;

    @FXML
    private AnchorPane pane;


    @FXML
    public void initialize() {
        defaultCanvas();
        canvas.setOnMousePressed(this::MousePressed);
        canvas.setOnMouseReleased(this::MouseReleased);
        canvas.setOnMouseDragged(this::MouseDragged);
    }

    @FXML
    void drawCircle(ActionEvent event) {
        List<Double> param = randomParam();

        Circle circle = new Circle(param.get(0), param.get(1), param.get(2));
        figureObjectsList.addFirst(circle);
        circle.render(canvas);
    }

    @FXML
    void drawRect(ActionEvent event) {
        List<Double> param = randomParam();

        Square square = new Square(param.get(0), param.get(1), param.get(2));
        figureObjectsList.addFirst(square);
        square.render(canvas);
    }

    private void MousePressed(MouseEvent event) {
        for(Figure figure : figureObjectsList) {
            if(figure.IsInCoordinates(event.getX(), event.getY()) && pickedFigure == null) {
                if(event.isPrimaryButtonDown()) {

                    pickedFigure = figure;
                    figureObjectsList.remove(figure);
                    figureObjectsList.addFirst(pickedFigure);

                    cachedCoordinates.clear();
                    cachedCoordinates.addAll(List.of(event.getX() - figure.getX(), event.getY() - figure.getY()));
                    reRender();
                    break;
                }

                if(event.isSecondaryButtonDown()) {
                    figure.setColor(Color.color(random.nextDouble(1), random.nextDouble(1), random.nextDouble(1)));
                    reRender();
                    break;
                }
            }
        }
    }

    private void MouseReleased(MouseEvent mouseEvent) {
        if (!mouseEvent.isPrimaryButtonDown()){
            pickedFigure = null;
        }
    }

    private void MouseDragged(MouseEvent mouseEvent) {
        if(pickedFigure != null) {
            pickedFigure.replace(mouseEvent.getX() - cachedCoordinates.getFirst(), mouseEvent.getY() - cachedCoordinates.getLast());
            reRender();
        }
    }


    public List<Double> randomParam(){
        double x = Math.round(random.nextDouble(pane.getWidth()));
        double y =  Math.round(random.nextDouble(pane.getHeight()));
        double radiusOrSide =  Math.round(random.nextDouble(100) + 20);
        return List.of(x, y, radiusOrSide);
    }

    private void reRender(){
        defaultCanvas();
        for(Figure figure : figureObjectsList.reversed()) {
            figure.render(canvas);
        }
    }

    private void defaultCanvas(){
        GraphicsContext gcBackG = canvas.getGraphicsContext2D();
        gcBackG.setFill(Color.color(1, 0.99, 0.79));
        gcBackG.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}

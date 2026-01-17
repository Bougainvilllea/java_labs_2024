package org.example.lab5_javafx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FlagCreator extends Application {

    private ToggleGroup colorGroup1, colorGroup2, colorGroup3;
    private Label resultLabel;

    @Override
    public void start(Stage primaryStage) {
        // Создаем элементы
        resultLabel = new Label("Выберите цвета для флага");

        // Создаем группы для радиокнопок
        colorGroup1 = new ToggleGroup();
        colorGroup2 = new ToggleGroup();
        colorGroup3 = new ToggleGroup();

        // Создаем радиокнопки для цвета 1
        RadioButton red1 = new RadioButton("Красный");
        red1.setToggleGroup(colorGroup1);
        RadioButton green1 = new RadioButton("Зеленый");
        green1.setToggleGroup(colorGroup1);
        RadioButton blue1 = new RadioButton("Синий");
        blue1.setToggleGroup(colorGroup1);

        // Создаем радиокнопки для цвета 2
        RadioButton red2 = new RadioButton("Красный");
        red2.setToggleGroup(colorGroup2);
        RadioButton green2 = new RadioButton("Зеленый");
        green2.setToggleGroup(colorGroup2);
        RadioButton blue2 = new RadioButton("Синий");
        blue2.setToggleGroup(colorGroup2);

        // Создаем радиокнопки для цвета 3
        RadioButton red3 = new RadioButton("Красный");
        red3.setToggleGroup(colorGroup3);
        RadioButton green3 = new RadioButton("Зеленый");
        green3.setToggleGroup(colorGroup3);
        RadioButton blue3 = new RadioButton("Синий");
        blue3.setToggleGroup(colorGroup3);

        // Создаем кнопку "Нарисовать"
        Button drawButton = new Button("Нарисовать");
        drawButton.setOnAction(event -> {
            String color1 = ((RadioButton) colorGroup1.getSelectedToggle()).getText();
            String color2 = ((RadioButton) colorGroup2.getSelectedToggle()).getText();
            String color3 = ((RadioButton) colorGroup3.getSelectedToggle()).getText();
            resultLabel.setText(color1 + ", " + color2 + ", " + color3);
        });

        // Создаем горизонтальные панели для радиокнопок
        HBox colorBox1 = new HBox(10);
        colorBox1.getChildren().addAll(red1, green1, blue1);
        HBox colorBox2 = new HBox(10);
        colorBox2.getChildren().addAll(red2, green2, blue2);
        HBox colorBox3 = new HBox(10);
        colorBox3.getChildren().addAll(red3, green3, blue3);

        // Создаем вертикальную панель для всех элементов
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(resultLabel, colorBox1, colorBox2, colorBox3, drawButton);

        // Создаем сцену и выводим окно
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Текстовый Флаг");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false); // Запрещаем изменение размеров окна
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
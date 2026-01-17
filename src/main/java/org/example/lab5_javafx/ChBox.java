package org.example.lab5_javafx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChBox extends Application {
    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("Label");
        TextField textField = new TextField();
        Button button = new Button("Button");
        label.setVisible(false);
        textField.setVisible(false);
        button.setVisible(false);

        CheckBox labelCheckBox = new CheckBox("Label");
        CheckBox textFieldCheckBox = new CheckBox("TextField");
        CheckBox buttonCheckBox = new CheckBox("Button");

        // Обработчики для чекбоксов
        labelCheckBox.setOnAction(event -> {
            label.setVisible(labelCheckBox.isSelected());
        });
        textFieldCheckBox.setOnAction(event -> {
            textField.setVisible(textFieldCheckBox.isSelected());
        });
        buttonCheckBox.setOnAction(event -> {
            button.setVisible(buttonCheckBox.isSelected());
        });

        HBox labelHBox = new HBox(10, labelCheckBox, label);
        HBox textFieldHBox = new HBox(10, textFieldCheckBox, textField);
        HBox buttonHBox = new HBox(10, buttonCheckBox, button);

        VBox root = new VBox(20, labelHBox, textFieldHBox, buttonHBox);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ChBox");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    //:3
}
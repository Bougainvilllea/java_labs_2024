package org.example.lab5_javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Objects;

public class Word extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        TextField tf1 = new TextField("word");
        TextField tf2 = new TextField();

        Button btn = new Button();
        btn.setText("=>");

        btn.setOnAction(e -> {
            if (Objects.equals(tf1.getText(), "")){
                tf1.setText(tf2.getText());
                tf2.clear();
                btn.setText("=>");

            }
            else {
                tf2.setText(tf1.getText());
                tf1.clear();
                btn.setText("<=");

            }

        });

        HBox mainBox = new HBox(tf1, btn, tf2);
        mainBox.setSpacing(10);

        Scene scene = new Scene(mainBox, 350, 100);
        stage.setScene(scene);
        stage.setTitle("Word");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

package org.example.lab5_javafx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField display;
    private double operand1 = 0;
    private double operand2 = 0;
    private String operator;

    @Override
    public void start(Stage stage) {
        // Создаем элементы
        display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setPrefSize(230, 40);
        display.setLayoutX(20);
        display.setLayoutY(20);


        Button btn0 = new Button("0");
        btn0.setPrefSize(50, 40);
        btn0.setLayoutX(20);
        btn0.setLayoutY(100);

        Button btn1 = new Button("1");
        btn1.setPrefSize(50, 40);
        btn1.setLayoutX(80);
        btn1.setLayoutY(100);

        Button btn2 = new Button("2");
        btn2.setPrefSize(50, 40);
        btn2.setLayoutX(140);
        btn2.setLayoutY(100);

        Button btn3 = new Button("3");
        btn3.setPrefSize(50, 40);
        btn3.setLayoutX(20);
        btn3.setLayoutY(160);

        Button btn4 = new Button("4");
        btn4.setPrefSize(50, 40);
        btn4.setLayoutX(80);
        btn4.setLayoutY(160);

        Button btn5 = new Button("5");
        btn5.setPrefSize(50, 40);
        btn5.setLayoutX(140);
        btn5.setLayoutY(160);

        Button btn6 = new Button("6");
        btn6.setPrefSize(50, 40);
        btn6.setLayoutX(20);
        btn6.setLayoutY(220);

        Button btn7 = new Button("7");
        btn7.setPrefSize(50, 40);
        btn7.setLayoutX(80);
        btn7.setLayoutY(220);

        Button btn8 = new Button("8");
        btn8.setPrefSize(50, 40);
        btn8.setLayoutX(140);
        btn8.setLayoutY(220);

        Button btn9 = new Button("9");
        btn9.setPrefSize(50, 40);
        btn9.setLayoutX(20);
        btn9.setLayoutY(280);

        Button btnDot = new Button(".");
        btnDot.setPrefSize(50, 40);
        btnDot.setLayoutX(80);
        btnDot.setLayoutY(280);

        Button btnPlus = new Button("+");
        btnPlus.setPrefSize(50, 40);
        btnPlus.setLayoutX(200);
        btnPlus.setLayoutY(100);

        Button btnMinus = new Button("-");
        btnMinus.setPrefSize(50, 40);
        btnMinus.setLayoutX(200);
        btnMinus.setLayoutY(160);

        Button btnMultiply = new Button("*");
        btnMultiply.setPrefSize(50, 40);
        btnMultiply.setLayoutX(200);
        btnMultiply.setLayoutY(220);

        Button btnDivide = new Button("/");
        btnDivide.setPrefSize(50, 40);
        btnDivide.setLayoutX(200);
        btnDivide.setLayoutY(280);

        Button btnEquals = new Button("=");
        btnEquals.setPrefSize(50, 40);
        btnEquals.setLayoutX(140);
        btnEquals.setLayoutY(280);

        Button btnClear = new Button("C");
        btnClear.setPrefSize(50, 40);
        btnClear.setLayoutX(20);
        btnClear.setLayoutY(340);

        // Создаем панель
        Pane root = new Pane();
        root.setPadding(new Insets(25, 25, 25, 25));

        // Добавляем элементы на панель
        root.getChildren().addAll(
                display, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot,
                btnPlus, btnMinus, btnMultiply, btnDivide, btnEquals, btnClear);

        // Обработчики событий для кнопок
        btn0.setOnAction(event -> display.appendText("0"));
        btn1.setOnAction(event -> display.appendText("1"));
        btn2.setOnAction(event -> display.appendText("2"));
        btn3.setOnAction(event -> display.appendText("3"));
        btn4.setOnAction(event -> display.appendText("4"));
        btn5.setOnAction(event -> display.appendText("5"));
        btn6.setOnAction(event -> display.appendText("6"));
        btn7.setOnAction(event -> display.appendText("7"));
        btn8.setOnAction(event -> display.appendText("8"));
        btn9.setOnAction(event -> display.appendText("9"));
        btnDot.setOnAction(event -> display.appendText("."));
        btnPlus.setOnAction(event -> {
            btnEquals.setDisable(false);
            operand1 = Double.parseDouble(display.getText());
            operator = "+";
            display.setText("");
        });
        btnMinus.setOnAction(event -> {
            btnEquals.setDisable(false);
            operand1 = Double.parseDouble(display.getText());
            operator = "-";
            display.setText("");
        });
        btnMultiply.setOnAction(event -> {
            btnEquals.setDisable(false);
            operand1 = Double.parseDouble(display.getText());
            operator = "*";
            display.setText("");
        });
        btnDivide.setOnAction(event -> {
            btnEquals.setDisable(false);
            operand1 = Double.parseDouble(display.getText());
            operator = "/";
            display.setText("");
        });
        btnEquals.setOnAction(event -> {
           btnEquals.setDisable(true);
            try{
                operand2 = Double.parseDouble(display.getText());
            }
            catch (NumberFormatException _){
                display.setText("Неверный ввод");
                return;
            }

            double result = 0;
            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        display.setText("Ошибка: деление на 0");
                        return;
                    }
                    result = operand1 / operand2;
                    break;
            }
            display.setText(String.valueOf(result));
        });
        btnClear.setOnAction(event -> {
            btnEquals.setDisable(false);
            display.setText("");
            operand1 = 0;
            operand2 = 0;
            operator = "";
        });


        Scene scene = new Scene(root, 270, 400);
        stage.setTitle("Калькулятор");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
import exceptions.WrongHeight;
import exceptions.WrongRadius;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {
        Button click = new Button();
        click.click();
        click.click();
        click.click();

        Balance result = new Balance();
        result.addRight(2);
        result.addLeft(3);
        result.result();

        Bell sound = new Bell();
        sound.sound();
        sound.sound();
        sound.sound();

        OddEvenSeparator nubers = new OddEvenSeparator();
        nubers.addNumber(3);
        nubers.even();
        nubers.odd();

        Table table = new Table(2, 3);
        table.getValue(1, 1);
        System.out.println(table.getValue(1, 1));
        table.setValue(1, 1, 20050805);
        table.getValue(1, 1);
        System.out.println(table.getValue(1, 1));
        table.cols();
        System.out.println(table.cols());
        table.rows();
        System.out.println(table.rows());

        System.out.println(table.toString());
        System.out.println(table.average());

        Cylinder cylinder = new Cylinder(3, 4);
        cylinder.volume();
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.area());
        System.out.println(circle.area());
        System.out.println(cylinder.volume());

        try {
            Circle circle1 = new Circle(-33333);
        }
        catch (WrongRadius ex){
            System.out.println(ex.getMessage());
        }


        try {
            Cylinder cylinder1 = new Cylinder(3, -4444);
        }
        catch (WrongHeight ex){
            System.out.println(ex.getMessage());
        }


    }
}

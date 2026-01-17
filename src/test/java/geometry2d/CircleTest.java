package geometry2d;

import exceptions.WrongRadius;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        Circle circle = new Circle(2);
        assertEquals(12.56, circle.area());
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2);
        assertEquals("Circle: 2.0", circle.toString());

        assertThrows(WrongRadius.class, ()->new Circle(-3).area());
    }
}
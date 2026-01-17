package geometry3d;

import exceptions.WrongHeight;
import exceptions.WrongRadius;
import geometry2d.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void volume() {
        Cylinder cylinder = new Cylinder(2, 4);
        assertEquals(50.24, cylinder.volume());
        assertThrows(WrongHeight.class, ()->new Cylinder(3,-3).volume());
    }

}
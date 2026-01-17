import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void getValue() {
        Table table = new Table(5,5);
        table.setValue(4, 4, 20050805);
        assertEquals(20050805,table.getValue(4, 4));
    }

    @Test
    void testToString() {
        Table table = new Table(2,2);
        assertEquals("\n" +
                "0; 0; \n" +
                "0; 0; ",table.toString());
    }

    @Test
    void average() {
        Table table = new Table(2,2);
        table.setValue(1, 1, 4);
        assertEquals(1, table.average());
    }
}
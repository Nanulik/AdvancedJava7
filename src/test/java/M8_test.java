import StaticClassesEnumsExceptions.Week;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class M8_test {
    @Test
    public void testPositiveValues() {
        Week daysOfWeek = new Week();
        assertEquals("Sunday", daysOfWeek.getDay(1));
        assertEquals("Monday", daysOfWeek.getDay(2));
        assertEquals("Tuesday", daysOfWeek.getDay(3));
        assertEquals("Wednesday", daysOfWeek.getDay(4));
        assertEquals("Thursday", daysOfWeek.getDay(5));
        assertEquals("Friday", daysOfWeek.getDay(6));
        assertEquals("Saturday", daysOfWeek.getDay(7));
    }

    @Test
    public void testNegativeValues() {
        Week daysOfWeek = new Week();
        assertEquals("The number should be equal or larger than 1", daysOfWeek.getDay(0));
        assertEquals("The number should be equal or smaller than 7", daysOfWeek.getDay(8));
    }

    @Test
    public void testNullValue() {
        Week daysOfWeek = new Week();
        assertThrows(NullPointerException.class, () -> {
            daysOfWeek.getDay(null);
        });
    }
}

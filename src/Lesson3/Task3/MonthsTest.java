package Lesson3.Task3;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MonthsTest {
    @Test
    public void TestMonths(){
        Months month = Months.JANUARY;
        assertEquals("JANUARY - 31 days", month + month.getDaysCount());
        assertEquals(Months.valueOf("FEBRUARY"), month.next());
    }
}
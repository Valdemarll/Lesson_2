package Lesson3.Task2;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test
    public void TestCalculator(){
        Calculator calculator1 = new Calculator(10);
        assertEquals(10, calculator1.getValue());
        Calculator calculator2 = new Calculator(3);
        calculator2.setValue(5);
        assertEquals(5, calculator2.getValue());

        Calculator calc1 = calculator1.add(calculator2);
        Calculator calc2 = calculator1.sub(calculator2);
        Calculator calc3 = calculator1.multiply(calculator2);
        Calculator calc4 = calculator1.div(calculator2);

        assertEquals(15, calc1.getValue());
        assertEquals(5, calc2.getValue());
        assertEquals(50, calc3.getValue());
        assertEquals(2, calc4.getValue());
    }
}
package L1_hw;
import static junit.framework.TestCase.assertEquals;
import  org.junit.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void add_test(){
        assertEquals(7, calc.add(3, 4));
    }
    @Test
    public void sub_test(){
        assertEquals(4, calc.sub(10, 6));
    }
    @Test
    public void multiply_test(){
        assertEquals(32, calc.multiply(8, 4));
    }
    @Test
    public void div_test(){
        assertEquals(5, calc.div(35, 7));
    }
}
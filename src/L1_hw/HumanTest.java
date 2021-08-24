package L1_hw;

import  org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class HumanTest {
    @Test
    public void get_names_test(){
        Human human = new Human();
        human.setFirst_name("Олег");
        assertEquals("Олег", human.getFirst_name());
        human.setFirst_name("Орлов");
        assertEquals("Орлов", human.getLast_name());
        human.setFirst_name("Павлович");
        assertEquals("Павлович", human.getMiddle_name());
    }
    @Test
    public void toString_test(){
        Human human = new Human("Олег", "Орлов", "Павлович");
        assertEquals("Вы Орлов Олег Павлович", human.toString());
    }
}
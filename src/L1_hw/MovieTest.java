package L1_hw;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class MovieTest {
    @Test
    public void test(){
        Movie movie = new Movie("Free Guy", 267, "Зак Пенн");
        assertEquals("Free Guy", movie.getTitle());
        assertEquals(267, movie.getPageCount());
        assertEquals("Зак Пенн", movie.getDirector());

        movie.setTitle("Groundhog Day");
        movie.setDirector("Харольд Ремис");
        movie.setPageCount(361);

        assertEquals("Groundhog Day", movie.getTitle());
        assertEquals(361, movie.getPageCount());
        assertEquals("Харольд Ремис", movie.getDirector());

        assertEquals("Сценарий к фильму 'Groundhog Day' содержит в себе 361 страниц(ы/у). " +
                "Режиссер сценария: Харольд Ремис", movie.toString());
    }
}
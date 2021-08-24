package L1_hw;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class BookTest {
    @Test
    public void test(){
        Book book = new Book("Мастер и Маргарита", 480, 1966, "Булгаков");
        assertEquals("Мастер и Маргарита", book.getTitle());
        assertEquals(480, book.getPageCount());
        assertEquals(1966, book.getYearRelease());
        assertEquals("Булгаков", book.getAuthor());

        book.setTitle("Гарри Поттер и Философский камень");
        book.setAuthor("Джоан Роулинг");
        book.setYearRelease(1997);
        book.setPageCount(432);

        assertEquals("Гарри Поттер и Философский камень", book.getTitle());
        assertEquals(432, book.getPageCount());
        assertEquals(1997, book.getYearRelease());
        assertEquals("Джоан Роулинг", book.getAuthor());

        assertEquals("Книга 'Гарри Поттер и Философский камень' содержит в себе 432 страниц(ы/у). " +
                "Джоан Роулинг выпустил(а) ее в 1997 году.", book.toString());
    }
}
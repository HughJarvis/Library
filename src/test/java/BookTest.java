import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("Shark Drunk", "Morten Stroksnes", "non-fiction");
    }

    @Test
    public void canGetTitle() {
        assertEquals("Shark Drunk", book.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Morten Stroksnes", book.getAuthor());
    }

    @Test
    public void canGetGenre() {
        assertEquals("non-fiction", book.getGenre());
    }
}

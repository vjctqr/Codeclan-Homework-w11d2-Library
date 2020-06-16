import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("Eat and Run", "Scott Jurek", "Running and Jogging");
        book = new Book("Born to Run", "Christopher McDoughall", "Running and Jogging");
        book = new Book("Twenty Chickens For A Saddle", "Robin Scott", "Social Biography");
        book = new Book("Scotland Street", "Alexander McCall Smith", "Humorous Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("Scotland Street", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Alexander McCall Smith", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Humorous Fiction", book.getGenre());
    }



}

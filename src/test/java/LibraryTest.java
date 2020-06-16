import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book eatAndRun;
    Book bornToRun;
    Book twentyChickensForASaddle;
    Book scotlandStreet;

    @Before
    public void before(){
        library = new Library(4);
        book = new Book("New Title", "New Author", "New Genre");
        eatAndRun = new Book("Eat and Run", "Scott Jurek", "Running and Jogging");
        bornToRun = new Book("Born To Run", "Christopher McDoughall", "Running and Jogging");
        twentyChickensForASaddle = new Book("Twenty Chickens For A Saddle", "Robin Scott", "Social Biography");
        scotlandStreet = new Book("Scotland Street", "Alexander McCall Smith", "Humorous Fiction");


    }

    @Test
    public void bookCountStartsAt0(){
        assertEquals(0, library.bookCount());
    }


}

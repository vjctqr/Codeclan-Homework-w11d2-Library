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
        library = new Library("Coolibrary", 4);
    }

    @Test
    public void bookCountStartsAt0(){
        assertEquals(0, library.bookCount());
    }


}

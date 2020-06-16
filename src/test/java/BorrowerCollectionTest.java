import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BorrowerCollectionTest {

    BorrowerCollection borrowerCollection;
    Book book;

    @Before
    public void before(){
        borrowerCollection = new BorrowerCollection("MyCoollection");
        book = new Book("New Title", "New Author", "New Genre");
    }

    @Test
    public void canAddToMyCoollection(){
        borrowerCollection.add(book);
        assertEquals(1, borrowerCollection.myCoollectionSize());
    }




}

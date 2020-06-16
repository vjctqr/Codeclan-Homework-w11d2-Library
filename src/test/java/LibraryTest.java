import org.junit.Before;

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

}

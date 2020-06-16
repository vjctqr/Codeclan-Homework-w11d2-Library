import org.junit.Before;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("Eat and Run", "Scott Jurek", "Running and Jogging");
        book = new Book("Born to Run", "Christopher McDoughall", "Running and Jogging");
        book = new Book("Twenty Chickens For A Saddle", "Robin Scott", "Social Biography");
        book = new Book("44 Scotland Street", "Alexander McCall Smith", "Humorous Fiction");
    }



}

import java.util.ArrayList;

public class Library {

    private int stock;
    private ArrayList<Book> books;

    public Library(int stock){
        this.stock = stock;
        this.books = new ArrayList<Book>();
    }
}

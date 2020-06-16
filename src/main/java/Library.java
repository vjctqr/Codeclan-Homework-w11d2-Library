import java.util.ArrayList;

public class Library {

    private String name;
    private int stock;
    private ArrayList<Book> books;

    public Library(int stock){
        this.name = name;
        this.stock = stock;
        this.books = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public int bookCount(){
        return this.books.size();
    }

}

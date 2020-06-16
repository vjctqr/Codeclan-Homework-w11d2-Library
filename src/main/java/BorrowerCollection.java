import java.util.ArrayList;

public class BorrowerCollection {

    private String name;
    private ArrayList<Book> myCoollection;

    public BorrowerCollection(String name){
        this.name = name;
        this.myCoollection = new ArrayList<Book>();
    }

    public int myCoollectionSize(){
        return this.myCoollection.size();
    }

    public void add(Book book){
        this.myCoollection.add(book);
    }
}

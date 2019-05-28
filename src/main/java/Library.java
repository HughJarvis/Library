import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int getNumberOfBooks() {
        return this.collection.size();
    }

    public void addBookToCollection(Book book){
        if (this.collection.size() < this.capacity) {
            this.collection.add(book);
        }
    }

    public void lendBook(Book book) {
        this.collection.remove(book);
    }
}

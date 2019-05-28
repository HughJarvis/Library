import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int getNumberOfBorrowedBooks() {
        return this.borrowedBooks.size();
    }

    public void addBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void borrowBookFromLibrary(Book book, Library library) {
        this.addBook(book);
        library.lendBook(book);
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book;
    private Library library;


    @Before
    public void setUp(){
        borrower = new Borrower();
        book = new Book("Shark Drunk", "Morten Stroksnes", "non-fiction");
        library = new Library(5);


    }

    @Test
    public void canGetNumberOfBorrowedBooks(){
        assertEquals(0, borrower.getNumberOfBorrowedBooks());
    }

    @Test
    public void canAddToBorrowedBooks(){
        borrower.addBook(book);
        assertEquals(1, borrower.getNumberOfBorrowedBooks());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBookToCollection(book);
        borrower.borrowBookFromLibrary(book, library);
        assertEquals(1, borrower.getNumberOfBorrowedBooks());
        assertEquals(0, library.getNumberOfBooks());

    }










}

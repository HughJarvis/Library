import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void setUp() {
        library = new Library(5);
        book = new Book("Shark Drunk", "Morten Stroksnes", "non-fiction");
        book1 = new Book("Catch 22", "Joseph Heller", "fiction");
        book2 = new Book("Mog the Forgetful Cat", "Judith Kerr", "childrens");
        book3 = new Book("Eleanor Oliphant is Completely Fine", "Gail Honeyman", "fiction");
        book4 = new Book("Eleanor Oliphant is Completely Fine", "Gail Honeyman", "fiction");
        book5 = new Book("Eleanor Oliphant is Completely Fine", "Gail Honeyman", "fiction");


        library.addBookToCollection(book);
        library.addBookToCollection(book1);
        library.addBookToCollection(book2);
        library.addBookToCollection(book3);
    }

    @Test
    public void canGetNumberOfBooks(){
        assertEquals(4, library.getNumberOfBooks());
    }

    @Test
    public void canAddBookToCollectionIfRoom(){
        library.addBookToCollection(book4);
        assertEquals(5, library.getNumberOfBooks());
    }

    @Test
    public void cannotAddBookToCollectionIfFull(){
        library.addBookToCollection(book4);
        library.addBookToCollection(book5);
        assertEquals(5, library.getNumberOfBooks());
    }

    @Test
    public void canLendBook(){
        library.lendBook(book2);
        assertEquals(3, library.getNumberOfBooks());
    }
}

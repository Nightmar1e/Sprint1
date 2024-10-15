package TascaS104Testing.Exercise1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;


class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testListNotNull() {
        assertNotNull(library.getBooks(), "Book list should not be null");
    }

    @Test
    public void testAddBooks() {
        library.addBook("Inception");
        library.addBook("The Failed");
        assertEquals(2, library.getSize(), "Library should contain 2 books");
    }

    @Test
    public void testGetBookByPosition() {
        library.addBook("Inception");
        library.addBook("The Failed");
        assertEquals("Inception", library.getBook(0), "First book should be Inception");
        assertEquals("The Failed", library.getBook(1), "Second book should be The Failed");
    }

    @Test
    public void testNoDuplicateBooks() {
        library.addBook("Inception");
        library.addBook("Inception");
        assertEquals(1, library.getSize(), "There should be no duplicate book titles");
    }

    @Test
    public void testAddBookAtPosition() {
        library.addBook("Inception");
        library.addBook("The Failed");
        library.addBookAtPosition(1, "Man U");
        assertEquals(3, library.getSize(), "Library should contain 3 books");
        assertEquals("Man U", library.getBook(1), "Book at position 1 should be Man U");
    }

    @Test
    public void testRemoveBook() {
        library.addBook("Inception");
        library.addBook("The Failed");
        library.removeBook("The Failed");
        assertEquals(1, library.getSize(), "Library should contain 1 book after removal");
        assertFalse(library.containsBook("The Failed"), "The Failed should be removed from the library");
    }

    @Test
    public void testListRemainsSorted() {
        library.addBook("The Failed");
        library.addBook("Inception");
        library.addBook("Man U");
        List<String> books = library.getBooks();
        assertEquals("Inception", books.get(0), "First book should be Inception");
        assertEquals("Man U", books.get(1), "Second book should be Man U");
        assertEquals("The Failed", books.get(2), "Third book should be The Failed");

        library.removeBook("Man U");
        books = library.getBooks();
        assertEquals("Inception", books.get(0), "First book should still be Inception");
        assertEquals("The Failed", books.get(1), "Second book should be The Failed after removal");
    }
}

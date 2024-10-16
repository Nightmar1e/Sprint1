package TascaS104Testing.Lvl1.Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books);
        }
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public String getBook(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        }
        throw new IndexOutOfBoundsException("Invalid position");
    }

    public void addBookAtPosition(int position, String title) {
        if (!books.contains(title)) {
            books.add(position, title);
            Collections.sort(books);
        }
    }

    public void removeBook(String title) {
        books.remove(title);
    }

    public int getSize() {
        return books.size();
    }

    public boolean containsBook(String title) {
        return books.contains(title);
    }
}

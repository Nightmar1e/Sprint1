package TascaS104Testing.JUnit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//public class Book {
//    private String title;
//    private String author;
//    private int year;
//
//    public Book(String title, String author, int year) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getYear() {
//        return year;
//    }
//}



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

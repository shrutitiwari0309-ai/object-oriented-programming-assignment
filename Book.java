import java.util.ArrayList;

// Book class
class Book {
    String title;
    String author;
    String isbn;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

// Library class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Method to add a book
    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    // Method to remove a book by ISBN
    void removeBook(String isbn) {
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isbn.equals(isbn)) {
                System.out.println("Book removed: " + books.get(i).title);
                books.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Method to display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("Library Books:");
        for (Book book : books) {
            book.display();
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create Book objects
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "101");
        Book b2 = new Book("1984", "George Orwell", "102");
        Book b3 = new Book("Clean Code", "Robert C. Martin", "103");

        // Add books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println();

        // Display all books
        library.displayBooks();

        System.out.println();

        // Remove a book
        library.removeBook("102");

        System.out.println();

        // Display again
        library.displayBooks();
    }
}

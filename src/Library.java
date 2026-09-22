import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        LibraryCatalog.addSampleBooks(books);
    }

    public void displayBooks() {
        LibraryCatalog.displayBooks(books);
    }

    public void searchBooks(String keyword) {
        LibrarySearch.searchBooks(books, keyword);
    }

    public boolean borrowBook(int bookId) {
        return LibraryBorrowReturn.borrowBook(books, bookId);
    }

    public boolean returnBook(int bookId) {
        return LibraryBorrowReturn.returnBook(books, bookId);
    }

    public Book findBookById(int bookId) {
        return LibraryBorrowReturn.findBookById(books, bookId);
    }

    public int getBookCount() {
        return LibraryCatalog.getBookCount(books);
    }
}

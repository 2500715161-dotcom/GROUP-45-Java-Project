import java.util.ArrayList;

public class LibraryBorrowReturn {
    public static boolean borrowBook(ArrayList<Book> books, int bookId) {
        Book book = findBookById(books, bookId);

        if (book == null) {
            System.out.println("Book ID not found.");
            return false;
        }

        if (!book.isAvailable()) {
            System.out.println("This book is already borrowed.");
            return false;
        }

        book.setAvailable(false);
        System.out.println("Book borrowed successfully: " + book.getTitle());
        return true;
    }

    public static boolean returnBook(ArrayList<Book> books, int bookId) {
        Book book = findBookById(books, bookId);

        if (book == null) {
            System.out.println("Book ID not found.");
            return false;
        }

        if (book.isAvailable()) {
            System.out.println("This book is already available in the library.");
            return false;
        }

        book.setAvailable(true);
        System.out.println("Book returned successfully: " + book.getTitle());
        return true;
    }

    public static Book findBookById(ArrayList<Book> books, int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }
}

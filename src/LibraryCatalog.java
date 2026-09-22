import java.util.ArrayList;

public class LibraryCatalog {
    public static void addSampleBooks(ArrayList<Book> books) {
        books.add(new Book(101, "Java Programming", "James Gosling"));
        books.add(new Book(102, "Clean Code", "Robert C. Martin"));
        books.add(new Book(103, "Head First Java", "Kathy Sierra"));
        books.add(new Book(104, "Algorithms", "Sedgewick"));
        books.add(new Book(105, "Data Structures", "Mark Allen Weiss"));
        books.add(new Book(106, "The Pragmatic Programmer", "Andrew Hunt"));
    }

    public static void displayBooks(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\nLibrary Catalog");
        System.out.println("ID   Title                    Author                 Status");
        System.out.println("----------------------------------------------------------");

        for (Book book : books) {
            String status = book.isAvailable() ? "Available" : "Borrowed";
            System.out.printf("%-4d %-24s %-20s %-10s%n",
                    book.getId(),
                    book.getTitle(),
                    book.getAuthor(),
                    status);
        }
    }

    public static int getBookCount(ArrayList<Book> books) {
        return books.size();
    }
}

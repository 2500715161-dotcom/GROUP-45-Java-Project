import java.util.ArrayList;

public class LibrarySearch {
    public static void searchBooks(ArrayList<Book> books, String keyword) {
        boolean found = false;
        String normalizedKeyword = keyword.trim().toLowerCase();

        if (normalizedKeyword.isEmpty()) {
            System.out.println("Search keyword cannot be empty.");
            return;
        }

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(normalizedKeyword)
                    || book.getAuthor().toLowerCase().contains(normalizedKeyword)) {
                System.out.println("ID: " + book.getId()
                        + " | Title: " + book.getTitle()
                        + " | Author: " + book.getAuthor()
                        + " | Status: " + book.getAvailabilityStatus());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching books found for: " + keyword);
        }
    }
}

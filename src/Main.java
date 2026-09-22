import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();

        System.out.println("Welcome to the Library Management System");
        System.out.println("Total books available: " + library.getBookCount());

        int choice;

        do {
            printMenu();
            choice = readValidInt(input, "Enter your choice: ");

            switch (choice) {
          1      case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter book title or author to search: ");
                    String keyword = input.nextLine();
                    library.searchBooks(keyword);
                    break;
                case 3:
                    int borrowId = readValidInt(input, "Enter book ID to borrow: ");
                    library.borrowBook(borrowId);
                    break;
                case 4:
                    int returnId = readValidInt(input, "Enter book ID to return: ");
                    library.returnBook(returnId);
                    break;
                case 5:
                    System.out.println("Goodbye! Thank you for using the library system.");
                    break;
                default:
                    System.out.println("Invalid option selected. Please try again.");
                    break;
            }

            if (choice != 5) {
                System.out.println("\nPress Enter to continue...");
                input.nextLine();
            }

        } while (choice != 5);

        input.close();
    }

    private static void printMenu() {
        System.out.println("\nLibrary Menu");
        System.out.println("1. View all books");
        System.out.println("2. Search for a book");
        System.out.println("3. Borrow a book");
        System.out.println("4. Return a book");
        System.out.println("5. Exit");
    }

    private static int readValidInt(Scanner input, String prompt) {
        int value = -1;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print(prompt);
                value = input.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                input.nextLine();
            }
        }

        input.nextLine();
        return value;
    }
}

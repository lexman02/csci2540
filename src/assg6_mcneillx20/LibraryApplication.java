/*
 * @author Xavier McNeill
 * An application to manage books in a library
 */
package assg6_mcneillx20;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApplication {
    public static void main(String[] args) {
        String filename = "assg6_catalog.txt";
        String title, author, publisher;
        int choice, isbn, yearPublished;
        boolean updateFile = false;
        BookCatalog bookList = new BookCatalog();
        Scanner kbd = new Scanner(System.in);

        bookList.loadData(filename);

        do {
            System.out.println();
            System.out.println("1. Display all the books in the catalog");
            System.out.println("2. Search for a book");
            System.out.println("3. Add a new book");
            System.out.println("4. Update an existing book");
            System.out.println("5. Remove a book");
            System.out.println("6. Display books by a publisher");
            System.out.println("7. Sort all the books based on title");
            System.out.println("8. Save data");
            System.out.println("9. Exit\n");
            System.out.print("Enter your choice: ");

            choice = kbd.nextInt();
            kbd.nextLine();

            switch (choice) {
                case 1:
                    bookList.displayCatalog();
                    break;
                case 2:
                    System.out.println("Enter the title of the book:");
                    title = kbd.nextLine();
                    Book tempBook = bookList.searchForBook(title);

                    if (tempBook != null) {
                        System.out.println("\n" + tempBook + "\n");
                    } else {
                        System.out.println("\"" + title + "\" not found");
                    }

                    break;
                case 3:
                    System.out.println("Enter the ISBN of the book:");
                    isbn = Integer.parseInt(kbd.nextLine());

                    System.out.println("Enter the title of the book:");
                    title = kbd.nextLine();

                    System.out.println("Enter the author of the book:");
                    author = kbd.nextLine();

                    System.out.println("Enter the publisher of the book:");
                    publisher = kbd.nextLine();

                    System.out.println("Enter the year the book was published:");
                    yearPublished = Integer.parseInt(kbd.next());

                    if (bookList.addBook(isbn, title, author, publisher, yearPublished)) {
                        updateFile = true;
                    }
                    break;
                case 4:
                    System.out.println("Enter the title of the book:");
                    title = kbd.nextLine();
                    tempBook = bookList.searchForBook(title);

                    if (tempBook != null) {
                        updateMenu(tempBook, kbd);
                        updateFile = bookList.updateBook(tempBook.getIsbn(), tempBook.getTitle(), tempBook.getAuthor(),
                                tempBook.getPublisher(), tempBook.getYearPublished());
                    } else {
                        System.out.println("\n\"" + title + "\" does not exist");
                    }
                    break;
                case 5:
                    System.out.println("Enter the title of the book:");
                    title = kbd.nextLine();

                    updateFile = bookList.removeBook(title);
                    break;
                case 6:
                    System.out.println("Enter the publisher of the book:");
                    publisher = kbd.nextLine();
                    ArrayList<Book> booksByPublisher = bookList.getBooksByPublisher(publisher);

                    if (booksByPublisher.size() > 0) {
                        System.out.println("\nBooks by " + publisher + ":");
                        for (Book b : booksByPublisher) {
                            System.out.println(b);
                        }
                    } else {
                        System.out.println("\n\"" + publisher + "\" has no books");
                    }
                    break;
                case 7:
                    updateFile = true;
                    bookList.sortByTitle();
                    break;
                case 8:
                    bookList.Save();
                    break;
            }
        } while (choice != 9);

        kbd.close();

        if (updateFile) {
            bookList.Save();
        }
    }

    /*
     * Displays the update menu and updates the given book
     * @param book The book to update
     * @param kbd The scanner object from the main function
     */
    public static void updateMenu(Book book, Scanner kbd) {
        int choice;

        do {
            System.out.println();
            System.out.println("1. Update ISBN");
            System.out.println("2. Update author");
            System.out.println("3. Update publisher");
            System.out.println("4. Update published year");
            System.out.println("0. Return to main menu\n");
            System.out.print("Enter your choice: ");

            choice = kbd.nextInt();
            kbd.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the new ISBN:");
                    book.setIsbn(Integer.parseInt(kbd.nextLine()));
                    break;
                case 2:
                    System.out.println("Enter the new author:");
                    book.setAuthor(kbd.nextLine());
                    break;
                case 3:
                    System.out.println("Enter the new publisher:");
                    book.setPublisher(kbd.nextLine());
                    break;
                case 4:
                    System.out.println("Enter the new published year:");
                    book.setYearPublished(Integer.parseInt(kbd.next()));
                    break;
            }
        } while (choice != 0);
    }
}

/*
* @author Xavier McNeill
* Manages the data in the bookList ArrayList
*/
package assg6_mcneillx20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class BookCatalog implements BookCatalogInterface {
    ArrayList<Book> bookList = new ArrayList<>();
    Scanner kbd = new Scanner(System.in);
    String filename;

    /*
     * Checks if the given book object already exists in the bookList ArrayList
     * @param title The title of the book to be searched for
     * @return True if the book is found, false otherwise
     */
    private boolean bookExists(String title) {
        if (searchForBook(title) != null) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Loads the data from the given file into the bookList ArrayList
     * @param filename The name of the file to be read
     */
    @Override
    public void loadData(String filename) {
        Scanner inputStream = null;
        this.filename = filename;

        try {
            inputStream = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening \"" + filename + "\"");
        }

        while (inputStream.hasNextLine()) {
            int isbn = Integer.parseInt(inputStream.nextLine());
            String title = inputStream.nextLine();
            String author = inputStream.nextLine();
            String publisher = inputStream.nextLine();
            int yearPublished = Integer.parseInt(inputStream.nextLine());

            if (inputStream.hasNextLine()) {
                inputStream.nextLine();
            }

            bookList.add(new Book(isbn, title, author, publisher, yearPublished));
        }
    }

    /*
     * Displays all the books in the bookList ArrayList and waits for enter
     */
    @Override
    public void displayCatalog() {
        for (Book b : bookList) {
            System.out.println(b + "\n");
        }
        System.out.print("Press enter to continue...");
        kbd.nextLine();
    }

    /*
     * Searches for a book in the bookList ArrayList
     * @param title The title of the book to be searched for
     */
    @Override
    public Book searchForBook(String title) {
        ListIterator<Book> iter = bookList.listIterator();
        while (iter.hasNext()) {
            Book temp = iter.next();
            if (temp.getTitle().equals(title)) {
                return temp;
            }
        }
        return null;
    }

    /*
     * Adds a new book to the bookList ArrayList
     * @param isbn The ISBN of the book to be added
     * @param title The title of the book to be added
     * @param author The author of the book to be added
     * @param publisher The publisher of the book to be added
     * @param yearPublished The year the book was published
     * @return True if the book was added, false otherwise
     */
    @Override
    public boolean addBook(int isbn, String title, String author, String publisher, int yearPublished) {
        if (!bookExists(title)) {
            bookList.add(new Book(isbn, title, author, publisher, yearPublished));
            return true;
        } else {
            System.out.println("\n\"" + title + "\" already exists");
            return false;
        }
    }

    /*
     * Updates a book in the bookList ArrayList
     * @param isbn The ISBN of the book to be updated
     * @param title The title of the book to be updated
     * @param author The author of the book to be updated
     * @param publisher The publisher of the book to be updated
     * @param yearPublished The year the book was published
     * @return True if the book was updated, false otherwise
     */
    @Override
    public boolean updateBook(int isbn, String title, String author, String publisher, int yearPublished) {
        Book newBook = new Book(isbn, title, author, publisher, yearPublished);
        if (bookExists(title)) {
            bookList.set(bookList.indexOf(searchForBook(title)), newBook);
            return true;
        } else {
            return false;
        }
    }

    /*
     * Removes a book from the bookList ArrayList
     * @param title The title of the book to be removed
     * @return True if the book was removed, false otherwise
     */
    @Override
    public boolean removeBook(String title) {
        if (bookExists(title)) {
            bookList.remove(bookList.indexOf(searchForBook(title)));
            return true;
        } else {
            System.out.println("\n\"" + title + "\" does not exist");
        }
        return false;
    }

    /*
     * Searches for books by a publisher in the bookList ArrayList
     * @param publisher The publisher to be searched for
     * @return An ArrayList of books published by the given publisher
     */
    @Override
    public ArrayList<Book> getBooksByPublisher(String publisher) {
        ArrayList<Book> booksByPublisher = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getPublisher().equals(publisher)) {
                booksByPublisher.add(b);
            }
        }
        return booksByPublisher;
    }

    /*
     * Sorts the bookList ArrayList by title
     */
    @Override
    public void sortByTitle() {
        Collections.sort(bookList);
    }

    /*
     * Save the bookList ArrayList to the file specified in the loadData method
     */
    @Override
    public void Save() {
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(filename);
        } catch (IOException e) {
            System.out.println("Error opening \"" + filename + "\"");
        }

        for (Book b : bookList) {
            outputStream.println(b.getIsbn());
            outputStream.println(b.getTitle());
            outputStream.println(b.getAuthor());
            outputStream.println(b.getPublisher());
            outputStream.println(b.getYearPublished());
            outputStream.println();
        }

        outputStream.close();
    }
}

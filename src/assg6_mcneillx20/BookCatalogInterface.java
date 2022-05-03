/*
 * @author Xavier McNeill
 * This interface manages functionality of a book catalog system
 */
package assg6_mcneillx20;

import java.util.ArrayList;

public interface BookCatalogInterface {
    /*
     * Reads the book data from a file and loads it into an ArrayList
     * @param filename The name of the file to be read
     */
    public void loadData(String filename);

    /*
     * Displays the formatted book data from the ArrayList
     */
    public void displayCatalog();

    /*
     * Searches for a book in the ArrayList by title and displays the formatted book data
     * @param title The title of the book to be searched for
     * @return The book object if found, null otherwise
     */
    public Book searchForBook(String title);

    /*
     * Adds a new book object to the ArrayList if it doesn't already exist
     * @param isbn The ISBN of the book to be added
     * @param title The title of the book to be added
     * @param author The author of the book to be added
     * @param publisher The publisher of the book to be added
     * @param yearPublished The year the book to be added was published
     * @return True if the book was added, otherwise return false
     */
    public boolean addBook(int isbn, String title, String author, String publisher, int yearPublished);

    /*
     * Updates an existing book object in the ArrayList if it exists
     * @param isbn The ISBN of the book to be updated
     * @param title The title of the book to be updated
     * @param author The author of the book to be updated
     * @param publisher The publisher of the book to be updated
     * @param yearPublished The year the book to be updated was published
     * @return True if the book was updated, otherwise return false
     */
    public boolean updateBook(int isbn, String title, String author, String publisher, int yearPublished);

    /*
     * Removes a book object from the ArrayList if it exists
     * @param title The title of the book to be removed
     * @return True if the book was removed, otherwise return false
     */
    public boolean removeBook(String title);

    /*
     * Searches for all books in the ArrayList by a publisher and displays the formatted book data
     * @param publisher The publisher to search for
     * @return An ArrayList of book objects if found, otherwise return null
     */
    public ArrayList<Book> getBooksByPublisher(String publisher);

    /*
     * Sorts the ArrayList by title
     */
    public void sortByTitle();

    /*
     * Saves the current state of the ArrayList to the file it was loaded from
     */
    public void Save();
}

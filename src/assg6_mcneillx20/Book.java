/*
 * @author Xavier McNeill
 * A class for book objects
 */
package assg6_mcneillx20;

public class Book implements Comparable<Book> {
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;

    /*
     * Default 5 parameter constructor
     */
    public Book(int isbn, String title, String author, String publisher, int yearPublished) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    /*
     * Get the ISBN of the book
     * @return ISBN of the book
     */
    public int getIsbn() {
        return isbn;
    }

    /*
     * Get the title of the book
     * @return Title of the book
     */
    public String getTitle() {
        return title;
    }

    /*
     * Get the author of the book
     * @return Author of the book
     */
    public String getAuthor() {
        return author;
    }

    /*
     * Get the publisher of the book
     * @return Publisher of the book
     */
    public String getPublisher() {
        return publisher;
    }

    /*
     * Get the year the book was published
     * @return Year the book was published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /*
     * Set the ISBN of the book
     * @param newIsbn ISBN of the book
     */
    public void setIsbn(int newIsbn) {
        isbn = newIsbn;
    }

    /*
     * Set the author of the book
     * @param newAuthor Author of the book
     */
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    /*
     * Set the publisher of the book
     * @param newPublisher Publisher of the book
     */
    public void setPublisher(String newPublisher) {
        publisher = newPublisher;
    }

    /*
     * Set the year the book was published
     * @param newYearPublished Year the book was published
     */
    public void setYearPublished(int newYearPublished) {
        yearPublished = newYearPublished;
    }

    /*
     * Return formatted string of book information
     * @return Formatted string of book information
     */
    @Override
    public String toString() {
        return "ISBN: " + isbn + "\nTitle: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher
                + "\nYear published: " + yearPublished;
    }

    /*
     * Compare this book with another book
     * @param obj The object to compare
     * @return true if this book and the other object are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book x = (Book) obj;
            return (title == x.title);
        }

        return false;
    }

    /*
     * Compare this book title to another book title
     * @param book The book to compare to
     * @return 1 if this book is alphabetically after the other book, 0 if they are equal, and -1 if this book is alphabetically before the other book,
     */
    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.title);
    }
}

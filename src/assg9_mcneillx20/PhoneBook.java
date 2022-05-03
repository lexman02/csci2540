/*
 * @author Xavier McNeill
 * Manages the phone book binary search tree
 */
package assg9_mcneillx20;

import java.io.*;
import java.util.*;

public class PhoneBook {
    BinarySearchTree<Person, String> tree = new BinarySearchTree<Person, String>();
    TreeIterator<Person> iter = new TreeIterator<Person>(tree);
    String filename = "assg9_phoneBook.txt";

    /*
     * Loads the data from the given file and inserts it into the phone book binary search tree
     */
    public void loadData() {
        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("\"" + filename + "\" not found.");
        }

        while (inputStream.hasNext()) {
            String name = inputStream.next() + " " + inputStream.next();
            String number = inputStream.next();
            Person person = new Person(name, number);
            tree.insert(person);
        }
    }

    /*
     * Adds a new person into the phone book binary search tree
     * @param name The first and last name of the person to add
     * @param number The phone number of the person to add
     * @return True if the person was added, false otherwise
     */
    public boolean addContact(String name, String number) {
        System.out.println();
        if (searchForContact(name) == null) {
            tree.insert(new Person(name, number));
            System.out.println("\"" + name + "\" added to the phone book");
            return true;
        } else {
            System.out.println("\"" + name + "\" already exists in the phone book");
            return false;
        }
    }

    /*
     * Deletes a person from the phone book binary search tree
     * @param name The first and last name of the person to delete
     * @return True if the person was deleted, false otherwise
     */
    public boolean deleteContact(String name) {
        System.out.println();
        if (searchForContact(name) != null) {
            tree.delete(name);
            System.out.println("\"" + name + "\" deleted from the phone book");
            return true;
        } else {
            System.out.println("\"" + name + "\" not found in the phone book");
            return false;
        }
    }

    /*
     * Searches for a person in the phone book binary search tree using the given name
     * @param name The first and last name of the person to search for
     * @return The person object if found, null otherwise
     */
    public Person searchForContact(String name) {
        Person person = tree.retrieve(name);

        if (person != null) {
            return person;
        } else {
            return null;
        }
    }

    /*
     * Updates a person in the phone book binary search tree using the given name
     * @param name The first and last name of the person to update
     * @param number The new phone number of the person to update
     * @return True if the person was updated, false otherwise
     */
    public boolean updateContact(String name, String number) {
        System.out.println();
        if (searchForContact(name) != null) {
            tree.delete(name);
            tree.insert(new Person(name, number));
            System.out.println("\"" + name + "\" updated in the phone book");
            return true;
        } else {
            System.out.println("\"" + name + "\" not found in the phone book");
            return false;
        }
    }

    /*
     * Prints the phone book binary search tree in alphabetical order by name
     */
    public void displayContacts() {
        iter.setInorder();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    /*
     * Saves the phone book binary search tree to the given file
     */
    public void saveData() {
        PrintWriter outputStream = null;
        iter.setInorder();

        try {
            outputStream = new PrintWriter(filename);
        } catch (IOException e) {
            System.out.println("\"" + filename + "\" not found.");
        }

        while (iter.hasNext()) {
            Person person = iter.next();
            outputStream.println(person.getKey() + "    " + person.number);
        }

        outputStream.close();
    }
}

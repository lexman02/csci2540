/*
 * @author Xavier Mcneill
 * A class for StudentAccount with an account number and balance
 */
package assg3_mcneillx20;

public class StudentAccount implements Comparable<StudentAccount> {
    private long acctNo;
    private double balance;
    public static int acctCounter = 0;

    /*
     * Default constructor
     */
    public StudentAccount() {
        acctNo = ++acctCounter;
        balance = 0.00;
    }

    /*
     * Constructor with a given account balance
     * @param initialBalance The given account balance
     */
    public StudentAccount(double initialBalance) {
        acctNo = ++acctCounter;
        balance = initialBalance;
    }

    /*
     * Return the account number
     * @return The account number
     */
    public long getAcctNo() {
        return acctNo;
    }

    /*
     * Return the account balance
     * @return The account balance
     */
    public double getBalance() {
        return balance;
    }

    /*
     * Return the number of accounts
     * @return The number of accounts
     */
    public static int getAcctCounter() {
        return acctCounter;
    }

    /*
     * Modify the account balance
     * @param newBalance The new account balance
     */
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    /*
     * Add a given amount greater than 0 to the account balance
     * @param amount The given amount
     */
    public void deposit(double amount) {
        if (amount > 0.00) {
            balance += amount;
        } else {
            System.err.println("Deposit amount must be positive.");
        }
    }

    /*
     * Subtract a given amount greater than 0 from the account balance
     * @param amount The given amount
     */
    public void charge(double amount) {
        if (amount > 0.00) {
            balance -= amount;
        } else {
            System.err.println("Charge amount must be positive.");
        }
    }

    /*
     * Transfer a given amount greater than 0 from another account balance to this
     * account balance
     * @param transferer The account to transfer from
     * @param amount The given amount
     */
    public void transferIn(StudentAccount transferer, double amount) {
        if (amount > 0.00) {
            balance += amount;
            transferer.balance -= amount;
        } else {
            System.err.println("Transfer amount must be positive.");
        }
    }

    /*
     * Transfer a given amount greater than 0 from this account balance to another
     * account balance
     * @param transferee The account to transfer to
     * @param amount The given amount
     */
    public void transferOut(StudentAccount transferee, double amount) {
        if (amount > 0.00) {
            balance -= amount;
            transferee.balance += amount;
        } else {
            System.err.println("Transfer amount must be positive.");
        }
    }

    /*
     * Prints account information to screen
     */
    public void printInfo() {
        System.out.println(this);
    }

    /*
     * Return formatted account information as a string
     * @return Formatted account information as a string
     */
    @Override
    public String toString() {
        return "Account number: " + acctNo + "\nBalance: $" + String.format("%.2f", balance);
    }

    /*
     * Compare this account balance to another account balance
     * @param account The account to compare to
     * @return 1 if this account balance is greater than the given account balance, 0 if this account balance is equal to the given account balance, and -1 if this account balance is less than the given account balance
     */
    @Override
    public int compareTo(StudentAccount account) {
        if (balance > account.balance) {
            return 1;
        } else if (balance == account.balance) {
            return 0;
        } else {
            return -1;
        }
    }
}

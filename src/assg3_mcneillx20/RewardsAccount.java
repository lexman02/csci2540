/*
 * @author Xavier McNeill
 * A class for RewardsAccount that extends the StudentAccount class and adds a rewards balance
 */
package assg3_mcneillx20;

public class RewardsAccount extends StudentAccount {
    private double rewardsBalance;

    /*
     * Default constructor
     */
    public RewardsAccount() {
        super();
        rewardsBalance = 0;
    }

    /*
     * Constructor with a given account balance that increases the rewards balance by 5.00 if amount is $100.00 or more
     * @param initialBalance The given account balance
     */
    public RewardsAccount(double initialBalance) {
        super(initialBalance);
        if (initialBalance >= 100.00) {
            rewardsBalance = 5.00;
        }
    }

    /*
     * Retrieve the rewards balance
     * @return The rewards balance
     */
    public double getRewards() {
        return rewardsBalance;
    }

    /*
     * Add rewards balance to account balance and reset rewards balance to 0
     */
    public void redeemRewards() {
        if (rewardsBalance >= 25.00) {
            setBalance(getBalance() + rewardsBalance);
            rewardsBalance = 0.00;
        } else {
            System.out.println("Rewards balance is insufficient! You must have $25 or more to redeem rewards.");
        }
    }

    /*
     * Return formatted rewards account information as a string
     * @return Formatted rewards account information as a string
     */
    @Override
    public String toString() {
        return super.toString() + "\nRewards balance: $" + String.format("%.2f", rewardsBalance);

    }

    /*
     * Increase rewards balance by 5.00 if deposit amount is greater than or equal to 100.00
     * @param amount The amount to deposit
     */
    @Override
    public void deposit(double amount) {
        if (amount >= 100.00) {
            rewardsBalance += 5.00;
        }
        super.deposit(amount);
    }

    /*
     * Prints rewards account information to screen
     */
    @Override
    public void printInfo() {
        System.out.println(this.toString());
    }
}

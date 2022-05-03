/*
 * @author Xavier McNeill
 * A class that tests the StudentAccount and RewardsAccount class
 */
package assg3_mcneillx20;

public class StudentAccountDemo {

	public static void main(String[] args) {
		StudentAccount acct1 = new StudentAccount();
		StudentAccount acct2 = new StudentAccount(12.50);
		StudentAccount acct3 = new RewardsAccount(100.00);

		// Test getAcctNo()
		System.out.println("Account numbers: \nAccount 1 - " + acct1.getAcctNo() + "\nAccount 2 - " + acct2.getAcctNo()
				+ "\nAccount 3 - " + acct3.getAcctNo());

		// Test getBalance()
		System.out.println(
				"\nAccount balances: \nAccount 1 - $" + String.format("%.2f", acct1.getBalance()) + "\nAccount 2 - $"
						+ String.format("%.2f", acct2.getBalance()) + "\nAccount 3 - $"
						+ String.format("%.2f", acct3.getBalance()));

		// Test getAcctCounter()
		System.out.println("\nNumber of accounts: " + StudentAccount.getAcctCounter());

		// Test setBalanc()
		System.out.println("\nAccount 1 balance before: $" + String.format("%.2f", acct1.getBalance()));
		acct1.setBalance(100.00);
		System.out.println("Account 1 balance after: $" + String.format("%.2f", acct1.getBalance()));

		System.out.println("\nAccount 2 balance before: $" + String.format("%.2f", acct2.getBalance()));
		acct2.setBalance(200.37);
		System.out.println("Account 2 balance after: $" + String.format("%.2f", acct2.getBalance()));

		System.out.println("\nAccount 3 balance before: $" + String.format("%.2f", acct3.getBalance()));
		acct3.setBalance(-15.30);
		System.out.println("Account 3 balance after: $" + String.format("%.2f", acct3.getBalance()));
		System.out.println();

		// Test deposit()
		System.out.println("\nAccount 1 balance before deposit: $" + String.format("%.2f", acct1.getBalance()));
		acct1.deposit(-100.00);
		System.out.println("Account 1 balance after deposit: $" + String.format("%.2f", acct1.getBalance()));

		System.out.println("\nAccount 2 balance before deposit: $" + String.format("%.2f", acct2.getBalance()));
		acct2.deposit(.63);
		System.out.println("Account 2 balance after deposit: $" + String.format("%.2f", acct2.getBalance()));

		System.out.println("\nAccount 3 balance before deposit: $" + String.format("%.2f", acct3.getBalance()));
		acct3.deposit(15.30);
		System.out.println("Account 3 balance after deposit: $" + String.format("%.2f", acct3.getBalance()));
		System.out.println();

		// Test charge()
		System.out.println("\nAccount 1 balance before charge: $" + String.format("%.2f", acct1.getBalance()));
		acct1.charge(100.00);
		System.out.println("Account 1 balance after charge: $" + String.format("%.2f", acct1.getBalance()));

		System.out.println("\nAccount 2 balance before charge: $" + String.format("%.2f", acct2.getBalance()));
		acct2.charge(1);
		System.out.println("Account 2 balance after charge: $" + String.format("%.2f", acct2.getBalance()));

		System.out.println("\nAccount 3 balance before charge: $" + String.format("%.2f", acct3.getBalance()));
		acct3.charge(-15.30);
		System.out.println("Account 3 balance after charge: $" + String.format("%.2f", acct3.getBalance()));

		// Test transferIn()
		System.out.println("\nAccount balances before incoming transfer: \nAccount 1 - $"
				+ String.format("%.2f", acct1.getBalance())
				+ "\nAccount 2 - $" + String.format("%.2f", acct2.getBalance()) + "\nAccount 3 - $"
				+ String.format("%.2f", acct3.getBalance()));
		acct1.transferIn(acct2, 100.00);
		acct2.transferIn(acct3, 100.00);
		acct3.transferIn(acct1, 50.01);
		System.out.println("\nAccount balances after incoming transfer: \nAccount 1 - $"
				+ String.format("%.2f", acct1.getBalance())
				+ "\nAccount 2 - $" + String.format("%.2f", acct2.getBalance()) + "\nAccount 3 - $"
				+ String.format("%.2f", acct3.getBalance()));
		System.out.println();

		// Test transferOut()
		System.out.println("\nAccount balances before outgoing transfer: \nAccount 1 - $"
				+ String.format("%.2f", acct1.getBalance())
				+ "\nAccount 2 - $" + String.format("%.2f", acct2.getBalance()) + "\nAccount 3 - $"
				+ String.format("%.2f", acct3.getBalance()));
		acct1.transferOut(acct2, 49.99);
		acct2.transferOut(acct3, 49.99);
		acct3.transferOut(acct1, -2.00);
		System.out.println("\nAccount balances after outgoing transfer: \nAccount 1 - $"
				+ String.format("%.2f", acct1.getBalance())
				+ "\nAccount 2 - $" + String.format("%.2f", acct2.getBalance()) + "\nAccount 3 - $"
				+ String.format("%.2f", acct3.getBalance()));
		System.out.println();

		// Test printInfo() and toString()
		System.out.println("\nUsing printInfo()");

		acct1.printInfo();
		System.out.println();

		acct2.printInfo();
		System.out.println();

		acct3.printInfo();
		System.out.println();

		System.out.println("\nUsing toString()");

		System.out.println(acct1 + "\n");

		System.out.println(acct2 + "\n");

		System.out.println(acct3 + "\n");

		// Test compareTo()
		System.out.println("Testing CompareTo()");
		System.out.println("Account 1 balance: $" + String.format("%.2f", acct1.getBalance()));
		System.out.println("Account 2 balance: $" + String.format("%.2f", acct2.getBalance()) + "\n");
		if (acct1.compareTo(acct2) > 0) {
			System.out.println("Account 1 is greater than Account 2");
		} else if (acct1.compareTo(acct2) < 0) {
			System.out.println("Account 1 is less than Account 2");
		} else {
			System.out.println("Account 1 is equal to Account 2");
		}

		System.out.println();

		// Test RewardsAccount
		RewardsAccount acct4 = new RewardsAccount();
		RewardsAccount acct5 = new RewardsAccount(-10.00);

		// Test overriden toString() and printInfo()
		System.out.println("\nUsing RewardsAccount toString()");

		System.out.println(acct4 + "\n");

		System.out.println(acct5 + "\n");

		System.out.println();

		System.out.println("Using RewardsAccount printInfo()");

		acct4.printInfo();
		System.out.println();

		acct5.printInfo();
		System.out.println();

		// Test getRewards()
		System.out.println("\nReward balances: \nAccount 4 - $" + String.format("%.2f", acct4.getRewards())
				+ "\nAccount 5 - $" + String.format("%.2f", acct5.getRewards()));

		// Test redeemRewards() and deposit()
		System.out.println("\nAccount 4 before redeeming rewards:\n" + acct4 + "\n");
		acct4.redeemRewards();
		System.out.println("\nAccount 4 after redeeming rewards:\n" + acct4 + "\n");

		acct4.deposit(100.00);
		acct4.deposit(100.00);
		acct4.deposit(100.00);
		acct4.deposit(100.00);
		acct4.deposit(100.00);

		System.out.println("\nAccount 4 before redeeming rewards:\n" + acct4 + "\n");
		acct4.redeemRewards();
		System.out.println("\nAccount 4 after redeeming rewards:\n" + acct4 + "\n");
	}

}

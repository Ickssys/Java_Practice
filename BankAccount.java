// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount { // BankAccount template for Practice-It
	private String id;
	private double balance;
	private int transactions;
	private String transactionText;

	public BankAccount(String id) {
		this.id = id;
		balance = 0;
		transactions = 0;
		transactionText = "";
	}

	public double getBalance() {
		return balance;
	}

	public String getID() {
		return id;
	}

	public int getTransactionCount() {
		return transactions;
	}

	public String getTransactions() {
		return transactionText;
	}

	public void deposit(double amount) {
		if (0 <= amount && amount <= 500) {
			balance += amount;
			transactionText += "deposit of $" + amount + "\n";
		}
		transactions++;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			transactionText += "withdrawal of $" + amount + "\n";
		}
		transactions++;
	}

	public String toString() {
		return id;
	}

	public void transfer(BankAccount acct, double tAmount) {
		double fee = 5.00;
		if (balance < fee || tAmount <= 0.0) {
			balance -= 0;
		} else if (balance < tAmount) {
			transactions++;
			acct.transactions++;
			balance -= fee;
			acct.balance += balance;
			balance -= balance;
		} else {
			balance -= fee + tAmount;
			transactions++;
			acct.balance += tAmount;
			acct.transactions++;
		}
	}
}
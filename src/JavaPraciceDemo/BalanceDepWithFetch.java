package JavaPraciceDemo;

public class BalanceDepWithFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount BC = new BankAccount();
		double bal = BC.GetBalance();
		System.out.println(bal);
		BC.Deposite(13456.34);
		BC.Withdraw(100);
		

	}

}

class BankAccount {

	private double balance = 100000;

	public double GetBalance() {

		return balance;
	}

	public void Deposite(double amount) {

		balance = balance + amount;
		System.out.println(
				"Your account is deposited with amoiunt " + amount + " and the total balance now is " + balance);

	}

	public void Withdraw(double amount) {

		balance = balance - amount;

		System.out.println("Your account is debited with amount " + amount + " and current balance now is " + balance);

	}

}
package oopsConcept;

public class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	private double balance;

	public BankAccount(String accountNumber, String accountHolderName)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;

	}

	public void depositMoney(double money) {
		if (money <= 0) {
			System.out.println("Invalid Amount");
		} else {
			System.out.println("Your balance is: " + money);
			balance += money;
		}
	}

	public double withdrawMoney(double money) {
		if (balance >= money) {
			balance -= money;
		} else if (money <= 0) {
			System.out.println("Invalid withdrawal Amount: " +  money);
		} else {
			money = balance;
			balance = 0;
		}
		return money;
	}
}

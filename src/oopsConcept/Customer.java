package oopsConcept;

public class Customer {
public static void main(String[] args) {
	
	
	BankAccount account = new BankAccount("10128", "Dipak Gadekar");
	account.depositMoney(200);
	System.out.println("withdrawmoney is: " + account.withdrawMoney(100));
	account.depositMoney(-15);
	account.withdrawMoney(0);
}
}

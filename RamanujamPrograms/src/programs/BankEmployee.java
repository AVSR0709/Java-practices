package programs;
import java.util.Scanner;
class BankEmployee {
	Scanner sc = new Scanner(System.in);
private int accno;
private String name;
private double balance;
public void read() {
	System.out.println("Enter the account holder detils :");
	System.out.println("Enter the Name :");
	this.name=sc.nextLine();
	System.out.println("Enter the account Number :");
	this.accno = sc.nextInt();
	System.out.println("Enter the Balance :");
	this.balance = sc.nextDouble();
	
}

public void display() {
	System.out.println("Account Number :"+this.accno);
	System.out.println("Name :"+this.name);
	System.out.println("The balance "+this.balance);
}

public void deposit(double amount) {
	this.balance=this.balance+amount;
}

public void withdraw(double Amount) {
	this.balance -= Amount;
}

public double getbalance() {
	return this.balance;
}

}

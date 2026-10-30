package programs;
import java.util.Scanner;
public class BankAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BankEmployee obj = new BankEmployee();
		
		obj.read();
		obj.display();
		double amount;
		
		System.out.println("Enter the amount to be deposited ");
		amount = sc.nextDouble();
		obj.deposit(amount);
		System.out.println("The current balance is "+obj.getbalance());
	}

}

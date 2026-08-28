package programs;
import java.util.Scanner;
public class TransactionStatusChecker {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		double amount;
		double balance;
		double remaining_balance;
		
		System.out.println("Enter the Amount you want : ");
		amount = sc.nextDouble();
		System.out.println("Enter the Balance in Account : ");
		balance = sc.nextDouble();
		
		if (amount<balance) {
			
			System.out.println("Transaction Successfull ");
			remaining_balance = balance-amount;
			System.out.println("The Remaining Balance : "+remaining_balance);
			
		} else {
			System.out.println("Insufficient Balance ");
		}
		System.out.println("****************** Thank you *****************");

	}

}

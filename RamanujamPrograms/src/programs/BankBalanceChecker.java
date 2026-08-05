package programs;
import java.util.Scanner;
public class BankBalanceChecker {

	public static void main(String[] args) {
		
		int amount;
		int balance;
		boolean ATM;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Amount : ");
		amount = sc.nextInt();
		System.out.println("Enter the Balance : ");
		balance = sc.nextInt();
		System.out.println("Is the ATM active ? ");
		ATM = sc.nextBoolean();
		
		System.out.println("Transaction Status : "+((amount<=balance)&&(ATM)));

	}

}
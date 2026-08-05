package programs;
import java.util.Scanner;
public class ATM_CashClassifier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int amount;
		int Two_Thousands ;
		int Five_Hundreds;
		int Hundreds;
		int Fifty;
		int Twenty;
		int Tens;
		int Five;
		int Two;
		int One;
		int Remaining;
		
		System.out.println("Enter the amount you want : ");
		amount = sc.nextInt();
		
		Two_Thousands= amount/2000;
		Remaining = amount%2000;
		Five_Hundreds = Remaining/500;
		Remaining = Remaining%500;
		Hundreds = Remaining/100;
		Remaining = Remaining%100;
		Fifty = Remaining/50;
		Remaining = Remaining%50;
		Twenty = Remaining/20;
		Remaining = Remaining%20;
		Tens = Remaining/10;
		Remaining  = Remaining%10;
		Five =Remaining/5;
		Remaining = Remaining%5;
		Two =Remaining/2;
		Remaining = Remaining%2;
		One =Remaining/1;
		
		System.out.println("The total number of 2000 RS notes : "+Two_Thousands);
		System.out.println("The total number of 500 RS notes : "+Five_Hundreds);
		System.out.println("The total number of 100 RS notes : "+Hundreds);
		System.out.println("The total number of 50 RS notes : "+Fifty);
		System.out.println("The total number of 20  RS notes : "+Twenty);
		System.out.println("The total number of 10 RS notes : "+Tens);
		System.out.println("The total number of 5 RS coins : "+Five);
		System.out.println("The total number of 2 RS coins : "+Two);
		System.out.println("The total number of 1 RS coins : "+One);
		

	}

}

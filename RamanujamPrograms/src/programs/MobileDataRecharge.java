package programs;
import java.util.Scanner;
public class MobileDataRecharge {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		double recharge_amount;
		
		System.out.println("Enter the Annual income : ");
		recharge_amount = sc.nextDouble();
		
		if (recharge_amount >= 100 && recharge_amount <= 299) {
			
			double cashback = recharge_amount * 0.05;
			double final_cost = recharge_amount - cashback;
	
			System.out.println("The Cashback Amount : "+cashback);
			System.out.println("The final cost : "+final_cost);
		} 
		else if (recharge_amount >= 300 && recharge_amount <= 499) {
			double cashback = recharge_amount * 0.1;
			double final_cost = recharge_amount - cashback;
			System.out.println("The Cashback Amount : "+cashback);
			System.out.println("The final cost : "+final_cost);
		}
		else if (recharge_amount >= 500 && recharge_amount <= 999) {
			double cashback = recharge_amount * 0.15;
			double final_cost = recharge_amount - cashback;
			System.out.println("The Cashback Amount : "+cashback);
			System.out.println("The final cost : "+final_cost);
				}
		else if (recharge_amount >= 1000) {
			double cashback = recharge_amount * 0.2;
			double final_cost = recharge_amount - cashback;
			System.out.println("The Cashback Amount : "+cashback);
			System.out.println("The final cost : "+final_cost);
		}
		else {
			System.out.println("Please enter the correct value ");
		}

	}

}

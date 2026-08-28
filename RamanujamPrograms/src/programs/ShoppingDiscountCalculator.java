package programs;
import java.util.Scanner;
public class ShoppingDiscountCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double bill_amount;
		
		System.out.println("Enter the bill amount : ");
		bill_amount = sc.nextDouble();
		
		
		if (bill_amount >= 5000) {
			
			double discount = bill_amount*0.15;
			System.out.println("The discount amount :"+discount);
			double final_amount = bill_amount - discount;
			System.out.println("The total payable final amount : "+final_amount);
			
			
		} else {
			
			double discount = bill_amount*0.05;
			System.out.println("The discount amount :"+discount);
			double final_amount = bill_amount - discount;
			System.out.println("The total payable final amount : "+final_amount);

		}

	}

}

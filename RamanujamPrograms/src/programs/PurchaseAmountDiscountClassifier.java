package programs;
import java.util.Scanner;
public class PurchaseAmountDiscountClassifier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double purchase_amount;
		double discount_amount;
		
		System.out.println("Enter the Purchase Amount");
		purchase_amount =sc.nextDouble();
		
		if (purchase_amount >=50000) {
			discount_amount = purchase_amount*0.2;
			System.out.println("Discount Amount : "+discount_amount);
		} 
		else if (purchase_amount >=30000) {
			discount_amount = purchase_amount*0.15;
			System.out.println("Discount Amount : "+discount_amount);
			
		}
		else if (purchase_amount >=10000) {
			discount_amount = purchase_amount*0.1;
			System.out.println("Discount Amount : "+discount_amount);
		}
		
		else {
			discount_amount = purchase_amount*0;
			System.out.println("Discount Amount : "+discount_amount);

		}

	}

}

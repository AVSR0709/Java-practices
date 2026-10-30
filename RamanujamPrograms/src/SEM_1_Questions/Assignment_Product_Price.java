package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Product_Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product name :");
		String name = sc.nextLine();
		System.out.println("Enter the Price :");
		int price = sc.nextInt();
		System.out.println("Enter the Quantity :");
		int quantity = sc.nextInt();
		
		int total = quantity * price;
		
		if (total >= 10000) {
			
			System.out.println("The Actual Bill : "+total);
			float discount =15;
			discount = total * discount/100;
			double final_amount = total - discount;
			System.out.println("The Discount Amount :"+discount);
			System.out.println("The Final Amount : "+final_amount);
			
		} 
		else if (total >= 5000 && total < 10000) {
			
			System.out.println("The Actual Bill : "+total);
			float discount =10;
			discount = total * discount/100;
			double final_amount = total - discount;
			System.out.println("The Discount Amount :"+discount);
			System.out.println("The Final Amount : "+final_amount);
		}
		else if (total >= 2000 && total < 5000) {
			
			System.out.println("The Actual Bill : "+total);
			float discount =5;
			discount = total * discount/100;
			double final_amount = total - discount;
			System.out.println("The Discount Amount :"+discount);
			System.out.println("The Final Amount : "+final_amount);
		}
		else if (total < 2000) {
			
			System.out.println("The Actual Bill : "+total);
			float discount =0;
			discount = total * discount/100;
			double final_amount = total - discount;
			System.out.println("The Discount Amount :"+discount);
			System.out.println("The Final Amount : "+final_amount);
		}
		else {
			System.out.println("Please enter the correct value "
					+ "");
		}
	}

}

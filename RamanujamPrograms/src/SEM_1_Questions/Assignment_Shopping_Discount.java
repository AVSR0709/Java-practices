package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Shopping_Discount {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the customer name :");
		String customer_name = sc.nextLine();
		System.out.println("Enter the purchase amount : ");
		int amount = sc.nextInt();
		
		if (amount >=10000) {
			
			short discount = 20;
			int discount_amount = amount * discount/100;
			int final_amount = amount - discount_amount;
			
			System.out.println("The Discount Percentage : "+discount);
			System.out.println("The Discount Amount : "+discount_amount);
			System.out.println("The Final Amount : "+final_amount);
		} 
		else if (amount >=5000 && amount <=9999) {
			short discount = 10;
			int discount_amount = amount * discount/100;
			int final_amount = amount - discount_amount;
			
			System.out.println("The Discount Percentage : "+discount);
			System.out.println("The Discount Amount : "+discount_amount);
			System.out.println("The Final Amount : "+final_amount);
		}
		else if (amount >=2000 && amount <=4999) {
			short discount = 5;
			int discount_amount = amount * discount/100;
			int final_amount = amount - discount_amount;
			
			System.out.println("The Discount Percentage : "+discount);
			System.out.println("The Discount Amount : "+discount_amount);
			System.out.println("The Final Amount : "+final_amount);
		}
		else if (amount >=0 && amount <=2000) {
			short discount = 0;
			int discount_amount = amount * discount/100;
			int final_amount = amount - discount_amount;
			
			System.out.println("The Discount Percentage : "+discount);
			System.out.println("The Discount Amount : "+discount_amount);
			System.out.println("The Final Amount : "+final_amount);
		}
		else {
			System.out.println("Please enter correct amount");
		}
	}

}

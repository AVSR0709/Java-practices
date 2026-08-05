package programs;
import java.util.Scanner;
public class ShopGroceryBillCounter {
public static void main(String[] args) {
	Scanner biller = new Scanner(System.in);
	
	double Item_Quantity;
	double price_per_item;
	double Discount;
	double GST;
	double Total_amount;
	
	System.out.println("Enter the number of Quantity of Items : ");
	Item_Quantity = biller.nextDouble();
	System.out.println("Enter the Price per item : ");
	price_per_item =  biller.nextDouble();
	System.out.println("Enter the Discount (%) : ");
	Discount = biller.nextDouble();
	System.out.println("Enter the GST (%) : ");
	GST = biller.nextDouble();
	
	Total_amount = Item_Quantity * price_per_item;
	Discount = Discount/100;
	Discount = Total_amount * Discount;
	Total_amount = Total_amount - Discount ; 
	GST = GST/100;
	GST = GST*Total_amount;
	Total_amount = Total_amount + GST;
	
	System.out.println("The Discount amount : "+Discount);
	System.out.println("The GST amount : "+GST);
	System.out.println("The Final amount : "+Total_amount);
	}
}

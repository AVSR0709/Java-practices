package programs;

public class OnlineShoppingApplication {
public static void main(String[] args) {
	byte Items_Purchased = 5;
	float Discount = 0.1f;
	float GST = 0.18f;
	short Order_Id = 4501;
	long Transaction_Id = 987654321987L;
	float Price_Per_Item = 599.50f;
	char Payment_mode = 'c';
	boolean Payment_status = true;
	float Total_cost;
	float Final_bill;
	
	Total_cost = Items_Purchased * Price_Per_Item;
	Discount = Total_cost*Discount;
	Total_cost = Total_cost - Discount;
	GST = Total_cost * GST;
	Final_bill = Total_cost+GST;
	  
	
	System.out.println("Order Id : "+Order_Id);
	System.out.println("Transaction Id : "+Transaction_Id);
	System.out.println("Payment Mode : "+Payment_mode);
	System.out.println("The Final amount to be paid : "+Final_bill);
	System.out.println("The Payment Status : "+Payment_status);
}
}

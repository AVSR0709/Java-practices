package programs;
public class FuelBillGenerator {
	public static void main(String[] args) {
		double petrol_purchased = 18.75 ;
		double cost_per_litre = 108.45 ;
		double amount_paid = petrol_purchased * cost_per_litre;
		System.out.println("Total amount for petrol of - "+petrol_purchased+"litres is : "+amount_paid);
		}
	}
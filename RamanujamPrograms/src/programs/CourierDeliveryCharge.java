package programs;
import java.util.Scanner;
public class CourierDeliveryCharge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double charge;
		double parcel_cost;
		double parcel_weight;
		double handling_charge;
		double final_amount;
		double delivery_charge;
		
		
		System.out.println("Enter the Weight of Parcel : ");
		parcel_weight = sc.nextDouble();
		
		System.out.println("Enter the Price Charged  on 1 kg : ");
		parcel_cost = sc.nextDouble();
		
		if (parcel_weight > 20) {
			
			handling_charge = 150;
			delivery_charge = parcel_cost*parcel_weight;
			final_amount = delivery_charge+handling_charge;
			System.out.println("The Delivery Charge as per weight of courier : "+delivery_charge);
			System.out.println("The Price Charged on Handling courier : "+handling_charge);
			System.out.println("The Total Amount to be paid : "+final_amount);
			
		} else {
			
			delivery_charge = parcel_cost*parcel_weight;
			final_amount = delivery_charge+0;
			System.out.println("The Final Amount to be paid : "+final_amount);

			
		}

	}

}

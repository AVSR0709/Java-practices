package programs;
import java.util.Scanner;
public class CourierChargeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double parcel_weight;
		
		System.out.println("Enter the weight of parcel : ");
		parcel_weight = sc.nextDouble();
		
		
		if (parcel_weight <= 2) {
			
			double cost = parcel_weight * 50;
			System.out.println("The total cost : "+cost);
		}
		else if (parcel_weight >2 && parcel_weight <= 5) {
			double cost = parcel_weight * 45;
			System.out.println("The total cost : "+cost);
		}
		else if (parcel_weight >5 && parcel_weight <= 10) {
			double cost = parcel_weight * 40;	
			System.out.println("The total cost : "+cost);
				}
		else if (parcel_weight > 10) {
			double cost = parcel_weight * 30;
			System.out.println("The total cost : "+cost);
		}
		else {
			System.out.println("Please enter the correct value ");
		}

	}

}

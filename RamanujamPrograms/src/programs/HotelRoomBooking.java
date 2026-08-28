package programs;
import java.util.Scanner;
public class HotelRoomBooking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nights;
		double total_cost;
		
		System.out.println("Enter the number of nights stayed :");
		nights = sc.nextDouble();
		
		if (nights >= 3) {
			
			double discount ;
			
			System.out.println("The Bill (before discount): "+nights*2500);
			discount = 2500*nights * 0.2;
			System.out.println("The discount amount : "+discount);
			total_cost = 2500*nights - discount;
			System.out.println("The total cost : "+total_cost);
			
			
		} else {
			
			System.out.println("The Bill (before discount): "+nights*2500);
			double discount ;
			discount = 2500*nights * 0;
			System.out.println("The discount amount : "+discount);
			total_cost = 2500*nights - discount;
			System.out.println("The total cost : "+total_cost);
		}
	

	}

}

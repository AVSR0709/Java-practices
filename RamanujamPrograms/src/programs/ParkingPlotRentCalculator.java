package programs;
import java.util.Scanner;
public class ParkingPlotRentCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double hours_parked;
		double Parking_fee;
		
		System.out.println("Enter the Hours Parked : ");
		hours_parked = sc.nextDouble();
		
		Parking_fee = (hours_parked-2)*20+60;
		System.out.println("The Total Fee to be Paid : "+Parking_fee);

	}

}

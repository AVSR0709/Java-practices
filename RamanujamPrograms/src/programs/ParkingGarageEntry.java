package programs;
import java.util.Scanner;
public class ParkingGarageEntry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double height;
		int spaces_remaining;
		
		System.out.println("Enter the Height of Vehicle : ");
		height = sc.nextDouble();
		System.out.println("Enter the Spaces Remaining in Garage : ");
		spaces_remaining = sc.nextInt();
		
		System.out.println("Will vehicle get Entry : "+((height<2.5)&&(spaces_remaining>0)));

	}

}

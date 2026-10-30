package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Taxi_Fare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Passenger Naame :");
		String name = sc.nextLine();
		System.out.println("Enter the Distance Travelled :");
		double distance = sc.nextDouble();
		
		if (distance >= 20) {
			
			System.out.println("Name : "+name);
			System.out.println("Distance Travelled : "+distance);
			double total = distance*15;
			System.out.println("The Total Fare : "+total);
		} 
		else if (distance >= 10 && distance <20) {
			System.out.println("Name : "+name);
			System.out.println("Distance Travelled : "+distance);
			double total = distance*12;
			System.out.println("The Total Fare : "+total);
		}
		else if (distance >= 5 && distance <10) {
			System.out.println("Name : "+name);
			System.out.println("Distance Travelled : "+distance);
			double total = distance*10;
			System.out.println("The Total Fare : "+total);
		}
		else if (distance >= 0 && distance <5) {
			System.out.println("Name : "+name);
			System.out.println("Distance Travelled : "+distance);
			double total = distance*8;
			System.out.println("The Total Fare : "+total);
		}
		else {
			System.out.println("Please enter correct values");
		}
	}

}

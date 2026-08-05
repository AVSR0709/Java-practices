package programs;
import java.util.Scanner;
public class BikeFuelPredictor {
	public static void main(String[] args) {
		
		double Distance_travelled;
		double milage_per_litre;
		double petrol_price;
		double Fuel_required;
		double Fuel_expenses;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Distance Travelled : ");
		Distance_travelled = sc.nextDouble();
		System.out.println("Enter the Milage per Litre : ");
		milage_per_litre = sc.nextDouble();
		System.out.println("Enter the Petrol Price per Litre : ");
		petrol_price = sc.nextDouble();
		Fuel_required = Distance_travelled/milage_per_litre;
		Fuel_expenses = Fuel_required*petrol_price;
		
		System.out.println("The Fuel required : "+Fuel_required);
		System.out.println("The Fuel expenses : "+Fuel_expenses);

	}

}

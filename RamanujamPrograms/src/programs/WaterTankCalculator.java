package programs;
import java.util.Scanner;
public class WaterTankCalculator {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double Tank_capacity;
	double Flow_Rate;
	double Time;
	double Water_Filled;
	double Remaining_Capacity;
	
	System.out.println("Enter the amount of water in Water Tank (litres) : ");
	Tank_capacity = input.nextDouble();
	System.out.println("Enter the Flow Rate of Water (litres/minute) : ");
	Flow_Rate = input.nextDouble();
	System.out.println("Enter the Time (minutes) : ");
	Time = input.nextDouble();
	
	Water_Filled = Time*Flow_Rate;
	Remaining_Capacity = Tank_capacity-Water_Filled;
	
	System.out.println("The Amount of Water Filled : "+Water_Filled);
	System.out.println("The Amount of Water Remaining : "+Remaining_Capacity);
}
}

package programs;
import java.util.Scanner;
public class FieldFencingCost {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	double length;
	double breadth;
	double perimeter;
	double cost_per_meter;
	double total_cost;
	System.out.println("Enter the length of rectangular field : ");
	length = sc.nextDouble();
	System.out.println("Enter the breadth of rectangular field : ");
	breadth = sc.nextDouble();
	System.out.println("Enter the cost per meter : ");
	cost_per_meter = sc.nextDouble();
	
	perimeter =2*length+2*breadth;
	total_cost = perimeter * cost_per_meter;
	
	System.out.println("The total cost to fence the field : "+total_cost);
}
}

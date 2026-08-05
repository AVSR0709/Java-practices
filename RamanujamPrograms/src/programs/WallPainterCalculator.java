package programs;
import java.util.Scanner;
public class WallPainterCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double length;
		double height;
		double area;
		double area_covered_unit;
		double paint;
		double cost_required;
		double cost_per_unit;
		
		System.out.println("Enter the Length of Wall : ");
		length = sc.nextDouble();
		System.out.println("Enter the Height of Wall : ");
		height = sc.nextDouble();
		System.out.println("Enter the Area Covered by Unit : ");
		area_covered_unit = sc.nextDouble();
		System.out.println("Enter the cost per unit : ");
		cost_per_unit = sc.nextDouble();
		
		area = length*height;
		paint = area/area_covered_unit;
		cost_required = paint*cost_per_unit;
		
		System.out.println("The Paint required : "+paint);
		System.out.println("The Cost required : "+cost_required);

	}

}

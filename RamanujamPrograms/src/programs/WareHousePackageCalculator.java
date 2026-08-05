package programs;
import java.util.Scanner;
public class WareHousePackageCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number_products;
		int Capacity_Box;
		int number_Box;
		int Remaining_product;
		
		System.out.println("The Number of Products : ");
		number_products = sc.nextInt();
		System.out.println("The Capacity of Box : ");
		Capacity_Box=sc.nextInt();
		
		number_Box = number_products/Capacity_Box;
		Remaining_product = number_products%Capacity_Box;
		
		System.out.println("The Number of Boxes filled : "+number_Box);
		System.out.println("The Remaining products : "+Remaining_product);

	}

}

package programs;
import java.util.Scanner;
public class Sum_Of_Products_Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter num of products ");
		n = sc.nextInt();
		double [] price = new double[n];
		
		for (int i = 0; i < price.length; i++) {
			System.out.println((i+1)+" ");
			price[i] = sc.nextDouble();
			double sum = 0;
			for (double element : price) {
				
				sum= sum+element;
			}
			System.out.println("Product "+sum);
		}

	}

}

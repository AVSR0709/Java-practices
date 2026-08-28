package programs;
import java.util.Scanner;
public class Product_Of_Numbers_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n , i = 1,product= 1;
		System.out.println("Enter vale N");
		n = sc.nextInt();
		while (i <=n) {
			product = product*i;
			i++;
		}
		System.out.println("Product "+product);
	}

}

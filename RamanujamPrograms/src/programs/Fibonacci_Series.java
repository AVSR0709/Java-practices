package programs;
import java.util.Scanner;
public class Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc = new 	Scanner(System.in);
		System.out.println("Enter the term :");
		int n = sc.nextInt();
		int a = 0 , b = 1 , c;
		System.out.println(a+ " "+b);
		for (int i = 3; i <= n ; i++) {
			c = a+b;
			System.out.println(" "+c);
			a = b;
			b = c;
		}

	}

}

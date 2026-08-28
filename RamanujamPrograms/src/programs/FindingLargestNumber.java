package programs;
import java.util.Scanner;
public class FindingLargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Enter the values of A,B,C");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("Largest Value : "+a);
		} 
		else if (b>a && b>c) {
			System.out.println("Largest Value : "+b);
		}
		else {
			System.out.println("Largest Value : "+c);
		}
	}

}

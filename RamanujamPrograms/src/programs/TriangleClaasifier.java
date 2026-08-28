package programs;
import java.util.Scanner;
public class TriangleClaasifier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter the Lenght of Side A ");
		a= sc.nextInt();
		System.out.println("Enter the Lenght of Side B ");
		b = sc.nextInt();
		System.out.println("Enter the Lenght of Side C ");
		c= sc.nextInt();
		
		if (a == b && b == c && c == a) {
			System.out.println("Equilateral");
		} 
		else if (a != b  || b !=c || c != a) {
			System.out.println("Isoceles");
		}	
		else if (a != b  && b !=c && c != a) {
			System.out.println("Scalene");
		}
		else {
			System.out.println("Enter the correct value");
		}
		

	}

}

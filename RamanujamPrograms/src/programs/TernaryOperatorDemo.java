package programs;
import java.util.Scanner;
public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the values of a and b : ");
		a = sc.nextInt();
		b= sc.nextInt();
		int large = (a>b)?a:b;
		System.out.println("The largest values is : "+large);

	}

}

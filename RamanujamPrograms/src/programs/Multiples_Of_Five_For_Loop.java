package programs;
import java.util.Scanner;
public class Multiples_Of_Five_For_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n , i=5,sum=0;
		System.out.println("Enter N");
		n=sc.nextInt();
		for ( i = 5; i <= n; i++) {
			sum = sum+i;
			i = i+5;
		}
		System.out.println("Sum of Multiples of 5 "+sum);
	}

}

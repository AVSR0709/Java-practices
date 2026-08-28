package programs;
import java.util.Scanner;
public class Multiples_Of_Five_Do_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,i = 5,sum =0;
		System.out.println("Enter N");
		n = sc.nextInt();
		do {
			sum =sum+i;
			i = i+5;
		} while (i <= n);
		System.out.println("Sum of multiple of 5 :"+sum);
	}

}

package programs;
import java.util.Scanner;
public class Number_Of_Even_Elements_Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lit of numbers ");
		int n = sc.nextInt();
		int []num = new int[n];
		System.out.println("Enter "+n+"number");
		for (int i = 0; i < num.length; i++) {
			num [i]=sc.nextInt();
		}
		int even = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]%2 == 0) {
				even++;
			}
			System.out.println("Even "+even);
		}

	}

}

package programs;
import java.util.Scanner;
public class Numers_Between_Divisible_By_Five {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range Values of N and M");
		int n=sc.nextInt();
		int m = sc.nextInt();
		for (int i = n; i <= m; i++) {
			if (i%5==0) {
				System.out.print(i +" ");
			}
		}

	}

}

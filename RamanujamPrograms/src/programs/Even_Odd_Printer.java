package programs;
import java.util.Scanner;
public class Even_Odd_Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Till how many numbers : ");
		int n = sc.nextInt();
		int i = 0;
		while (i<=n) {
			
			if (i % 2 == 0) {
				System.out.println(i+" "+"E");
				
			}
			else {
			System.err.println(i+" "+"O");
		
			}
			
			i++;
			
		}
		
	}
}

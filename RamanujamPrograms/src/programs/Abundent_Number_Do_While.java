package programs;
import java.util.Scanner;
public class Abundent_Number_Do_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=1,num;
		int sum = 0;
		System.out.println("Enter the number ");
		num = sc.nextInt();
		do {
			if (num%i == 0)
				sum = sum+i;
				i++;
		
		} while (i<=num);
		if (sum>num) {
			System.out.println("Abundent number");
		} else {
			System.out.println("Not Abundent number");
		}
		sc.close();
	}

}

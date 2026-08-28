package programs;
import java.util.Scanner;
public class Average_Of_Number_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n , i= 1,sum=0;
		double average;
		System.out.println("Enter the N");
		n = sc.nextInt();
		while (i <= n) {
			sum = sum+i;
			i++;
			average = (double)sum/n;
			System.out.println("Average of numbers : "+average);
		}

	}

}

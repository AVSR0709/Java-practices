package programs;
import java.util.Scanner;
public class Average_Of_Numbers_Do_Whole_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,i = 1,sum=0;
		double average;
		System.out.println("Enter N");
		n=sc.nextInt();
		do {
			sum = sum+i;
			i++;
		} while (i <= n);
		average = (double)sum/n;
		System.out.println("Average "+average);
	}

}

package programs;
import java.util.Scanner;
public class Abundent_Number_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 1,num,abundant;
		int sum=0;
		System.out.println("Enter the number : ");
		num= sc.nextInt();
		while (i<num) {
			if (num%i == 0) {
				sum = sum+i;
				i++;
				
			}
			if (sum > num) {
				System.out.println("Abundent number ");
				
			}
			else {
				System.out.println(num + "is not abundent number");
			}
		}
	}

}

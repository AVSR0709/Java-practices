package programs;
import java.util.Scanner;
public class Leap_Year_Method_Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if (Leap_Year_Method_Defination.yleap(year)) {
			System.out.println("It is Leap Year");
		} else {
			System.out.println("It is not Leap Year ");
		}
	}

}

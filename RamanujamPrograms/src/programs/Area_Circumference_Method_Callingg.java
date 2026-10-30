package programs;
import java.util.Scanner;
public class Area_Circumference_Method_Callingg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle :");
		int r = sc.nextInt();
		
		System.out.println("Area of circle : "+Area_Cirumference_Method_Defination.ACCMD(r));
		System.out.println("Perimeter of circle :"+Area_Cirumference_Method_Defination.ACCMP(r));
	}

}

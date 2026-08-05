package programs;
import java.util.Scanner;
public class ConeVolumeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int radius2 ; 
		int height2 ; 
		System.out.println("The shape you chose is : Cone");
		System.out.println("");
		System.out.println("Enter the value of Radius of cone :");
		System.out.println("");
		radius2 = sc .nextInt();
		System.out.println("Enter the value of Height of cone :");
		Scanner inpt7 =  new Scanner (System.in);
		
		height2 = sc.nextInt();
		System.out.println("");
		System.out.println("Formula : Volume = (1/3)*(π)*(r^2)*(h)");
		double volume41 = 22*radius2*radius2*height2;
		double volume411=volume41/21;
		System.out.println("Calculating...");
		System.out.println("The volume of cone having radius - "+radius2+" & height - "+height2);
		System.out.println("");
		System.out.printf("The volume of Cone is : %.2f ",volume411);

	}

}

package programs;
import java.util.Scanner;
public class PrintF_Functioning {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Student_Name;
		char gender;
		float Total_marks;
		float Percentage_Secured;
		boolean Student_College;
		
		System.out.println("Enter the Student Name : ");
		Student_Name = sc.next();
		System.out.println("Enter the Gender : ");
		gender = sc.next().charAt(0);
		System.out.println("Enter the IPE Total Marks : ");
		Total_marks = sc.nextFloat();
		System.out.println("Enter the Percentage Secured in IPE : ");
		Percentage_Secured = sc.nextFloat();
		System.out.println("Is the Student of KLH : ");
		Student_College = sc.nextBoolean();
		
		System.out.printf("Name : %s%n",Student_Name);
		System.out.printf("Gender : %c%n",gender);
		System.out.printf("Total Marks in IPE : %f%n",Total_marks);
		System.out.printf("Percentage Secured : %.2f%%%n",Percentage_Secured);
		System.out.printf("Is student of KLH : %b%n ",Student_College);
		
	}

}

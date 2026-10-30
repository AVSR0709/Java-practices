package programs;
import java.util.Scanner;
public class Grade_Marks_Method_Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of 1st subject");
		int m1 = sc.nextInt();
		System.out.println("Enter marks of 2nd subject");
		int m2 = sc.nextInt();
		System.out.println("Enter marks of 3rd subject");
		int m3 = sc.nextInt();
		
		System.out.println("Grade :"+ Grade_Marks_Method_Defination.Mark(m1, m2, m3));
	}

}

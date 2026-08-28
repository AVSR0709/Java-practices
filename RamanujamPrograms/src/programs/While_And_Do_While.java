package programs;
import java.util.Scanner;
public class While_And_Do_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n :  ");
		int n ;
		n= sc.nextInt();
		        int i = n;

		        // While loop
		        System.out.println("While Loop:");
		        while (i <= 3) {
		      System.out.println(i);
		      i++;
		        }

		        // Do-while loop
		         i = n;
		        System.out.println("Do-While Loop:");
		        do {
		            System.out.println(i);
		            i++;
		        } while (i <= 3);
		    }
		}

	


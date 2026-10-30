package programs;
import java.util.Scanner;
public class Square_cube_method_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number ");
	int n = sc.nextInt();
	
	System.out.println("Factorial of number of :"+	Square_cube_method_declaration.factorial(n));

	System.out.println("Checking strong number or not :"+	Square_cube_method_declaration.strong(n));

	System.out.println("Square of number :"+Square_cube_method_declaration.square(n));
	
	System.out.println("Cube of number :"+Square_cube_method_declaration.cube(n));
	
	}

}

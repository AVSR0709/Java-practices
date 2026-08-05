package programs;

import java.util.Iterator;
import java.util.Scanner;

public class MagicSquareMatrixGenerator {

	public static void main(String[] args) {
		
		//Taking Input for generating a Matrix
		
		Scanner inpt = new Scanner(System.in);
		System.out.println("##################### Welcome Magic Matrix Generator #################");
		System.out.println("Give value of 'a' to generate (aXa) size matrix ");
		int number;
		number=inpt.nextInt();
		
		
		
		if (number%2==0) {
			
			System.out.println("Output is currently unavailable ");
			
		} else {
			System.out.println("Generating "+number+" X "+number+" Matrix");
			int first = number/2;
			int digit1 = first+1;
			
			int row =first;
			int column;
			int sizer = number*number;
			for (int london = 0; london <= sizer; london++) {
				int matrix[][]= {{london}};
				System.out.println(matrix);
			}
			
			for (row = 1; row < number; row++) {
								
			}
			System.out.println("          "+digit1);
		}
		
	}
}

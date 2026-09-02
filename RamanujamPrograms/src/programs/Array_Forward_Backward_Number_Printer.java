package programs;
import java.util.Scanner;
public class Array_Forward_Backward_Number_Printer {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,60};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]+" "+arr[arr.length-i-1]);
			
		}
		if (arr.length%2!=0) {
			System.out.println();
			System.out.print(" "+arr[arr.length/2]);
		}
	}

}

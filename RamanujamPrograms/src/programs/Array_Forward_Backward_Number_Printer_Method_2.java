package programs;
import java.util.Scanner;
public class Array_Forward_Backward_Number_Printer_Method_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = {10,20,30,40,50,60,70,80};
		int si=0;
		int ei=arr.length-1;
		while (si <= ei) {
		System.out.println(arr[si]);
		if (si != ei) {
			System.out.println(" "+arr[ei]+" ");
			si++;
			ei--;
		}
		}
		
	}

}

package programs;
import java.util.Scanner;
public class PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Size");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
//			sum = arr[i]+sum;
		}
		
		for (int i = 0; i < size; i++) {
			// System.out.print(arr[i]+" ");
		}
		System.out.println(sum);
	}

}

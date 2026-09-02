package programs;
import java.util.Scanner;
public class Array_Search_Key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the elements into the array of size "+arr.length);
		for (int i = 0; i < arr.length; i++) {
		
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key search ");
		int key = sc.nextInt();
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==key) {
				System.out.println("Element Found "+(i+1));
				flag = 1;
				break;
				
			}
			
			}
		if (flag == 0) {
			System.out.println("Element Not Found");
		}
	}

}

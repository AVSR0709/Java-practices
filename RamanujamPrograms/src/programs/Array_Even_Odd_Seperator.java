package programs;
import java.util.Scanner;
public class Array_Even_Odd_Seperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
		int []arr = new int[size];
		System.out.println("Enter elements of the array "+size);
		for(int i =0; i<arr.length;i++) {
		arr[i] = sc.nextInt();}
		int even_sum=0,odd_sum=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
		even_sum+=arr[i];}
		else {odd_sum+=arr[i];
		}
		}
		System.out.print("Evens' sum is: "+even_sum+"\nOdds' sum is: "+odd_sum);
		}
}

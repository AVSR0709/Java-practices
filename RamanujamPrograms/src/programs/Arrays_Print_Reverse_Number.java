package programs;
import java.util.Scanner;
public class Arrays_Print_Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter elements into the array of "+size);
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}System.out.println("The reverse order of elements is:");
		for(int i =arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+ " ");
		}}
}

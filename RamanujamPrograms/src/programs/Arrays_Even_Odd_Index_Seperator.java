package programs;
import java.util.Scanner;
public class Arrays_Even_Odd_Index_Seperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter the elements into array of "+size);
		for(int i =0;i<arr.length;i++) {
		arr[i]=sc.nextInt();}
		System.out.print("Odd Index elements are: ");
		for(int i =0;i<arr.length;i++)
		if(i%2!=0) {System.out.print(arr[i]+" ");}
		System.out.print("\nEven Index elements are: ");
		for(int i=0;i<arr.length;i++) {
		if(i%2==0)System.out.print(arr[i]+" ");}
		}
	
}


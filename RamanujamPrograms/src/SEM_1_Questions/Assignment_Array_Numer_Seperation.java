package SEM_1_Questions;
import java.util.Scanner;
public class Assignment_Array_Numer_Seperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pcount = 0;
		int ncount = 0;
		int zcount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the Elements in the array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 ) {
				pcount++;
			}
			if (arr[i] < 0) {
				ncount++;
			}
			if(arr[i] == 0){
				zcount++;
			}
		
		}
		System.out.println("Number of Positive Elements :"+pcount);
		System.out.println("Number of Negative Elements :"+ncount);
		System.out.println("Number of Zero Elements :"+zcount);
	}

}

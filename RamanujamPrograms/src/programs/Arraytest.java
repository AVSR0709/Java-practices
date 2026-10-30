package programs;
import java.util.Scanner;
public class Arraytest {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int sum=0;
	
	int rows = sc.nextInt();
	int col = sc.nextInt();
	int [][] matrix = new int[rows][col];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			matrix[i][j]=sc.nextInt();
		}
	}
	for (int i = 0; i < matrix.length ; i++) {
		for (int j = 0; j < matrix.length; j++) {
			
			if (i == j) {
				sum +=matrix[i][j];
			}
		}
		System.out.println(sum);
			
		}
	sum =0;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = matrix.length-1; j >= 0; j--) {
			
			if (i + j == matrix.length-1) {
				sum +=matrix[i][matrix.length-1-i];
			}
				
			
		}
	}
	
	
	System.out.println("Sum of diagonal "+sum);
}
}

package programs;

import java.util.Scanner;

public class sanjay {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport java.util.Scanner;
		
				Scanner sc = new Scanner (System.in);
				int sum=0;
				
				int rows = sc.nextInt();
				int col = sc.nextInt();
				int [][] matrix = new int[rows][col];
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix.length; j++) {
						matrix[i][j]=sc.nextInt();
					
						
						if (i == j) {
							sum +=matrix[i][j];
						}
					}}
					System.out.println(sum);
						
			
				}
	}



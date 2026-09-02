package programs;
import java.util.Scanner;
public class Number_Separation_Using_Colors {


	 public static final String RESET = "\u001B[0m";
	    public static final String RED = "\u001B[31m";
	    public static final String GREEN = "\u001B[32m";
	    public static final String YELLOW = "\u001B[33m";
	    public static final String BLUE = "\u001B[34m";
	    public static final String SILVER = "\u001B[37m";
	    public static final String CYAN = "\u001B[36m";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Start : true/false");
		boolean n = sc.nextBoolean();
		boolean k ;
		do {
			
			while (n == true) {
				
				System.out.println(CYAN+"-----------------------");
				
				for (int i = 1; i <= 10; i++) {
			
					if (i % 10 != 0 && i % 2 !=0  ) {
						System.out.println(YELLOW+i);
					}
					
					
					else if ( i % 10 == 0) {
						System.out.println(RED+i);
					}
					
					 else if (i % 2==0 && i % 10 != 0) {
						System.out.println(GREEN+i);
					}
					
					 
					 
					 if (i == 10) {
						 
						 System.out.println(CYAN+"-----------------------");
						 for (int j = i; j >= 1; j--) {
							
							 if (j % 10 != 0 && j % 2 !=0  ) {
									System.out.println(CYAN+j);
								}
								else if (j == 0 ) {
									
									System.out.println(CYAN+"-----------------------");
									System.out.println(SILVER+j);
								}
								
								else if ( j % 10 == 0  ) {
									System.out.println(RED+j);
								}
								
								 else if (j % 2==0 && j % 10 != 0) {
									System.out.println(GREEN+j);
								}
							 
		
						}
						
					}
				}
			}
			
		}


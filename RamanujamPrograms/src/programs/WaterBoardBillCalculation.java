package programs;
import java.util.Scanner;
public class WaterBoardBillCalculation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Valiue of Litres consumed in KiloLitres : ");
		 int litres_consumed = sc.nextInt();
		 
		 if (litres_consumed >= 0 && litres_consumed <=20) {
			 
			 int bill = litres_consumed*5;
			 double services = litres_consumed*5*0.05;
			 double total = bill +services;
			 
			 System.out.println("The total bill : "+total);
			
		} 
		 else if ( litres_consumed <=40) {
			 
			 int bill = (litres_consumed-20)*8+20*5;
			 double services = bill*0.05;
			 double total = bill +services;
			 
			 System.out.println("The total bill : "+total);
			 
			
		}
		 else if ( litres_consumed <=60) {
			 
			 int bill = (litres_consumed-20)*12+20*5+20*8;
			 double services = bill*0.05;
			 double total = bill +services;
			 
			 System.out.println("The total bill : "+total);
			 
			
		}
		 else if ( litres_consumed >60) {
			 
			 int bill =(litres_consumed-20)*16+20*5+20*8;
			 double services = bill*0.05;
			 double total = bill +services;
			 
			 System.out.println("The total bill : "+total);
			 
				
			}			 
		 
		 else {
			 System.out.println("Please enter Correct Value ");
		}

	}

}

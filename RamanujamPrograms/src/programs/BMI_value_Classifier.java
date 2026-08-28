package programs;
import java.util.Scanner;
public class BMI_value_Classifier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the BMI : ");
		double bmi = sc.nextDouble();
		
		if (bmi>0 && bmi <18.5) {
			System.out.println("Under Weight");
		} 
		else if (bmi>18.5 && bmi <24.9) {
			System.out.println("Normal");
		}
		else if (bmi>24.9 && bmi <29.9) {
			System.out.println("Over Weight");
		}
		else if (bmi>25){
			System.out.println("Obese");
		}
		else {
			System.out.println("Please enter correct BMI value");
		}

	}

}

package SEM_1_Questions;
import java.util.Scanner;
public class Home_Assignment_Sample_1_Q_1_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Basic Salary :");
	double Basic = sc.nextDouble();
	double HRA = Basic*0.18;
	double DA = Basic*0.12;
	double medical = Basic*0.08;
	double transport = Basic*0.05;
	double PF = Basic * 0.1;
	double PT = 200;
	double Gross = Basic + HRA + DA + medical + transport;
	double Total_D = PF + PT;
	double net_s = Gross - Total_D;
	System.out.println("HRA :"+HRA);
	System.out.println("DA :"+DA);
	System.out.println("Medical Allowances :"+medical);
	System.out.println("Transport Allowances :"+transport);
	System.out.println("PF :"+PF);
	
}
}

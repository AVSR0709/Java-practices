package programs;
	import java.util.Scanner;
	public class EMPLOYEE {
	private int EID;
	private String Ename;
	private double salary;
	public void read () {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter emplyoee details");
	System.out.println("Enter the Employee ID :");
	this.EID = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Employee name");
	this.Ename = sc.nextLine();
	System.out.println("Enter the Salary ");
	this.salary = sc.nextDouble();
	}
	public void display() {
	System.out.println("Employee ID:"+this.EID);
	System.out.println("Employee Name :"+this.Ename);
	System.out.println("Monthly Salary :"+this.salary);
	}
	public double cal_annual() {
	return 12*this.salary;
	}
	}


package programs;
import java.util.Scanner;
public class Employee_Constructor_Method {
private int eid;
private String name;
private double salary;
private static String Cname;
static {
	System.out.println("Greetings of the day :) ");
}
public static void setName(String name){
	Employee_Constructor_Method.Cname = Cname;
}
public Employee_Constructor_Method(int eid , String name , double salary ) {
	this.eid=eid;
	this.name=name;
	this.salary=salary;
}
@Override
public String toString(){
	return "Employee ID :"+this.eid+"\nEmployee Name :"+this.name+"\nSalary :"+this.salary+"\nCompany Name :"+Employee_Constructor_Method.Cname
			+"Annual Salary :"+this.annualSalary()+"Salary after Tax :"+this.incomeTax();
}
public double annualSalary(){
	return this.salary*12;
}
public double incomeTax(){
	double tax =0;
	if (this.annualSalary()<100000) {
		tax=0;
	}
	else if (this.annualSalary()<150000) {
		tax=this.annualSalary()*0.1;
	}
	else if (this.annualSalary()<200000) {
		tax=this.annualSalary()*0.15;
	}
	else {
		tax=this.annualSalary()*0.25;
	}
	return this.annualSalary()-tax;
}
public class EmployeeDemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Employees :");
		int n = sc.nextInt();
		Employee_Constructor_Method []e=new Employee_Constructor_Method[n];
		for (int i = 0; i < e.length; i++) {
			System.out.println("Enter the Employee Details :");
			String name = sc.nextLine();
			int eid=sc.nextInt();
			double salary=sc.nextDouble();
			e[i]= new Employee_Constructor_Method(eid,name,salary);
		}
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}
}
}

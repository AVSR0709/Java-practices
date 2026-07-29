package programs;

public class GoogleEmployeeSalary {
public static void main(String[] args) {
	double basic_salary = 38500.75, HRA =0.2,DA=0.1,f_pay;
	HRA =basic_salary*HRA;
	DA=basic_salary*DA;
	f_pay = DA+HRA+basic_salary;
	System.out.println("Congrats your salary is : "+f_pay);
}
}

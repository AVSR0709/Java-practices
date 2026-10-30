package programs;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EMPLOYEE RAJU = new EMPLOYEE();
		RAJU.read();
		RAJU.display();
		System.out.println("The annual salary of raju "+RAJU.cal_annual());
		EMPLOYEE ABHI= new EMPLOYEE();
		ABHI.read();
		ABHI.display();
		System.out.println("The annual salary of abhi "+ABHI.cal_annual());
	}

}

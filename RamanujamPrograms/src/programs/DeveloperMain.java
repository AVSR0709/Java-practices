package programs;
class Employee{
	protected int employeeID;
	protected String name;
	protected double salary;
	public Employee(int employeeID,String name,double salary) {
		this.employeeID= employeeID;
		this.name = name;
		this.salary = salary;
	}
	public double calcBonus(double bonus) {
		this.salary += this.salary*bonus;
		return this.salary;
	}
	public String toString() {
		return "Employee Id: "+this.employeeID+"\nEmployee Name: "+this.name+"\nSalary: "+this.salary;
	}
}
class Developer extends Employee{
	protected String programmingLanguage;
	public Developer(int employeeID,String name,double salary,String programmingLanguage) {
	super(employeeID,name,salary);
	this.programmingLanguage = programmingLanguage;
   }
	@Override
	public double calcBonus(double bonus) {
		this.salary+=this.salary*bonus;
		return this.salary;
	}
	@Override
	public String toString() {
		return super.toString()+" "+"\nProgramming Language: "+this.programmingLanguage;
}	
}
class seniorDeveloper extends Developer{
	private int teamSize;
	private int Experience;
	public seniorDeveloper(int employeeID,String name,double salary,String programmingLanguage,int teamSize,int Experience) {
		super(employeeID,name,salary,programmingLanguage);
		this.teamSize = teamSize;
		this.Experience = Experience;
	}
	@Override
	public double calcBonus(double bonus) {
		double incentives = 0;
		this.salary+=this.salary*bonus;
		if(teamSize>5)
			incentives = 10000;
		if(Experience>5)
			incentives = 5000;
		return (this.salary+incentives);
	}
	public String toString() {
		return super.toString()+" "+"\nTeam Size: "+this.teamSize+"\nExperience: "+this.Experience;
	}
}
public class DeveloperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e = new Employee(35235,"Raju",45000);
Developer d = new Developer(86754,"Venkat",60000,"Java");
seniorDeveloper s = new seniorDeveloper(64775,"Umesh",75000,"Python",6,4);
System.out.println(e);
System.out.println("The Salary After Bonus: "+e.calcBonus(0.1));
System.out.println();
System.out.println(d);
System.out.println("The Salary After Bonus: "+d.calcBonus(0.2));
System.out.println();
System.out.println(s);
System.out.println("The Salary After Bonus: "+s.calcBonus(0.3));
	}

}

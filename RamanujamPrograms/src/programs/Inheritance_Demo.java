package programs;

class Profile{
	private String name ;
	private int age;
	private char gender;
	
	public Profile(String name , int age  ) {
		this.name=name;
		this.age=age;
//		this.gender=gender;
	}

public Profile(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
	}
}


public class Inheritance_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profile p1 = new Profile("Ram",10);
		p1.display();
	}

}

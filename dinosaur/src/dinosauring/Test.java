package dinosauring;


import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("################### TEST NO : 1 ##########################");
		List<Integer> name = new ArrayList<Integer>();
		name.add(1);
		name.add(2);
		name.add(3);
		name.add(4);
		System.out.println("Default List : "+name);
		int hi=name.get(2);
		System.out.println("List after retriving : "+hi);
		
		System.out.println("################### TEST NO : 2 ##########################"); 
		
		
		for(int  i = 1; i <=10; i++) {
		
			int mul = i* 2;
			// 1 * 2 = 2
			System.out.println("2 X "+i +"=" +mul);
		}
		
		System.out.println("################## SQUARE TABLE #########################");
		
for (int i = 1; i <= 2 ; i++) {
			
			int z=i*i;
			System.out.println(i +" X " +i +" = "+z );
			
}
		
		List<Student> std = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstName("Rama");
		s1.setLastName("At");
		s1.setSalary(1000);
		
		std.add(s1);
		
		System.out.println("Std details :" + std);
		
	}
	


}

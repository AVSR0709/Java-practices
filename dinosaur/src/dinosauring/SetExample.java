package dinosauring;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("b");
		names.add("a");
		names.add("a");
		names.add("");
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("b");
		treeSet.add("a");
		System.out.println("HashSet :" + names);
		System.out.println("TreeSet :" + treeSet);
	}
}

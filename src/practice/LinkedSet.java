package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSet {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		 set.add("cat");
		
		 set.add("dog");
		 set.add("lion");
		 set.add("Tiger");
		 set.add("Monkey");
		 
		 set.add(null);
		 
		 set.add("lion");
		 System.out.println(set);
		 
		 set.remove("dog");
		 System.out.println(set);
		 System.out.println(set.contains(null));
		
		 System.out.println(set.size());
		 set.clear();
		 System.out.println(set.isEmpty());	 
	}
}

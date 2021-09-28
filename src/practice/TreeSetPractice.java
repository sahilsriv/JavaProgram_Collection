package practice;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {


	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		 set.add("cat");
		
		 set.add("dog");
		 set.add("lion");
		 set.add("Tiger");
		 set.add("Monkey");
		 
//		 set.add(null);
		 
		 set.add("lion");
		 System.out.println(set);
		 
		 set.remove("dog");
		 System.out.println(set);
		 System.out.println(set.contains("dog"));
		
		 System.out.println(set.size());
		 set.clear();
		 System.out.println(set.isEmpty());	 
	}
}

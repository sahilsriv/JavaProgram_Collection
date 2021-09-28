package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class CollectionClassPractice {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(23);
		list.add(23);
		list.add(25);
		list.add(36);
		list.add(68);
		list.add(45);
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.frequency(list,23));
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		
		// For Custom Class
		List<Student>list1 = new ArrayList<>();
		list1.add(new Student("Anuj",2,"UP"));
		list1.add(new Student("Anup",3,"MP"));
		list1.add(new Student("Raj",5,"HP"));
		list1.add(new Student("Rahul",6,"AP"));
		list1.add(new Student("Raman",1,"UP"));
		list1.add(new Student("Rakesh",4,"JH"));
		System.out.println(list1);	
		Collections.sort(list1);
		System.out.println(list1);	
//		Collections.sort(list1, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				 return o1.name.compareTo(o2.name);
//			}
//			
//		});
//		System.out.println(list1);
// Since Comparator is functional interface so we can use lambda function
		Collections.sort(list1, (o1,o2)->  {return o1.name.compareTo(o2.name);});
		System.out.println(list1);
	}

}

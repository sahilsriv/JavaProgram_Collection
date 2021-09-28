package practice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OverridingEqualAndHashCode {

	public static void main(String[] args) {
		Student  student = new Student("Raj",1,"UP");
		Student  student1 = new Student("Jai",2,"UP");
		Student  student2 = new Student("Rahul",1,"MP");
		Set<Student> set = new HashSet<Student>();
		set.add(student);
		set.add(student1);
		set.add(student2);
		System.out.println(set);
		//In set it does not Update previous value, means roll no 1 will be Raj not Rahul but if this is map then it upgrade
		
		
	}

}

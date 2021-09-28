package practice;

import java.util.Objects;

public class Student implements Comparable<Student>{
	String name;
	int rollNo;
	String add;
	public Student(String name, int rollNo, String add) {
		this.name = name;
		this.rollNo = rollNo;
		this.add = add;
	}
	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", add=" + add + "]";
	}

	@Override
	public int compareTo(Student that) {
		return this.rollNo- that.rollNo;
	}	
	
}

package practice;
import java.util.*;
public class ArrayListPractice {
	public static void main(String[] args) {
	 List<Integer> list = new ArrayList<>();
     Scanner sc = new Scanner(System.in);
     int n,element;
     System.out.println("Enter no. of Element to be added in Array list:");
     n=sc.nextInt();
     System.out.println("Enter value of Element to be added in Array list:");
     for (int i = 0; i <n ; i++) {
    	 element = sc.nextInt();
		 list.add(element);
     }
     System.out.println(list);
     list.add(2,5);
     System.out.println(list);
     List<Integer> list1 = new ArrayList<>();
     list1.add(8);
     list1.add(7);
     list.addAll(list1);
     System.out.println(list);
     System.out.println(list.get(1));
     list.set(1,6);
     System.out.println(list);
     list.remove(4);
     System.out.println(list);
     list.remove((Integer)5);
     System.out.println(list);
     System.out.println(list.contains(7));
     for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
     System.out.println();
    for (Integer e : list) {
    	System.out.println(e);
	} 
    System.out.println();
    Iterator<Integer> it  = list.iterator();
   while(it.hasNext()) {
	   System.out.println(it.next());
   }
   list.clear();
   System.out.println(list);
   //list.remove(n);
     sc.close();
	}
}

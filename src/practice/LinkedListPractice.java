package practice;
import java.util.*;

public class LinkedListPractice {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(3);
		queue.offer(103);
		queue.offer(93);
		queue.offer(89);
		queue.add(26);  // try not to use as it may throw exception 
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.element());// try not to use as it may throw exception if empty
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.remove());// try not to use as it may throw exception if empty
		System.out.println(queue);
		
		// to use method of list define as below
		
		List<Integer> list = new LinkedList<>();
		list.add(1);
//		list.offer(2); not allowed
		
		// all function list are allowed with different time complexity
	}

}

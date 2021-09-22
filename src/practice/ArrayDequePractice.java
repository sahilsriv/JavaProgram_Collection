package practice;
import java.util.*;
public class ArrayDequePractice {
	public static void main(String[] args) {
       
		ArrayDeque<Integer> arrdque = new ArrayDeque<>();
        //priority Queue is implemented by min heap
		arrdque.offer(3);
		arrdque.offer(103);
		arrdque.offer(93);
		arrdque.offer(89);
		arrdque.offer(50);
		

		System.out.println(arrdque);

		System.out.println(arrdque.peek());
		System.out.println(arrdque);
		System.out.println(arrdque.peekFirst());
		System.out.println(arrdque);
		System.out.println(arrdque.peekLast());
		System.out.println(arrdque);
		
		System.out.println(arrdque.poll());
		System.out.println(arrdque);
		System.out.println(arrdque.pollFirst());
		System.out.println(arrdque);
		System.out.println(arrdque.pollLast());
		System.out.println(arrdque);
	}
}

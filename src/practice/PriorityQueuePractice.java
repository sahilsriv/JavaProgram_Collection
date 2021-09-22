package practice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {
	public static void main(String[] args) {
        //min priority
		Queue<Integer> pq = new PriorityQueue<>();
        //priority Queue is implemented by min heap
		pq.offer(3);
		pq.offer(103);
		pq.offer(93);
		pq.offer(89);
		pq.add(26); // try not to use as it may throw exception

		System.out.println(pq);

		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.element());// try not to use as it may throw exception if empty
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove());// try not to use as it may throw exception if empty
		System.out.println(pq);
		
		//max priority
		Queue<Integer> pq_rev = new PriorityQueue<>(Comparator.reverseOrder());
		pq_rev.addAll(pq);
		System.out.println(pq_rev);
	}
}

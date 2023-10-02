/**
 * 
 */
package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @author Rupayan Dirghangi
 *
 */
public class QueueInterfaceExample {
	public static void DequeExample() {
		Deque<Integer> dq=new ArrayDeque<>();
		dq.addFirst(1);
		dq.addFirst(2);
		dq.addLast(3);
		dq.addLast(4);
		System.out.println(dq);
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
	}
	public static void priorityQueueExample() {
		//Min Prority Queue
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(4);
		pq.add(5);
		pq.add(7);
		System.out.println(pq.peek());
		System.out.println(pq); // Gurantee - topmost priority element will be processed which is minimum in the queue
		System.out.println(pq.poll());// 4
		System.out.println(pq.peek()); //5
		
		//Max Prority Queue
		PriorityQueue<Integer> maxPq=new PriorityQueue<Integer>(Comparator.reverseOrder());
		maxPq.add(10);
		maxPq.add(4);
		maxPq.add(5);
		maxPq.add(7);
		System.out.println(maxPq.peek());
	}
	public static void queueExample() {
		LinkedList<Integer> q=new LinkedList<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		queueExample();
//		priorityQueueExample();
		DequeExample();

	}

}

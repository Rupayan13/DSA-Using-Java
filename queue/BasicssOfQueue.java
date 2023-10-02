/**
 * 
 */
package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BasicssOfQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Integer> q1=new ArrayDeque<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.size());
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.poll();// It also removes elements from the front
		System.out.println(q);
		System.out.println(q.element());// peek element
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.size());

	}

}

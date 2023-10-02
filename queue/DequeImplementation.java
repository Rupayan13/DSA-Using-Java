/**
 * 
 */
package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class DequeImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dq = new LinkedList<>();
//		dq.addLast(1);
//		dq.addLast(2);
//		dq.addLast(3);
//		dq.addLast(4);
//		dq.addLast(5);
//		dq.addFirst(6);
//		dq.addFirst(7);
//		dq.addFirst(8);
//		System.out.println(dq);
//		dq.removeLast();
//		System.out.println(dq);
//		dq.removeFirst();
//		System.out.println(dq);
//		System.out.println(dq.getFirst());
//		System.out.println(dq.getLast());

		dq.addLast(1);
		dq.addLast(2);
		dq.addLast(1);
		dq.addLast(4);
		dq.addLast(5);
		System.out.println(dq);
		dq.add(6);// last add
		System.out.println(dq);
//		dq.remove();// first remove
//		System.out.println(dq);
//		dq.removeAll(dq);// remove everything
//		System.out.println(dq);
//		dq.removeFirstOccurrence(1);
		System.out.println(dq);
		dq.removeLastOccurrence(1);
		System.out.println(dq);

	}

}

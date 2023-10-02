/**
 * 
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q1 = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		while(q.size()>0) {
			int x=q.remove();
			System.out.println(x);
			q1.add(x);
		}
		while(q1.size()>0) {
			q.add(q1.remove());
		}
		System.out.println(q);

	}

}

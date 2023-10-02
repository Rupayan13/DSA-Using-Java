/**
 * 
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseAQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q);
		Stack<Integer> st=new Stack<Integer>();
		while(q.size()!=0) {
			st.push(q.poll());
		}
		while(st.size()!=0) {
			q.add(st.pop());
		}
		System.out.println(q);
		

	}

}

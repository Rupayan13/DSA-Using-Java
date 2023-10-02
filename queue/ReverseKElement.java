/**
 * 
 */
package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseKElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println("Enter the element of term you want to reverse :");
		int k=sc.nextInt();
		System.out.println("The queue is :-");
		System.out.println(q);
		Stack<Integer> st=new Stack<>();
		for(int i=1;i<=k;i++) {
			st.push(q.remove());
		}
		while(st.size()!=0) {
			q.add(st.pop());
		}
		for(int i=1;i<=q.size()-k;i++) {
			q.add(q.poll());
		}
		System.out.println(q);

	}

}

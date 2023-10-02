/**
 * 
 */
package stacks;

import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PushAtBottom {
	public static void pushAtBottom(Stack<Integer> st, int data) {
		//base case
		if(st.isEmpty()) {
			st.push(data);
			return;
		}
		int x=st.pop();
		//recursive work
		pushAtBottom(st, data);
		//self work
		st.push(x);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		pushAtBottom(st, 6);
		System.out.println(st);
		

	}

}

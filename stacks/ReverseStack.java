/**
 * 
 */
package stacks;

import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseStack {
	public static void reverseIterative(Stack<Integer> st) {
		Stack<Integer> rt=new Stack<>();
		while(st.size()>0) {
			rt.push(st.pop());
		}
		Stack<Integer> at=new Stack<>();
		while(rt.size()>0) {
			at.push(rt.pop());
		}
		while(at.size()>0) {
			st.push(at.pop());
		}
	}
	public static void pushAtBottom(Stack<Integer> st, int data) {
		// base case
		if (st.isEmpty()) {
			st.push(data);
			return;
		}
		int x = st.pop();
		// recursive work
		pushAtBottom(st, data);
		// self work
		st.push(x);

	}
	public static void reverseRecursively(Stack<Integer> st) {
		if(st.size()==1) {
			return;
		}
		int top=st.pop();
		reverseRecursively(st);
		pushAtBottom(st, top);
	}

	public static Stack<Integer> reverse(Stack<Integer> st) {
		// base case
		if(st.isEmpty()) {
			return new Stack<Integer>();
		}
		int x = st.pop();
		// recursive work
		Stack<Integer> ans = reverse(st);
		// self work
		pushAtBottom(ans, x);
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
//		Stack<Integer> ans=reverse(st);
//		System.out.println(ans);
//		reverseIterative(st);
		reverseRecursively(st);
		System.out.println(st);

	}

}

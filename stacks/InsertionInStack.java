/**
 * 
 */
package stacks;

import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class InsertionInStack {

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
		int idx=2;
		int x=7;
		Stack<Integer> rt=new Stack<>();
		while(st.size()>idx) {
			rt.push(st.pop());
		}
		st.push(x);
		while(rt.size()>0) {
			st.push(rt.pop());
		}
		System.out.println(st);

	}

}

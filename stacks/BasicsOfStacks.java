/**
 * 
 */
package stacks;

import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BasicsOfStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> arr=new ArrayList<>();
		Stack<Integer> st=new Stack<>();
		System.out.println(st.isEmpty());
		st.push(1);
		st.push(32);
		st.push(90);
		st.push(5);
		st.push(34);
		System.out.println(st.isEmpty());
		//peek
		System.out.println(st.peek());
		System.out.println(st);
//		st.pop();
//		System.out.println(st);
//		st.pop();
//		System.out.println(st);
		System.out.println("size is "+st.size());
		while(st.size()>2) {
			st.pop();
		}
		System.out.println(st.peek());
		System.out.println(st);

	}

}

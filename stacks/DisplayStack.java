/**
 * 
 */
package stacks;

import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class DisplayStack {
	public static void displayReverseRecursively(Stack<Integer> st) {
		// base case
		if (st.isEmpty()) {
			return;
		}
		// self work
		int top = st.pop();
		System.out.print(top + " ");
		// recursive work
		displayReverseRecursively(st);
		st.push(top);
	}

	public static void displayRecursively(Stack<Integer> st) {
		// base case
		if (st.isEmpty()) {
			return;
		}
		int top = st.pop();
		// recursive work
		displayRecursively(st);
		// self work		
		System.out.print(top + " ");
		st.push(top);
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

//		Display Using Stack

//		Stack<Integer> rt=new Stack<>();
//		while(st.size()>0) {
//			rt.push(st.pop());
//		}
//		while(rt.size()>0) {
//			int x=rt.pop();
//			System.out.print(x+" ");
//			st.push(x);
//		}

//		Display Using array

//		int n=st.size();
//		int arr[]=new int[n];
//		for(int i=n-1;i>=0;i--) {
//			int x=st.pop();
//			arr[i]=x;
//		}
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//			st.push(arr[i]);
//		}

		displayReverseRecursively(st);
		System.out.println();
		displayRecursively(st);

	}

}

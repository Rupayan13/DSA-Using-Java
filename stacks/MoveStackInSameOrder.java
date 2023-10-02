/**
 * 
 */
package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MoveStackInSameOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer> st=new Stack<>();
//		System.out.println("Enter the number of elements you want to insert :");
//		int n=sc.nextInt();
//		System.out.println("Enter the element you want to insert :");
//		for(int i=1;i<=n;i++) {
//			int x=sc.nextInt();
//			st.push(x);
//		}
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		Stack<Integer> rt=new Stack<>();
		while(st.size()>0) {
//			rt.push(st.peek());
//			st.pop();
			
			rt.push(st.pop());
		}
//		System.out.println(rt);
		
		Stack<Integer> gt=new Stack<>();
		while(rt.size()>0) {
			gt.push(rt.pop());
		}
		System.out.println(gt);

	}

}

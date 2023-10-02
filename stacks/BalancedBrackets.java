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
public class BalancedBrackets {
	public static boolean isBalanced(String str) {
		Stack<Character> st=new Stack<>();
		int n=str.length();
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			if(ch=='(') {
				st.push(ch);
			}
			else if(ch==')'){
				if(st.size()==0) {
					return false;
				}
				else if(st.peek()=='('){
					st.pop();
				}
			}
		}
		if(st.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any equation :");
		String str=sc.nextLine();
		System.out.println(isBalanced(str));

	}

}

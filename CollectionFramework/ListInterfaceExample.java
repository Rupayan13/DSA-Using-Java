/**
 * 
 */
package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ListInterfaceExample {
	public static void ArrayListExample() {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println(arr);
		System.out.println(arr.get(1));
		arr.set(1, 10);
		System.out.println(arr);
		System.out.println(arr.contains(10));
	}
	public static void LinkedList() {
		LinkedList<Integer> arr=new LinkedList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println(arr);
		System.out.println(arr.get(1));
		arr.set(1, 10);
		System.out.println(arr);
		System.out.println(arr.contains(10));
	}
	public static void stackExample() {
		Stack<String> st=new Stack<>();
		st.push("PW");
		st.push("Skills");
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.empty());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample();
		LinkedList();
		stackExample();

	}

}

/**
 * 
 */
package hashset;

import java.util.HashSet;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Implementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> st=new HashSet<>();
		st.add("James");
		st.add("Scott");
		st.add("James");
		System.out.println(st);
		System.out.println(st.contains("James"));
		System.out.println(st.size());
		st.remove("James");
		System.out.println(st.contains("James"));
		System.out.println(st.size());
		st.add("Mark");
		for(String s: st) {
			System.out.println(s);
		}
	}

}

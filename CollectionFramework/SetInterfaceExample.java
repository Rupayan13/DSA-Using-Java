/**
 * 
 */
package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SetInterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> st=new HashSet<>();
		st.add(1);
		st.add(2);
		st.add(3);
		System.out.println(st);
		st.add(1);
		st.add(2);
		System.out.println(st);
		st.remove(2);
		System.out.println(st.contains(2));
		System.out.println(st.size());
		st.add(48);
		st.add(15);
		System.out.println(st);
		//Linked Hast set-> It is ordered interface
		LinkedHashSet<Integer> hst=new LinkedHashSet<>();
		
		//Tree Set-> it is sorted
		TreeSet<Integer> tst=new TreeSet<>();
		

	}

}

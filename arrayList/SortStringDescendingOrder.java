/**
 * 
 */
package arrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SortStringDescendingOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(22);
		list.add(10);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

	}

}

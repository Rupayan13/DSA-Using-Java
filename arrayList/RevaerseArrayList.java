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
public class RevaerseArrayList {
	public static void reverseArrayList(ArrayList<Integer> list) {
		int i=0, j=list.size()-1;
		
		while(i<j) {
			Integer temp=Integer.valueOf(list.get(i));
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
	}

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
		System.out.println(list);
//		reverseArrayList(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
		ArrayList<String> l1=new ArrayList<>();
		l1.add("Welcome");
		l1.add("To");
		l1.add("Physics");
		l1.add("Wallah");
		System.out.println("Original List:-"+l1);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("Descending Sorted List:-"+l1);
		

	}

}

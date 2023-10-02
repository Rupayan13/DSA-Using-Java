/**
 * 
 */
package arrayList;

import java.util.ArrayList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class WrapperClasses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer i =new Integer();
		Integer i=Integer.valueOf(4);
		System.out.println(i);
		Float f=Float.valueOf(4.5f);
		System.out.println(f);
		
		ArrayList<Integer> arr1=new ArrayList<Integer>();
//		ArrayList<Boolean> arr2=new ArrayList<>();
//		ArrayList<Float> arr3=new ArrayList<>();
		
		//add element
		arr1.add(5);
		arr1.add(6);
		arr1.add(7);
		arr1.add(8);
		System.out.println(arr1.get(0));
		
		//print with while loop
//		for(int j=0;j<arr1.size();j++) {
//			System.out.print(arr1.get(i)+" ");
//		}
		
		//print without while loop
		System.out.println(arr1);
		
		//add element at a particular index 
		arr1.add(1, 100);
		System.out.println(arr1);
		
		//modifying element at index 1
		arr1.set(1, 10);
		System.out.println(arr1);
		
		//removing element at particular index
		arr1.remove(1);
		System.out.println(arr1);
		
		//removing element e
		arr1.remove(Integer.valueOf(7));
		System.out.println(arr1.remove(Integer.valueOf(17)));
		System.out.println(arr1);
		
		//checking if an element exists
		boolean ans=arr1.contains(Integer.valueOf(6));
		System.out.println(ans);
		
		ArrayList l1=new ArrayList();//We can add any value , any premitive datatypes
		l1.add("Rupayan");
		l1.add(1);
		l1.add(true);
		System.out.println(l1);
		
		

	}

}

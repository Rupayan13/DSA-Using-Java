/**
 * 
 */
package recursion;

import java.util.ArrayList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FindAllIndicesAsAArrayList {
	public static ArrayList<Integer> findIndices(int[] arr, int idx, int x) {
		// base case
		if (idx >= arr.length) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> ans=new ArrayList<Integer>();
		//self work
		if(arr[idx]==x) {
			ans.add(idx);
		}
		//recursive work
		ArrayList<Integer> smallAns=findIndices(arr, idx+1, x);
		
		ans.addAll(smallAns);
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 2, 2, 5 };
		ArrayList<Integer> ans = findIndices(arr, 0, 2);
		for (Integer i : ans) {
			System.out.println(i);
		}

	}

}

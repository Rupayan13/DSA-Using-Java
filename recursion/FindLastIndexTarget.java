/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FindLastIndexTarget {
	public static int printIndex(int[] arr, int idx, int x) { 
		//base case
		if(idx==arr.length)
			return -1;
		//recursive work
		int index=printIndex(arr, idx+1, x);
		//self work
		if(arr[idx]==x && idx>index) {
			return idx;
		}
		else {
			return index;
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12, 14, 16, 14, 18, 14};
		System.out.println(printIndex(arr, 0, 14));

	}

}

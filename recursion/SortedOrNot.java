/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SortedOrNot {
	public static boolean isSorted(int[] arr, int idx) {
		//base case
		if(idx==arr.length-1) {
			return true;
		}
		// self work
		if(arr[idx]<arr[idx+1]) {
			return isSorted(arr, idx+1);
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
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(isSorted(arr, 0));

	}

}

/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MaxValueInAnArray {
	public static int maxValue(int arr[], int idx) {
		//base case
		if(idx==arr.length-1)
			return arr[idx];
		//sub problem
		int max=maxValue(arr, idx+1);
		//self work
		return Math.max(arr[idx], max);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 10, 3, 2, 5};
		System.out.println(maxValue(arr, 0));

	}

}

/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintArrayValues {
	public static void printArray(int[] arr, int idx) {
		//base case
		if(idx==arr.length)
			return;
		//self work
		System.out.println(arr[idx]);
		//sub problem
		printArray(arr, idx+1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 4, 5, 6};
		printArray(arr, 0);
		

	}

}

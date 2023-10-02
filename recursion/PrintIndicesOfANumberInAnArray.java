/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintIndicesOfANumberInAnArray {
	public static void findIndices(int[] arr, int idx, int x) {
		//base case
		if(idx>=arr.length) {
			return;
		}
		//self work
		if(arr[idx]==x) {
			System.out.println(idx);
		}
		//sub problems
		findIndices(arr, idx+1, x);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 2, 2, 5};
		int arr_1[]= {8, 8, 8};
		findIndices(arr_1, 0, 8);

	}

}

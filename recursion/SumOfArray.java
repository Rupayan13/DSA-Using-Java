/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfArray {
	public static int sumOfArray(int arr[], int idx) {
		//base case
		if(idx==arr.length)
			return 0;
		//sub problem
		int sum=sumOfArray(arr, idx+1);
		//self work
		return sum+arr[idx];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 3, 5, 20, 1};
		int arr_1[]= {1, 2, 3, 4, 5, 6};
		System.out.println(sumOfArray(arr, 0));
		System.out.println(sumOfArray(arr_1, 0));

	}

}

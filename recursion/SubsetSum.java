/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SubsetSum {
	public static void subsetSum(int[] a, int idx, int currSum) {
		//base case
		if(idx>=a.length) {
			System.out.println(currSum);
			return;
		}
		
		//curr idx+ curr sum
		subsetSum(a, idx+1, currSum+a[idx]);
		
		//curr sum
		subsetSum(a, idx+1, currSum);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 4, 5};
		subsetSum(arr, 0, 0);

	}

}

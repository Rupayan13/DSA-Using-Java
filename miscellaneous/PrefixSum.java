/**
 * 
 */
package miscellaneous;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrefixSum {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void prefixSum(int arr[]) {
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=arr[i-1]+arr[i];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 4, 5};
		prefixSum(arr);
		printArray(arr);

	}

}

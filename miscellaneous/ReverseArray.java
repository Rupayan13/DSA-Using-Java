/**
 * 
 */
package miscellaneous;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseArray {
	public static void reverseArray(int arr[], int l, int r) {
		r--;
		int len=(r+l)/2;
		for(int i=0;i<=len;i++) {
			int temp=arr[r];
			arr[r]=arr[l];
			arr[l]=temp;
			l++;
			r--;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 4, 5, 6};
		reverseArray(arr, 0, arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}

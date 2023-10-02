/**
 * 
 */
package searching;

/**
 * @author Rupayan Dirghangi
 *
 */
public class IndexOfMinimumElement {
	public static int minElement(int arr[]) {
		int st=0;
		int end=arr.length-1;
		int n=arr.length;
		int ans=-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(arr[mid]>arr[n-1]) {
				st=mid+1;
			}
			else {
				ans=mid;
				end=mid-1;
			}
		}
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[]= {3, 4, 5, 6, 1, 2};
		System.out.println(minElement(arr));

	}

}

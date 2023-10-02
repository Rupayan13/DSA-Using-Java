/**
 * 
 */
package searching;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FirstOccurance {
	public static int lastOccurance(int arr[], int x) {
		int lo=-1;
		int st=0, end=arr.length-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(arr[mid]==x) {
				lo=mid;
				st=mid+1;
			}
			else if(arr[mid]>x) {
				end=mid-1;
			}
			else {
				st=mid+1;
			}
		}
		return lo;
	}
	public static int firstOccurance(int arr[], int x) {
		int fo=-1;
		int st=0, end=arr.length-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(arr[mid]==x) {
				fo=mid;
				end=mid-1;
			}
			else if(arr[mid]>x) {
				end=mid-1;
			}
			else {
				st=mid+1;
			}
		}
		return fo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 5, 5, 5, 6, 6, 6, 8, 9, 9, 9};
		System.out.println(firstOccurance(arr, 5));
		System.out.println(lastOccurance(arr, 5));

	}

}

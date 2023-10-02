/**
 * 
 */
package searching;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BinarySearch {
	public static boolean recursiveBinarySearch(int arr[], int st, int end, int target) {
		//base case
		if(st>end) {
			return false;
		}
		//self work
		int mid=(st+end)/2;
		if(arr[mid]==target) {
			return true;
		}
		//recursive work
		else if(arr[mid]>target) {
			return recursiveBinarySearch(arr, st, mid-1, target);
		}
		else{
			return recursiveBinarySearch(arr, mid+1, end, target);
		}
	}
	public static boolean binarySearch(int arr[], int target) {
		int n=arr.length;
		int st=0;
		int end=n-1;
		while(st<=end) {
			int mid=(st+end)/2;
			if(arr[mid]>target) {
				end=mid-1;
			}
			else if(arr[mid]<target) {
				st=mid+1;
			}
			else if(arr[mid]==target) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 3, 4, 5};
		int target=4;
		System.out.println(binarySearch(a, target));
		System.out.println(recursiveBinarySearch(a, 0, a.length-1, target));

	}

}

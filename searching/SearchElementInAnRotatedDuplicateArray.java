/**
 * 
 */
package searching;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SearchElementInAnRotatedDuplicateArray {
	public static int indexOfTargetElement(int arr[], int target) {
		int st=0, end=arr.length-1;
		int n=arr.length;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]==arr[st] && arr[mid]==arr[end]) {
				st--;
				end++;
			}
			else if(arr[mid]<=arr[end]){//mid to end is sorted
				if(target>arr[mid] && target<=arr[end]) {
					st=mid+1;
				}
				else {
					end=mid-1;
				}
			}
			else {
				if(target>=arr[st] && target<arr[mid]) {//start to end is sorted
					end=mid-1;
				}
				else {
					st=mid+1;
				}
			}
		}
		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 1, 1, 2, 2, 3, 1};
		System.out.println(indexOfTargetElement(arr, 2));

	}

}

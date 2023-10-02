/**
 * 
 */
package miscellaneous;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SortOddsAndEvens {
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void swap(int arr[], int l, int r) {
		int temp = arr[r];
		arr[r] = arr[l];
		arr[l] = temp;
	}

	public static void sortOddsAndEvens(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if(arr[left]%2==0) {
				left++;
			}
			if(arr[right]%2!=0) {
				right--;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 4, 5, 6};
		sortOddsAndEvens(arr);
		printArray(arr);

	}

}

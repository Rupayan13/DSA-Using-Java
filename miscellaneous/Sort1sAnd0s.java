/**
 * 
 */
package miscellaneous;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Sort1sAnd0s {
	public static void swap(int arr[], int l, int r) {
		int temp=arr[r];
		arr[r]=arr[l];
		arr[l]=temp;
	}
	public static void sortZeroesAndOnes(int arr[]) {
		int zeroes = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				zeroes++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < zeroes) {
				arr[i] = 0;
			} else {
				arr[i] = 1;
			}
		}

	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void sort1sAnd0s(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}
	public static void sortZeroesOnes(int arr[]) {
		int left=0;
		int right=arr.length-1;
		while(left < right) {
			if(arr[left]==1 && arr[right]==0) {
				swap(arr, left, right);
				left++;
				right--;
			}
			if(arr[left]==0) {
				left++;
			}
			if(arr[right]==1) {
				right--;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 0, 0, 1, 0, 1, 1, 0, 0 };
//		sort1sAnd0s(arr);
//		sortZeroesAndOnes(arr);
		sortZeroesOnes(arr);
		printArray(arr);

	}

}

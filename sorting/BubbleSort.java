/**
 * 
 */
package sorting;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BubbleSort {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		// n-1 iteration/ passes
		for (int i = 0; i < n - 1; i++) {
			boolean flag = false; // has any swapping happen
			for (int j = 0; j < n - i - 1; j++) {
				// last i elements are already at correct sorted positions.So, no need to check
				// them.
				if (arr[j] > arr[j + 1]) {
					// swap -arr[j], arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (flag == false) {// have any swap happen
				return;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 6, 5, 4, 3 };
		printArray(arr);
		bubbleSort(arr);
		System.out.println();
		printArray(arr);

	}

}

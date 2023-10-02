/**
 * 
 */
package sorting;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SelectionSort {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {// i represents current index
			// find the minimum element in the unsorted part of the array
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// swap current elemet and minimum element
			// arr[minIndex], arr[i]
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
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
		selectionSort(arr);
		System.out.println();
		printArray(arr);

	}

}

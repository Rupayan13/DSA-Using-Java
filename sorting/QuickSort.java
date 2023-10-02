/**
 * 
 */
package sorting;

/**
 * @author Rupayan Dirghangi
 *
 */
public class QuickSort {
	public static void swap(int[] arr, int x, int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static int partition(int arr[], int start, int end) {
		int pivot=arr[start];
		int eleLessThanPivot=0;
		for(int i=start+1;i<=end;i++) {
			if(arr[i]<=pivot) {
				eleLessThanPivot++;
			}
		}
		int pivotIndex=start+eleLessThanPivot;
		swap(arr, start, pivotIndex);
		int i=start;
		int j=end;
		//elements lesser or equal left, greater->right side of pivotIndex
		while(i<pivotIndex && j>pivotIndex) {
			while(arr[i]<=pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			if(i<pivotIndex && j>pivotIndex) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		
		return pivotIndex;
	}
	public static void quickSort(int[] arr, int start, int end) {
		//base case
		if(start>=end) {
			return;
		}
		
		//self work
		int pi=partition(arr, start, end);
		
		//recursive work
		quickSort(arr, start, pi-1);
		quickSort(arr, pi+1, end);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 20, 4, 11, 8, 2 };
		System.out.println("Array before sorting :-");
		printArray(arr);
		System.out.println();
		int n = arr.length;
		quickSort(arr, 0, n - 1);
		System.out.println("Array after sorting :-");
		printArray(arr);

	}

}

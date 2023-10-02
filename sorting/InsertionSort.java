/**
 * 
 */
package sorting;

/**
 * @author Rupayan Dirghangi
 *
 */
public class InsertionSort {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				//swap arr[j], arr[j-1]
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 3, 6, 5, 4, 2 };
		printArray(arr);
		insertionSort(arr);
		System.out.println();
		printArray(arr);

	}

}

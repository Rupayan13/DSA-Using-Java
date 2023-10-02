/**
 * 
 */
package miscellaneous;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SortedSquareArray {
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] sortedSquareArray(int arr[]) {
		int left=0;
		int right=arr.length-1;
		int j=arr.length-1;
		int a[]=new int[arr.length];
		while(left<=right) {
			if(Math.abs(arr[right])>=Math.abs(arr[left])) {
				a[j]=arr[right]*arr[right];
				j--;
				right--;
			}
			else{
				a[j]=arr[left]*arr[left];
				j--;
				left++;
			}
		}
		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-10, -3, -2, 1, 4, 5};
		int a[]=sortedSquareArray(arr);
		printArray(a);

	}

}

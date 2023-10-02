/**
 * 
 */
package sorting;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MoveZeroes {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void moveZeroes(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean flag=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]==0 && arr[j+1]!=0) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) {
				return;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 10, 5, 0, 4 };
		printArray(arr);
		moveZeroes(arr);
		System.out.println();
		printArray(arr);

	}

}

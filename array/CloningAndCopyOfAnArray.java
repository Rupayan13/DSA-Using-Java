/**
 * 
 */
package array;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CloningAndCopyOfAnArray {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		arr[0]=5;
		arr[1]=6;
		arr[2]=7;
		arr[3]=8;
		arr[4]=9;
		printArray(arr);
		int arr2[]=arr;
		System.out.println();
		printArray(arr2);
		//changing some values of arr2
		arr2[0]=0;
		arr2[1]=0;
		System.out.println("Original array");
		printArray(arr);
		System.out.println("Changing array2:");
		printArray(arr2);

	}

}

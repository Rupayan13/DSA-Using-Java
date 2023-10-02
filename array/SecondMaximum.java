/**
 * 
 */
package array;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SecondMaximum {
	public static int max(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}
	public static int secondMax(int arr[]) {
		int max=max(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int secondMax=max(arr);
		return secondMax;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 4, 1, 6, 2};
//		int max=Integer.MIN_VALUE;
//		int secondMax=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++)
//		{
//			max=Math.max(max, arr[i]);
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>secondMax && arr[i]<max) {
//				secondMax=arr[i];
//			}
//		}
//		System.out.println("Second maximum is "+secondMax);

		System.out.println("Second Maximum is "+secondMax(arr));
	}

}

/**
 * 
 */
package array;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FirstRepeatingValue {
	public static int firstRepeatingValue(int arr[]) {
		int num=-1;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					num=arr[i];
					return num;
				}
			}
		}
		return num;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 5, 3, 4, 6, 3, 4};
		System.out.println("First repeating value is "+firstRepeatingValue(arr));

	}

}

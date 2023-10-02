/**
 * 
 */
package array;

/**
 * @author Rupayan Dirghangi
 *
 */
public class UniqueValue {
	public static int uniqueEle(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		int ans=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				ans=arr[i];
			}
		}
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 4, 3, 2, 1};
		System.out.println("The unique element is "+uniqueEle(arr));

	}

}

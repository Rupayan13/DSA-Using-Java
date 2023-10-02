/**
 * 
 */
package searching;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SquareRoot {
	public static int squareRoot(int n) {
		int st=1;
		int end=n;
		int ans=0;
		while(st<=end) {
			int mid=st+(end-st)/2;
			int val=mid*mid;
			if(val==n) {
				return mid;
			}
			else if(val>n) {
				end=mid-1;
			}
			else {
				ans=mid;
				st=mid+1;
			}
		}
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(24));

	}

}

/**
 * 
 */
package searching;

/**
 * @author Rupayan Dirghangi
 *
 */
public class DistributeChocolates {
	public static boolean isDivisionPossible(int a[], int m, int mxChocAllowed) {
		int numOfStudents=1;
		int choc=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>mxChocAllowed) {
				return false;
			}
			if(choc+a[i]<=mxChocAllowed) {
				choc+=a[i];
			}
			else {
				numOfStudents++;
				choc=a[i];
			}
		}
		return numOfStudents<=m;
	}
	public static int distributeChocolates(int a[], int m) {
		if(a.length<m) {
			return -1;
		}
		int ans=0, st=1, end=(int)1e9;
		
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(isDivisionPossible(a, m, mid)) {
				ans=mid;
				end=mid-1;
			}else {
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
		int a[]= {12, 34, 67, 90};
		int m=2;
		System.out.println(distributeChocolates(a, m));

	}

}

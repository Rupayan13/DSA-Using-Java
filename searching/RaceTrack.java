/**
 * 
 */
package searching;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RaceTrack {
	public static boolean isPossible(int a[], int k, int dist) {
		int kidsPlaced=1;
		int lastKid=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]-lastKid>=dist) {
				kidsPlaced++;
				lastKid=a[i];
			}
		}
		return kidsPlaced>=k;
	}

	public static int raceTrack(int a[], int k) {
		if (k > a.length) {
			return -1;
		}
		int st = 0, end = (int) 1e9;
		int ans = -1;
		while (st <= end) {
			int mid = st + (end - st) / 2;
			if (isPossible(a, k, mid)) {
				ans = mid;
				st = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 4, 8, 9 };
		int k = 3;
		System.out.println(raceTrack(a, k));

	}

}

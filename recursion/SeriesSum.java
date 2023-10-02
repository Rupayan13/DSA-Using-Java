/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SeriesSum {
	public static int seriesSum(int n) {
		if(n==0) {
			return 0;
		}
		return seriesSum(n-1)+n;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(seriesSum(5));

	}

}

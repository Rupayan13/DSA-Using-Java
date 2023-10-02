/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class GCD {
	public static int bruteforce(int x, int y) {
		int sht=Math.min(x, y);
		int gcd=0;
		for(int i=1;i<=sht;i++) {
			if(x%i==0 && y%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	
	public static int longDivision(int x, int y) {
		while(x%y!=0) {
			int rem=x%y;
			x=y;
			y=rem;
		}
		return y;
	}
	public static int euclidsAlgorithm(int x, int y) {
		//base case
		if(y==0) {
			return x;
		}
		//sub problems
		return euclidsAlgorithm(y, x%y);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bruteforce(2, 6));
		System.out.println(longDivision(15, 24));
		System.out.println(euclidsAlgorithm(15, 24));
		System.out.println("LCM is "+(15*24)/euclidsAlgorithm(15, 24));

	}

}

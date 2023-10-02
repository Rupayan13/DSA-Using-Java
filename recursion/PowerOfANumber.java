/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PowerOfANumber {
	public static int pow(int p, int q) {
		if(q==0) {
			return 1;
		}
		//sub problems
		int smallAns=pow(p, q-1);
		//self work
		int ans=smallAns*p;
		return ans;
	}
	public static int power(int p, int q) {
		//base case
		if(q==0) return 1;
		//smaller problems
		int smallPow=power(p, q/2);
		if(q%2==0) {
			return smallPow*smallPow;
		}
		else {
			return smallPow*smallPow*p;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(5, 4));
		System.out.println(power(5, 3));

	}

}

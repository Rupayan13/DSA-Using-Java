/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfDigits {
	public static int sumOfDigits(int n) {
		//base case
		if(n>=0 && n<=9) {//n==0 return 0
			return n;
		}
		//sub problems
		int smallAns=sumOfDigits(n/10);
		//self work
		int ans=smallAns+(n%10);
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(121415));

	}

}

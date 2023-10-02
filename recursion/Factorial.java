/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Factorial {
	public static int facorial(int n) {
		//Base Case
		if(n==0) {
			return 1;
		}
		//Smaller subproblem
		int smallAns=facorial(n-1);
		
		//self work
		int ans=n*smallAns;
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(facorial(5));

	}

}

/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfNaturalNumbersAlternateSigns {
	public static int sumOfNumbers(int n) {
		int sum=0;
		//base case
		if(n==0) {
			return 0;
		}
		//small problem
		sum+=sumOfNumbers(n-1);
		//self work
		if(n%2==0) {
			sum-=n;
		}
		else {
			sum+=n;
		}
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNumbers(10));

	}

}

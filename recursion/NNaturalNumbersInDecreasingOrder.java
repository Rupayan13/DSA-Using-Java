/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class NNaturalNumbersInDecreasingOrder {
	public static void printDecreasing(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDecreasing(5);

	}

}

/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FrogJump {
	public static int best(int h[], int n, int idx) {
		if (idx == n - 1)
			return 0;
		int op1 = Math.abs(h[idx] - h[idx + 1]) + best(h, n, idx + 1);
		if (idx == n - 2) {
			return op1;
		}
		int op2 = Math.abs(h[idx] - h[idx + 2]) + best(h, n, idx + 2);
		return Math.min(op1, op2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] h = { 10, 30, 40, 20 };
		System.out.println(best(h, h.length, 0));

	}

}

/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PreInPost {
	public static void pip(int n) {
		if(n==0) return;
		System.out.println("Pre "+n);
		pip(n-1);
		System.out.println("In "+n);
		pip(n-1);
		System.out.println("Post "+n);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pip(2);

	}

}

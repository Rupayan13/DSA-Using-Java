/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MinValueOfTheTree {
	public static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}
	public static int minValue(Node root) {
		//base case
		if(root==null) return Integer.MAX_VALUE;
		return Math.min(root.val, Math.min(minValue(root.left), minValue(root.right)));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		root.left = a;
		root.right = b;
		Node c = new Node(4);
		Node d = new Node(5);
		a.left = c;
		a.right = d;
		Node e = new Node(6);
		Node f = new Node(9);
		System.out.println(minValue(root));

	}

}

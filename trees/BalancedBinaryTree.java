/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BalancedBinaryTree {
	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public static int height(Node root) {
		if (root == null || (root.left == null && root.right == null)) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}

	public static boolean isBalanced(Node root) {
		if (root == null)
			return true;
		int lh = height(root.left);
		int rh = height(root.right);
		if (Math.abs(rh - lh) > 1)
			return false;
		return isBalanced(root.left) && isBalanced(root.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(3);
		Node a = new Node(9);
		Node b = new Node(20);
		root.left = a;
		root.right = b;
		Node c = new Node(15);
		Node d = new Node(7);
		b.left = c;
		b.right = d;
		System.out.println(isBalanced(root));

	}

}

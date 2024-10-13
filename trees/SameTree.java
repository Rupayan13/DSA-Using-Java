/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SameTree {
	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public static boolean isSameTree(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		if (root1.data != root2.data)
			return false;
		return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first tree
		Node root1 = new Node(1);
		Node a1 = new Node(2);
		Node b1 = new Node(3);
		root1.left = a1;
		root1.right = b1;

		// second tree
		Node root2 = new Node(1);
		Node a2 = new Node(2);
		Node b2 = new Node(3);
		root2.left = a2;
		root2.right = b2;
		System.out.println(isSameTree(root1, root2));

	}

}

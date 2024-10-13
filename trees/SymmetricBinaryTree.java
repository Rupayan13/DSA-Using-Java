/**
 * 
 */
package trees;

/**
 * 
 */
public class SymmetricBinaryTree {
	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node invertBinaryTree(Node root) {
		if (root == null)
			return null;
		if (root.left == null && root.right == null)
			return root;
		Node leftNode = invertBinaryTree(root.right);
		Node rightNode = invertBinaryTree(root.left);
		root.left = leftNode;
		root.right = rightNode;
		return root;
	}

	public static boolean isSame(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;
		if (root1.data != root2.data)
			return false;
		return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
	}

	public static boolean isSymmetric(Node root) {
		Node temp = invertBinaryTree(root.right);
		return isSame(root.left, temp);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node a = new Node(2);
		Node b = new Node(2);
		root.left = a;
		root.right = b;
		Node c = new Node(3);
		Node d = new Node(4);
		a.left = c;
		a.right = d;
		Node e = new Node(4);
		Node f = new Node(3);
		b.left = e;
		b.right = f;
		Node g = new Node(5);
		c.right = g;
		Node h = new Node(5);
		f.left = h;
		System.out.println(isSymmetric(root));

	}

}

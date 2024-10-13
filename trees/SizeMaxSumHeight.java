/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SizeMaxSumHeight {
	static int size = 0;

	public static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}

	public static int height(Node root) {
		if (root == null)
			return 0;
		// leaf node
		if (root.left == null && root.right == null)
			return 0;
		return 1 + Math.max(height(root.left), height(root.right));
	}

	public static int max(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		return Math.max(root.val, Math.max(max(root.left), max(root.right)));
	}

	public static int sumOf(Node root) {
		if (root == null)
			return 0;
		return root.val + sumOf(root.left) + sumOf(root.right);
	}

	public static int sizeOf(Node root) {
		if (root == null)
			return 0;
		// self work
		int size = 1;
		// recursive work
		return sizeOf(root.left) + sizeOf(root.left) + size;
	}

	public static void preorder(Node root) {
		if (root == null)
			return;
		// self work
//		System.out.print(root.val+" ");
		size++;
		// recursive work
		preorder(root.left);
		preorder(root.right);
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
		e.left = f;
		b.right = e;
		preorder(root);
		System.out.println(sizeOf(root));
		System.out.println(sumOf(root));
		System.out.println(max(root));
		System.out.println(height(root));

	}

}

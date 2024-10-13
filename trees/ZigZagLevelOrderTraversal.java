/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ZigZagLevelOrderTraversal {
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
		return 1 + Math.max(height(root.left), height(root.right));
	}

	public static void NthLevelEementsOdd(Node root, int n) {
		if (root == null)
			return;
		if (n == 1) {
			System.out.print(root.val + " ");
			return;
		}
		NthLevelEementsOdd(root.left, n - 1);
		NthLevelEementsOdd(root.right, n - 1);
	}

	public static void NthLevelEementsEven(Node root, int n) {
		if (root == null)
			return;
		if (n == 1) {
			System.out.print(root.val + " ");
			return;
		}
		NthLevelEementsEven(root.right, n - 1);
		NthLevelEementsEven(root.left, n - 1);
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
		b.left = e;
		Node f = new Node(7);
		Node g = new Node(8);
		d.left = f;
		d.right = g;
		for (int i = 1; i <= height(root); i++) {
			if (i % 2 == 0) {
				NthLevelEementsEven(root, i);
			} else {
				NthLevelEementsOdd(root, i);
			}
			System.out.println();
		}

	}

}

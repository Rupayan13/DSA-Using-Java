/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Traversals {
	public static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}

	public static void preorder(Node root) {
		// preorder is root left right
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root) {
		// inorder is left root right
		if (root == null) {
			return;
		}
		preorder(root.left);
		System.out.print(root.val + " ");
		preorder(root.right);
	}

	public static void postorder(Node root) {
		// postorder is left right root
		if (root == null) {
			return;
		}
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.val + " ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(2);
		Node a = new Node(4);
		Node b = new Node(10);
		root.left = a;
		root.right = b;
		Node c = new Node(6);
		Node d = new Node(5);
		a.left = c;
		a.right = d;
		Node e = new Node(8);
		Node f = new Node(11);
		b.left = e;
		b.right = f;
		System.out.println("Preorder Traversal:-");
		preorder(root);
		System.out.println("\nInorder Traversal:-");
		inorder(root);
		System.out.println("\nPostorder Traversal:-");
		postorder(root);

	}

}

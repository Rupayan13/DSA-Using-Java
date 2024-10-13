/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LowestCommonAncestor {
	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public static boolean contains(Node root, Node node) {
		if (root == null)
			return false;
		if (root == node)
			return true;
		return contains(root.left, node) || contains(root.right, node);
	}

	public static Node lowestCommonAncestor(Node root, Node p, Node q) {
		if (p == root || q == root)
			return root;
		if (p == q)
			return p;
		boolean leftp = contains(root.left, p);
		boolean rightq = contains(root.right, q);
		if ((leftp && rightq) || (!leftp && !rightq))
			return root;
		if (leftp && !rightq)
			return lowestCommonAncestor(root.left, p, q);
		if (!leftp && rightq)
			return lowestCommonAncestor(root.right, p, q);
		return root;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(3);
		Node a = new Node(5);
		Node b = new Node(1);
		root.left = a;
		root.right = b;
		Node c = new Node(6);
		Node d = new Node(2);
		a.left = c;
		a.right = d;
		Node e = new Node(0);
		Node f = new Node(8);
		b.left = e;
		b.right = f;
		Node g = new Node(7);
		Node h = new Node(4);
		d.left = g;
		d.right = h;
		Node temp = lowestCommonAncestor(root, c, h);
		System.out.println(temp.data);

	}

}

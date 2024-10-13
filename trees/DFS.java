/**
 * 
 */
package trees;

import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class DFS {
	public static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}

	public static void inorder(Node root) {
		// base case
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	public static void dfsInorder(Node root) {
		Stack<Node> st = new Stack<>();
		if (root == null) {
			return;
		}
		st.push(root);
		while (!st.isEmpty()) {
			Node temp = st.peek();
			if (temp.left != null) {
				st.push(temp.left);
				temp.left = null;
			} else {
				st.pop();
				System.out.print(temp.val + " ");
				if (temp.right != null) {
					st.push(temp.right);
					temp.right = null;
				}
			}
		}
	}

	public static void dfsPreorder(Node root) {
		Stack<Node> st = new Stack<>();
		if (root != null)
			st.push(root);
		while (!st.isEmpty()) {
			Node temp = st.pop();
			System.out.print(temp.val + " ");
			if (temp.right != null) {
				st.push(temp.right);
			}
			if (temp.left != null) {
				st.push(temp.left);
			}
		}
	}

	public static void dfsPostorder(Node root) {
		Stack<Node> st = new Stack<>();
		Stack<Node> out = new Stack<>();
		if (root != null)
			st.push(root);
		while (!st.isEmpty()) {
			Node temp = st.pop();
			out.push(temp);
			if (temp.left != null) {
				st.push(temp.left);
			}
			if (temp.right != null) {
				st.push(temp.right);
			}
		}
		while (!out.isEmpty()) {
			System.out.print(out.pop().val + " ");
		}
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
		inorder(root);
		System.out.println();
		dfsInorder(root);

	}

}

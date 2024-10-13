/**
 * 
 */
package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BFS {
	public static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}

	// breath first search
	public static void bfs(Node root) { // Iterative form
		Queue<Node> q = new LinkedList<>();
		if (root != null)
			q.add(root);
		while (q.size() > 0) {
			Node temp = q.peek();
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
			System.out.print(temp.val + " ");
			q.remove();
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
		bfs(root);

	}

}

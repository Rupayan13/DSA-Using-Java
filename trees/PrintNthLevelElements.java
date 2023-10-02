/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintNthLevelElements {
	public static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
	}
	public static int height(Node root) {
		if(root==null) return 0;
		if(root.left==null && root.right==null) return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}
	public static void NthLevelEements(Node root, int n) {
		if(root==null) return;
		if(n==1) {
			System.out.print(root.val+" ");
			return;
		}
		NthLevelEements(root.left, n-1);
		NthLevelEements(root.right, n-1);
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
		int level=height(root)+1;
		for(int i=1;i<=level;i++) {
			NthLevelEements(root, i);//O(n)
			System.out.println();
		}
		//O(n*log n)

	}

}

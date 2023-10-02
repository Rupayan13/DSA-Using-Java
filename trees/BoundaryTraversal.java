/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BoundaryTraversal {
	public static class Node{
		int val;
		Node left;
		Node right;
		Node(int val){
			this.val=val;
		}
	}
	public static void boundaryDisplay(Node root) {
		leftBoundary(root);
		bottomBoundary(root);
		rightBoundary(root.right);
	}
	public static void leftBoundary(Node root) {
		if(root==null) return;
		if(root.left==null && root.right==null) return;
		System.out.print(root.val+" ");
		if(root.left!=null) leftBoundary(root.left);
		else leftBoundary(root.right);
	}
	public static void bottomBoundary(Node root) {
		if(root==null) return;
		if(root.left==null && root.right==null) {
			System.out.print(root.val+" ");
			return;
		}
		bottomBoundary(root.left);
		bottomBoundary(root.right);
	}
	public static void rightBoundary(Node root) {
		if(root==null) return;
		if(root.left==null && root.right==null) return;
		if(root.right!=null) rightBoundary(root.right);
		else rightBoundary(root.left);
		System.out.print(root.val+" ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		Node a=new Node(7);
		Node b=new Node(9);
		root.left=a;
		root.right=b;
		Node c=new Node(2);
		Node d=new Node(6);
		a.left=c;
		a.right=d;
		Node e=new Node(0);
		b.right=e;
		Node f=new Node(8);
		Node g=new Node(7);
		d.left=f;
		d.right=g;
		Node h=new Node(13);
		e.left=h;
		boundaryDisplay(root);

	}

}

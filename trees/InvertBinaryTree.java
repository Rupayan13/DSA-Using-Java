/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class InvertBinaryTree {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	public static int height(Node root) {
		if(root==null) return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}
	public static void levelOrderTraversal(Node root, int n) {
		if(root==null) return;
		if(n==1) {
			System.out.print(root.data+" ");
		}
		levelOrderTraversal(root.left, n-1);
		levelOrderTraversal(root.right, n-1);
	}
	public static Node invertABinaryTree(Node root) {
		if(root==null) return null;
		if(root.left==null && root.right==null) return root;
		Node newLeft=invertABinaryTree(root.right);
		Node newRight=invertABinaryTree(root.left);
		root.left=newLeft;
		root.right=newRight;
		return root;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(4);
		Node a=new Node(2);
		Node b=new Node(7);
		root.left=a;
		root.right=b;
		Node c=new Node(1);
		Node d=new Node(3);
		a.left=c;
		a.right=d;
		Node e=new Node(6);
		Node f=new Node(9);
		b.left=e;
		b.right=f;
		System.out.println("Before Inverting:-");
		for(int i=1;i<=height(root);i++) {
			levelOrderTraversal(root, i);
			System.out.println();
		}
		Node temp=invertABinaryTree(root);
		System.out.println("\nAfter Inverting:-");
		for(int i=1;i<=height(temp);i++) {
			levelOrderTraversal(temp, i);
			System.out.println();
		}

	}

}

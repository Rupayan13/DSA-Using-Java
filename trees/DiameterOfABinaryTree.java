/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class DiameterOfABinaryTree {
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
		if(root.left==null && root.right==null) return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}
	public static int diameter(Node root) {
		if(root==null) return 0;
		if(root.left==null && root.right==null) return 0;
		int leftAns=height(root.left);
		int rightAns=height(root.right);
		int mid=leftAns+rightAns;
		if(root.left!=null) mid++;
		if(root.right!=null) mid++;
		return Math.max(leftAns, Math.max(rightAns, mid));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		Node a=new Node(2);
		Node b=new Node(3);
		root.left=a;
		root.right=b;
		Node c=new Node(4);
		Node d=new Node(5);
		a.left=c;
		a.right=d;
		Node e=new Node(6);
		b.left=e;
		Node f=new Node(7);
		Node g=new Node(8);
		d.left=f;
		d.right=g;
		System.out.println(diameter(root));

	}

}

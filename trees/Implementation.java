/**
 * 
 */
package trees;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Implementation {
	public static class Node{
		int val;
		Node left;
		Node right;
		Node(int val){
			this.val=val;
		}
	}
	public static void display(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.val+" -> ");
		if(root.left!=null) System.out.print(root.left.val+" , ");
		if(root.right!=null) System.out.print(root.right.val);
		System.out.println();
		//It is for preorder traversal
		display(root.left);
		display(root.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(2);
		Node a=new Node(4);
		Node b=new Node(10);
		root.left=a;
		root.right=b;
		Node c=new Node(6);
		Node d=new Node(5);
		a.left=c;
		a.right=d;
		Node e=new Node(11);
		b.right=e;
		
		display(root);
	}

}

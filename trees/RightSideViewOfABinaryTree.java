/**
 * 
 */
package trees;

import java.util.ArrayList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RightSideViewOfABinaryTree {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	public static int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
	public static void rightSideView(Node root, ArrayList<Integer> ans, int level){
		if(root==null) return;
		ans.set(level-1, root.data);
		rightSideView(root.left, ans, level+1);
		rightSideView(root.right, ans, level+1);
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
		Node f=new Node(7);
		b.left=e;
		b.right=f;
		Node g=new Node(8);
		c.right=g;
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<height(root);i++) {
			ans.add(0);
		}
		rightSideView(root, ans, 1);
		System.out.println(ans);

	}

}

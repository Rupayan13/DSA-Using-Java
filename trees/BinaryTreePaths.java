/**
 * 
 */
package trees;

import java.util.ArrayList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BinaryTreePaths {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	public static void helper(Node root, ArrayList<String> ans, String s) {
		if(root==null) return;
		if(root.left==null && root.right==null) {
			s+=root.data;
			ans.add(s);
			return;
		}
		helper(root.left, ans, s+root.data+"->");
		helper(root.right, ans, s+root.data+"->");
	}
	public static ArrayList<String> binaryTreePaths(Node root){
		ArrayList<String> ans=new ArrayList<>();
		helper(root, ans, "");
		return ans;
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
		ArrayList<String> ans=binaryTreePaths(root);
		System.out.println(ans);

	}

}

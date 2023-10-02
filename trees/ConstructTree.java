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
public class ConstructTree {
	public static class Node{
		int val;
		Node left;
		Node right;
		Node(int val){
			this.val=val;
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
	public static Node constructBFS(String arr[]) {
		int x=Integer.parseInt(arr[0]);
		int n=arr.length;
		Node root=new Node(x);
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		int i=1;
		while(i<n-1) {
			Node temp=q.remove();
			Node left=new Node(0);
			Node right=new Node(0);
			if(arr[i].equals("")) {
				left=null;
			}else {
				int l=Integer.parseInt(arr[i]);
				left.val=l;
				q.add(left);
			}
			if(arr[i+1].equals("")) {
				right=null;
			}else {
				int r=Integer.parseInt(arr[i+1]);
				right.val=r;
				q.add(right);
			}
			temp.left=left;
			temp.right=right;
			i+=2;
		}
		return root;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"1","2","3","4","5","","6","","7","","","8","","","","9",""};
		Node root=constructBFS(arr);
		int level=height(root)+1;
		for(int i=1;i<=level;i++) {
			NthLevelEements(root, i);//O(n)
			System.out.println();
		}

	}

}

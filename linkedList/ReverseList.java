/**
 * 
 */
package linkedList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseList {
	public static Node reverseIterative(Node head) {
		Node prev=null;
		Node curr=head;
		Node after=null;
		while(curr!=null) {
			after=curr.next;
			curr.next=prev;
			prev=curr;
			curr=after;
		}
		return prev;
	}
	public static Node reverse(Node head) {
		//base case
		if(head.next==null) {
			return head;
		}
		//Recursive work
		Node temp=reverse(head.next);
		//self work
		head.next.next=head;
		head.next=null;
		return temp;
	}
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static void displayReverse(Node head) {
		//base case
		if(head==null) {
			return;
		}		
		//recursive work
		displayReverse(head.next);
		//self work
		System.out.print(head.data+" ");
	}
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(3);
		Node b=new Node(5);
		Node c=new Node(1);
		Node d=new Node(2);
		Node e=new Node(4);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
//		displayReverse(a);
//		Node r=reverse(a);
		Node r=reverseIterative(a);
		display(r);

	}

}

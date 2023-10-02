/**
 * 
 */
package linkedList;

import linkedList.MiddleOfTheLinkedList.Node;

/**
 * @author Rupayan Dirghangi
 *
 */
public class DeleteTheMiddleNode {
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node deleteTheMiddleNode(Node head) {
		if (head.next == null) {// single element list
			return head;
		}
		if(head.next.next==null) {
			head=head.next;
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (fast.next.next.next != null && fast.next.next.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow.next = slow.next.next;
		return head;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(5);
		Node b=new Node(1);
		Node c=new Node(3);
		Node d=new Node(8);
		Node e=new Node(20);
		Node f=new Node(22);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		display(a);
		a=deleteTheMiddleNode(a);
		display(a);

	}

}

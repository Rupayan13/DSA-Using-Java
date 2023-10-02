/**
 * 
 */
package linkedList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MiddleOfTheLinkedList {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static Node middle(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
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
		Node temp=middle(a);
		System.out.println(temp.data);

	}

}

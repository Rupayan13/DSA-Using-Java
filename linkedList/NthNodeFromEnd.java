/**
 * 
 */
package linkedList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class NthNodeFromEnd {
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static Node deleteNthNodeFromEnd(Node head, int n) {
		Node slow=head;
		Node fast=head;
		for(int i=1;i<=n;i++) {
			fast=fast.next;
		}
		if(fast==null) {
			head=head.next;
			return head;
		}
		while(fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		slow.next=slow.next.next;
		return head;
	}
	public static Node nthNodeFromEnd2(Node head, int n) {
		Node slow=head;
		Node fast=head;
		for(int i=1;i<=n;i++) {
			fast=fast.next;
		}
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
	public static Node nthNodeFromEnd(Node head, int n) {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		Node t=head;
		int m=count-n+1;
		//mth node from start
		for(int i=1;i<=m-1;i++) {
			t=t.next;
		}
		return t;
		
	}
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(100);
		Node b=new Node(13);
		Node c=new Node(4);
		Node d=new Node(5);
		Node e=new Node(12);
		Node f=new Node(10);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
//		Node temp=nthNodeFromEnd(a, 4);
//		Node temp1=nthNodeFromEnd2(a, 4);
//		System.out.println(temp.data);
//		System.out.println(temp1.data);
		display(a);
		a=deleteNthNodeFromEnd(a, 6);
		display(a);

	}

}

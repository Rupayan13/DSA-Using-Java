/**
 * 
 */
package linkedList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class doublyLinkedList {
	public static int size(Node head) {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static void insertAt(int idx, int data, Node head) {
		if(idx==0) {
			System.out.println("Go to the insert at head");
			return;
		}
		if(idx==size(head)) {
			insertAtTail(head, data);
		}
		if(idx<0 || idx>size(head)) {
			System.out.println("Invalid input");
			return;
		}
		Node temp=head;
		for(int i=0;i<idx-1;i++) {
			temp=temp.next;
		}
		Node t=new Node(data);
		temp.next.prev=t;
		t.next=temp.next;
		temp.next=t;
		t.prev=temp;
	}
	public static Node insertAtHead(Node head, int data) {
		Node t=new Node(data);
		t.next=head;
		head.prev=t;
		head=t;
		return head;
	}
	public static void insertAtTail(Node head, int data) {
		Node t=new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=t;
		t.prev=temp;
	}
	public static class Node{
		int data;
		Node next;
		Node prev;
		int size;
		Node(int data){
			this.data=data;
		}
	}
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void displayReverse(Node head) {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.println();
	}
	public static void displayRandom(Node a) {
		Node temp=a;
		while(temp.prev!=null) {
			temp=temp.prev;
		}
		display(temp);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(4);
		Node b=new Node(10);
		Node c=new Node(2);
		Node d=new Node(99);
		Node e=new Node(13);
		//next pointers
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		//prev pointers
		e.prev=d;
		d.prev=c;
		c.prev=b;
		b.prev=a;
		display(a);
		displayReverse(a);
		displayRandom(d);
		Node temp=insertAtHead(a, 30);
		display(temp);
		insertAtTail(a, 11);
		display(temp);
		insertAt(2, 300, temp);
		display(temp);
	}

}

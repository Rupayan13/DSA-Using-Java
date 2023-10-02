/**
 * 
 */
package linkedList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Basicsll {
	public static void insertAtEnd(Node head, int val) {
		Node temp=new Node(val);
		Node t=head;
		while(t.next!=null) {
			t=t.next;
		}
		t.next=temp;
	}
	public static int length(Node head) {
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static void displayRecursion(Node head) {
		//base case
		if(head==null) {
			return;
		}
		//self work
		System.out.print(head.data+" ");
		//recursive work
		displayRecursion(head.next);
	}
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static class Node{
		int data;//value
		Node next;//address of next node
		Node(int data){
			this.data=data;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(5);//head node
//		System.out.println(a.next);//null
		Node b=new Node(3);
		Node c=new Node(9);
		Node d=new Node(8);
		Node e=new Node(16);
		Node f=new Node(23);
		// 5->3->9->8->16
		a.next=b;//5->3
//		System.out.println(b.data);//3
//		System.out.println(a.next.data);//3
//		System.out.println(a.next);//linkedList.Basicsll$Node@3feba861
		b.next=c;//5->3->9
		c.next=d;//5->3->9->8
		d.next=e;//5->3->9->8->16
		e.next=f;
		
		//Displaying Linked List
		System.out.println(a.data);
		System.out.println(a.next.data);
		System.out.println(a.next.next.data);
		System.out.println(a.next.next.next.data);
		System.out.println(a.next.next.next.next.data);
		//Displaying Linked List
		System.out.println("Printing Linked List using For loop");
		Node temp=a;
		for(int i=1;i<=5;i++) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		//Displaying Linked List
		System.out.println("\nPrinting Linked List using While loop");
		Node temp1=a;
		while(temp1!=null) {
			System.out.print(temp1.data+" ");
			temp1=temp1.next;
		}
		System.out.println("\nPrinting Linked List using display method");
		display(a);
		System.out.println("\nPrinting Linked List using displayRecursion method");
		displayRecursion(a);
		System.out.println("\nLength of the LinkedList is "+length(a));
		insertAtEnd(a, 87);
		display(a);
		

	}

}

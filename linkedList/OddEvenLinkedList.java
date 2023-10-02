/**
 * 
 */
package linkedList;

import linkedList.Basicsll.Node;

/**
 * @author Rupayan Dirghangi
 *
 */
public class OddEvenLinkedList {
	public static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
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
	//rearranging the odd and even indices 
	public static Node separate(Node head) {
		Node odd=new Node(0);
		Node tempo=odd;
		Node even=new Node(0);
		Node tempe=even;
		Node temp=head;
		while(temp!=null) {
			tempo.next=temp;
			temp=temp.next;
			tempo=tempo.next;
			
			tempe.next=temp;
			temp=temp.next;
			tempe=tempe.next;
		}
		tempo.next=even.next;
		return odd.next;
	}

	public static Node divide(Node head) {
		Node odd = new Node(100);
		Node tempo = odd;
		Node even = new Node(100);
		Node tempe = even;
		Node temp = head;
		while (temp != null) {
			if (temp.data % 2 == 0) {
				Node a = new Node(temp.data);
				tempe.next = a;
				tempe = a;
			} else {
				Node a = new Node(temp.data);
				tempo.next = a;
				tempo = a;
			}
			temp = temp.next;
		}
		tempe.next = odd.next;
		return even.next;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(5);
		Node b = new Node(3);
		Node c = new Node(9);
		Node d = new Node(8);
		Node e = new Node(16);
		Node f = new Node(23);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		display(a);
//		Node temp = divide(a);
		Node temp=separate(a);
		display(temp);
	}

}

/**
 * 
 */
package linkedList;

import linkedList.NthNodeFromEnd.Node;

/**
 * @author Rupayan Dirghangi
 *
 */
public class IntersectionOfTwoLinkedList {
	public static Node intersection(Node aHead, Node bHead) {
		Node t1 = aHead;
		Node t2 = bHead;
		int aSize = 0;
		int bSize = 0;
		while (t1 != null) {
			aSize++;
			t1 = t1.next;
		}
		while (t2 != null) {
			bSize++;
			t2 = t2.next;
		}
		t1 = aHead;
		t2 = bHead;
		if (aSize > bSize) {
			for (int i = 1; i <= Math.abs(aSize - bSize); i++) {
				t1 = t1.next;
			}
		} else if (aSize < bSize) {
			for (int i = 1; i <= Math.abs(aSize - bSize); i++) {
				t2 = t2.next;
			}
		}
		while (t1 != t2) {
			t1 = t1.next;
			t2 = t2.next;
		}
		return t1;
	}

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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a1 = new Node(87);
		Node a2 = new Node(100);
		Node a3 = new Node(13);
		Node a4 = new Node(4);
		Node a5 = new Node(5);
		Node a6 = new Node(12);
		Node a7 = new Node(10);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;

		Node b1 = new Node(90);
		Node b2 = new Node(9);
		b1.next = b2;
		b2.next = a5;
		display(a1);
		display(b1);
		Node temp = intersection(a1, b1);
		System.out.println(temp.data);

	}

}

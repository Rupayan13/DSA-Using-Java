/**
 * 
 */
package linkedList;

import linkedList.ReverseList.Node;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Palindrome {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node after = null;
		while (curr != null) {
			after = curr.next;
			curr.next = prev;
			prev = curr;
			curr = after;
		}
		return prev;
	}

	public static boolean isPlaindrome(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node temp = reverse(slow.next);
		slow.next = temp;
		Node p1 = head;
		Node p2 = slow.next;
		while (p2 != null) {
			if (p1.data != p2.data) {
				return false;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(2);
		Node e = new Node(1);
//		Node f = new Node(1);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
//		e.next = f;
		System.out.println(isPlaindrome(a));

	}

}

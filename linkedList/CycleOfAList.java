/**
 * 
 */
package linkedList;

import linkedList.DeleteTheMiddleNode.Node;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CycleOfAList {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static Node cycleList(Node head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null) {
			if (slow == null) {
				return null;
			}
			slow = slow.next;
			if (fast.next == null) {
				return null;
			}
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		Node temp = head;
		while (slow != temp) {
			temp = temp.next;
			if (slow == null) {
				return null;
			}
			slow = slow.next;
		}
		return slow;
	}

	public static boolean hasCycle(Node head) {
		if (head == null) {
			return false;
		}
		if (head.next == null) {
			return false;
		}
		Node slow = head;
		Node fast = head;
		while (fast != null) {
			if (slow == null) {
				return false;
			}
			slow = slow.next;
			if (fast.next == null) {
				return false;
			}
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(3);
		Node b = new Node(2);
		Node c = new Node(0);
		Node d = new Node(-4);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = b;
		System.out.println(hasCycle(a));
		Node temp=cycleList(a);
		System.out.println(temp.data);
	}

}

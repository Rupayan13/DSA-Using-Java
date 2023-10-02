/**
 * 
 */
package linkedList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Implementation {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static class linkedlist {
		Node head = null;
		Node tail = null;
		int size=0;

		void insertAtEnd(int val) {
			Node temp = new Node(val);
			if (head == null) {// Empty List
				head = temp;
//				tail=temp;
			} else {// Non empty List
				tail.next = temp;
//				tail=temp;
			}
			tail = temp;
			size++;
		}

		void insertAtHead(int val) {
			Node temp = new Node(val);
			if (head == null) {// Empty List
				head = temp;
				tail = temp;
			} else {// Non empty List
				temp.next = head;
				head = temp;
			}
			size++;
		}

		void insertAt(int idx, int val) {
			Node t = new Node(val);
			Node temp = head;
			if(idx==size()) {
				insertAtEnd(val);
				return;
			}
			if(idx==0) {
				insertAtHead(val);
				return;
			}
			else if(idx<0 || idx>size()) {
				System.out.println("Wrong Index");
				return;
			}
			for (int i = 1; i <= idx - 1; i++) {// temp is traversing to the index-1
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
			size++;
		}
		void deleteAt(int idx) {
			//delete head index
			if(idx==0) {
				head=head.next;
				size--;
				return;
			}
			Node temp=head;
			for(int i=1;i<=idx-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
			//delete tail index
			if(idx==size-1) {
				tail=temp;
			}
			size--;
		}
		int getAt(int idx) {
			if(idx<0 || idx>size()) {
				System.out.println("Wrong Index");
				return -1;
			}
			Node temp=head;
			for(int i=0;i<idx;i++) {
				temp=temp.next;
			}
			return temp.data;
		}

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		int size() {
			int count = 0;
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist ll = new linkedlist();
		ll.insertAtEnd(4);// 4
		ll.display();
		ll.insertAtEnd(5);// 4 5
		ll.display();
//		System.out.println("\n" + ll.size());
		ll.insertAtEnd(12);
		ll.display();
		ll.insertAtHead(11);
		ll.display();
		ll.insertAt(2, 10);
		ll.display();
		System.out.println(ll.getAt(0));
		System.out.println(ll.size);
		ll.deleteAt(2);
		ll.display();

	}

}

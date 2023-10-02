/**
 * 
 */
package queue;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LinkedListImplementation {
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static class Queue{
		Node head=null;
		Node tail=null;
		int size=0;
		public void add(int data) {
			Node temp=new Node(data);
			if(size==0) {
				head=tail=temp;
			}
			else {
				tail.next=temp;
				tail=temp;
			}
			size++;
		}
		public int peek() {
			if(size==0) {
				System.out.println("Queue is empty");
				return -1;
			}
			return head.data;
		}
		public int remove() {
			if(size==0) {
				System.out.println("Queue is empty");
				return -1;
			}
			int x=head.data;
			head=head.next;
			size--;
			return x;
		}
		public void display() {
			if(size==0) {
				System.out.println("Queue is empty");
				return;
			}
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		public boolean isEmpty() {
			if(size==0) {
				return true;
			}
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.display();
		System.out.println(q.size);
		System.out.println(q.isEmpty());
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.display();
		System.out.println(q.peek());
		q.remove();
		q.display();
		System.out.println(q.isEmpty());

	}

}

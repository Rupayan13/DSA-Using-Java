/**
 * 
 */
package stacks;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LinkedListImplementation {
	public static class Node{//user define data type
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static class Stack{//user define data structure
		private Node head=null;
		private int size=0;
		void push(int data) {
			Node temp=new Node(data);
			temp.next=head;
			head=temp;
			size++;
		}
		int pop() {
			if(head==null) {
				System.out.println("Stack is Empty");
				return -1;
			}
			else {
				int x=head.data;
				head=head.next;
				return x;
			}
		}
		int peek() {
			if(head==null) {
				System.out.println("Stack is Empty");
				return -1;
			}
			else {
				int x=head.data;
				return x;
			}
		}
		void displayRec(Node h) {
			//base case
			if(h==null) {
				return;
			}
			//recursive work
			displayRec(h.next);
			//self work
			System.out.print(h.data+" ");
		}
		void display() {
			displayRec(head);
			System.out.println();
		}
		void displayReverse() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		int size() {
			return size;
		}
		boolean isEmpty() {
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
		Stack st=new Stack();
		st.push(4);
		st.display();
		st.push(5);
		st.display();
		st.push(1);
		st.display();//4 5 1
		System.out.println(st.size());
		st.pop();
		st.display();
		System.out.println(st.size());


	}

}

/**
 * 
 */
package stacks;


/**
 * @author Rupayan Dirghangi
 *
 */
public class ArrayImplementation {
	public static class Stack{
		private int arr[]=new int[5];
		private int idx=0;
		void push(int x) {
			if(isFull()) {
				System.out.println("Stack is Full.");
				return;
			}
			arr[idx]=x;
			idx++;
		}
		int peek() {
			if(idx==0) {
				System.out.println("Stack is Empty.");
				return -1;
			}
			return arr[idx-1];
		}
		int pop() {
			if(idx==0) {
				System.out.println("Stack is Empty.");
				return -1;
			}
			int top=arr[idx-1];
			arr[idx-1]=0;
			idx--;
			return top;
		}
		void display() {
			for(int i=0;i<=idx-1;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		int size() {
			return idx;
		}
		boolean isEmpty() {
			if(size()==0) {
				return true;
			}
			else {
				return false;
			}
		}
		boolean isFull() {
			if(idx==arr.length) {
				return true;
			}
			else {
				return false;
			}
		}
		int capacity() {
			return arr.length;
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

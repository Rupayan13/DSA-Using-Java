/**
 * 
 */
package queue;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ArrayImplementation {
	public static class Queue {
		int f = -1;
		int r = -1;
		int size = 0;
		int arr[] = new int[100];

		public void add(int val) {
			if (r == arr.length - 1) {
				System.out.println("queue is full");
				return;
			}
			if (f == -1) {
				f = r = 0;
				arr[r] = val;
			} else {
				arr[++r] = val;
			}
			size++;
		}

		public int remove() {
			if (size == 0) {
				System.out.println("queue is empty");
				return -1;
			}
			int x = arr[f];
			f++;
			size--;
			return x;
		}

		public int peek() {
			if (size == 0) {
				System.out.println("queue is empty");
				return -1;
			}
			return arr[f];
		}

		public boolean isEmpty() {
			if (size == 0) {
				return true;
			}
			return false;
		}

		public void display() {
			if (size == 0) {
				System.out.println("queue is empty");
				return;
			}
			for (int i = f; i <= r; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.display();
		q.remove();
		q.display();
		System.out.println(q.peek());

	}

}

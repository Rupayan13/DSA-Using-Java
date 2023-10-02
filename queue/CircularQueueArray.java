/**
 * 
 */
package queue;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CircularQueueArray {
	public static class CircularQueue{
		int f=-1;
		int r=-1;
		int size=0;
		int arr[]=new int[5];
		public void add(int data) throws Exception{
			if(size==arr.length) {
				throw new Exception("Queue is full!");
			}
			else if(size==0) {
				f=r=0;
				arr[0]=data;
			}
			else if(r<arr.length-1) {
				arr[++r]=data;
			}
			else if(r==arr.length-1) {
				arr[0]=data;
				r=0;
			}
			size++;
		}
		public int remove() throws Exception{
			if(size==0) {
				throw new Exception("Queue is empty!");
			}
			else if(f<arr.length-1) {
				int x=arr[f];
				f++;
				size--;
				return x;
			}
			else if(f==arr.length-1) {
				int x=arr[f];
				f=0;
				size--;
				return x;
			}
			return -1;
			
		}
		public int peek() throws Exception{
			if(size==0) {
				throw new Exception("Queue is empty!");
			}
			else {
				return arr[f];
			}
		}
		public boolean isEmpty(){
			if(size==0) {
				return true;
			}
			return false;
		}
		public void display() {
			if(size==0) {
				System.out.println("Queue is empty!");
				return;
			}
			else if(f<=r) {
				for (int i = f; i <= r; i++) {
					System.out.print(arr[i] + " ");
				}
			}
			else if(r<f) {
				for (int i = f; i <= arr.length-1; i++) {
					System.out.print(arr[i] + " ");
				}
				for(int i=0;i<=r;i++) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CircularQueue q=new CircularQueue();
		q.display();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.display();
		q.remove();
		q.display();
		q.add(6);
		q.display();
		System.out.println(q.peek());
//		q.add(7);
		for(int i=0;i<q.arr.length;i++) {
			System.out.print(q.arr[i]+" ");
		}

	}

}

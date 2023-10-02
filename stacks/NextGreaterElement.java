/**
 * 
 */
package stacks;

import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class NextGreaterElement {
	public static int[] nextGreaterElement(int arr[]) {
		int n=arr.length;
		Stack<Integer> st=new Stack<>();
		int res[]=new int[n];
		res[n-1]=-1;
		st.push(arr[n-1]);
		for(int i=n-2;i>=0;i--) {
			while(st.size()>0 && st.peek()<arr[i]) {
				st.pop();
			}
			if(st.size()==0) {
				res[i]=-1;
			}
			else {
				res[i]=st.peek();
			}
			st.push(arr[i]);
		}
		return res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 3, 2, 1, 8, 6, 3, 4};
//		int res[]=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			res[i]=-1;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j]>arr[i]) {
//					res[i]=arr[j];
//					break;
//				}
//			}
//		}
		
		int res[]=nextGreaterElement(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}

}

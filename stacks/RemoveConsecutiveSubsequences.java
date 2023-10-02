/**
 * 
 */
package stacks;

import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RemoveConsecutiveSubsequences {
	public static int[] remove(int arr[]) {
		int n=arr.length;
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<n;i++) {
			if(st.size()==0 || st.peek()!=arr[i]) {
				st.push(arr[i]);
			}
			else if(arr[i]==st.peek()) {
				if(i==n-1 || arr[i]!=arr[i+1]) {
					st.pop();
				}
			}
		}
		int res[]=new int[st.size()];
		int m=res.length;
		for(int i=m-1;i>=0;i--) {
			res[i]=st.pop();
		}
		return res;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 2 , 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
		int[] res=remove(arr);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}

}
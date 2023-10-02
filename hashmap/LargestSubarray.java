/**
 * 
 */
package hashmap;

import java.util.HashMap;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LargestSubarray {
	public static int zeroSumLargestSubarray(int arr[], int n) {
		HashMap<Integer, Integer> mp=new HashMap<>();
		int maxLen=0, prefSum=0;
		mp.put(0, -1);
		for(int i=0;i<arr.length;i++) {
			prefSum+=arr[i];
			if(mp.containsKey(prefSum)) {
				maxLen=Math.max(maxLen, i-mp.get(prefSum));
			}else {
				mp.put(prefSum, i);
			}
		}
		return maxLen;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15, 2, -2, -8, 1, 7, 10, 23};
		System.out.println(zeroSumLargestSubarray(arr, arr.length));

	}

}

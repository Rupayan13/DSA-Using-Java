/**
 * 
 */
package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MaxFrequency {
	public static int maxFrequency(int arr[]) {
		Map<Integer, Integer> freq=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!freq.containsKey(arr[i])) {
				freq.put(arr[i], 1);
			}
			else {
				freq.put(arr[i], freq.get(arr[i])+1);
			}
		}
		int maxFreq=-1;
		int ansKey=-1;
		for(var e: freq.entrySet()) {
			if(maxFreq<e.getValue()) {
				maxFreq=e.getValue();
				ansKey=e.getKey();
			}
		}
		return ansKey;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[]= {1, 3, 2, 1, 4, 1};
		System.out.println(maxFrequency(arr));
		

	}

}

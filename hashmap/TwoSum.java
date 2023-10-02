/**
 * 
 */
package hashmap;

import java.util.HashMap;

/**
 * @author Rupayan Dirghangi
 *
 */
public class TwoSum {
	public static int[] twoSum2(int[] nums, int target) {
		int n=nums.length;
		int ans[]= {-1};
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(nums[j]+nums[i]==target) {
					ans=new int[] {i, j};
					return ans;
				}
			}
		}
		return ans;
	}
	public static int[] twoSum(int[] nums, int target) {
		int n=nums.length;
		int ans[]= {-1};
		//value , index
		HashMap<Integer, Integer> mp=new HashMap<>();
		for(int i=0;i<n;i++) {
			int partner=target-nums[i];
			if(mp.containsKey(partner)) {
				ans=new int[] {i, mp.get(partner)};
				return ans;
			}
			mp.put(nums[i], i);
		}
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 5, 7, -1};
		int target=6;
		int ans[]=twoSum(arr, target);
		for(Integer i: ans) {
			System.out.print(i+" ");
		}
		

	}

}

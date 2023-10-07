/**
 * 
 */
package hashset;

import java.util.HashSet;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LongestConsecutive {
	public static int longestConsecutive(int nums[]) {
		HashSet<Integer> st = new HashSet<>();
		for (int num : nums)
			st.add(num);
		
		int maxStreak=0;

		for (int num : st) {
			if (!st.contains(num - 1)) {// num is the starting point
				int currNum = num;
				int currStreak = 1;// length of current consecutive sequence
				while (st.contains(currNum + 1)) {
					currStreak++;
					currNum++;
				}
				maxStreak=Math.max(currStreak, maxStreak);
			}
		}
		return maxStreak;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(nums));

	}

}

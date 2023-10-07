/**
 * 
 */
package hashset;

import java.util.HashSet;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MaxNumberOnTable {
	public static int maxNumberOnTable(int[] bag) {
		HashSet<Integer> table=new HashSet<>();
		int max=0;
		for(int i=0;i<bag.length;i++) {
			int num=bag[i];
			if(table.contains(num)) {
				table.remove(num);
			}
			else {
				table.add(num);
				max=Math.max(max, table.size());
			}
		}
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2, 1, 1, 3, 2, 3};
		System.out.println(maxNumberOnTable(nums));

	}

}

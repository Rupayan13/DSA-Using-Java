/**
 * 
 */
package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintPermutation {
	public static void printPermutations(String str, String t, List<String> l) {
		if (str.equals("")) {
			l.add(t);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // b
			String left = str.substring(0, i); // a
			String right = str.substring(i + 1); // c
			String rem=left+right;
			printPermutations(rem, t+ch, l);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		List<String> l=new ArrayList<>();
		printPermutations(str, "", l);
		System.out.println(l);

	}

}

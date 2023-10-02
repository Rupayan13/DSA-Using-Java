/**
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Palindrome {
	public static boolean isPalindrom(String s, int l, int r) {
		// base case
		if (l >= r) {
			return true;
		}
		// recursive work
		boolean pal = isPalindrom(s, l+1, r-1);
		// self work
		if (pal == true && s.charAt(r) == s.charAt(l)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (isPalindrom(s, 0, s.length() - 1)) {
			System.out.printf("%s is palindrome.", s);
		} else {
			System.out.printf("%s is not palindrome.", s);
		}

	}

}

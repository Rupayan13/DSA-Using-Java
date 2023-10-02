/**
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseAString {
	public static String reverse(String s, int idx) {
		//base case
		if(idx==s.length()) {
			return "";
		}
		//recursive work
		String ans=reverse(s, idx+1);
		//self work
		return ans+s.charAt(idx);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
//		System.out.println(reverse(s, 0));
		String rev=reverse(s, 0);
		if(rev.equals(s)) {
			System.out.printf("%s is palindrome.", s);
		}
		else{
			System.out.printf("%s is not palindrome.", s);
		}

	}

}

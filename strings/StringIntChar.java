/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class StringIntChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "abc";
		str = str + "def";
		str += 'r';
		str += 10;
		System.out.println(str);
		System.out.println("abc" + "xyz" + 'r' + 10 + 20);
		System.out.println("abc" + "xyz" + 'r' + (10 + 20));

	}

}

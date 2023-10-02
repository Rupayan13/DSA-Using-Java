/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class StringBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		String str="College Wallah";
//		System.out.println(str);
//		String s=sc.next();
//		String s=sc.nextLine();
//		System.out.println(s);
//		String str="Rupayan";
//		int len=str.length();
//		System.out.println(len);
//		char ch=str.charAt(3);
//		System.out.println(ch);
//		System.out.println(str.indexOf(ch));
//		String str1="Rupayan";
//		String str2="Pampa";
//		System.out.println(str1.compareTo(str2));
		String str="Physics Wallah";
		System.out.println(str.contains("allah"));
		System.out.println(str.startsWith("Phy"));
		System.out.println(str.endsWith("ah"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		String s1="abc";
		String s2="def";
		s1=s1.concat(s2);
		System.out.println(s1);

	}

}

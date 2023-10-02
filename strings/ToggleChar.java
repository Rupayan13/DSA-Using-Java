/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ToggleChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder str=new StringBuilder(sc.nextLine());
		System.out.println(str);
		//toggle
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				char ch=(char)(str.charAt(i)+32);
				str.setCharAt(i, ch);
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				char ch=(char)(str.charAt(i)-32);
				str.setCharAt(i, ch);
			}
		}
		System.out.println(str);

	}

}

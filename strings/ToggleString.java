/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ToggleString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				char ch=(char)(str.charAt(i)+32);
				str=str.substring(0, i)+ch+str.substring(i+1);
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				char ch=(char)(str.charAt(i)-32);
				str=str.substring(0, i)+ch+str.substring(i+1);
			}
		}
		System.out.println(str);

	}

}
